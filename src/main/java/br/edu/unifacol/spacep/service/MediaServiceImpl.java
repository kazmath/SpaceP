package br.edu.unifacol.spacep.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.unifacol.spacep.domain.Media;
import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.repository.MediaRepository;
import br.edu.unifacol.spacep.utils.Constants;
import br.edu.unifacol.spacep.utils.FactoryMedia;

@Service
public class MediaServiceImpl implements MediaService {

	@Autowired
	private MediaRepository repository; // repository.save(...)

	@Override
	public List<MediaDTO> saveMedia() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String start_date = LocalDate.now().minusDays(6).format(formatter);
		String url = Constants.BASE_URL + "?" +
				"api_key=" + Constants.API_KEY + "&" +
				"start_date=" + start_date + "&" +
				"thumbs=" + "True";

		ParameterizedTypeReference<ArrayList<MediaDTO>> typeRef = new ParameterizedTypeReference<ArrayList<MediaDTO>>() {};
				
		ArrayList<MediaDTO> response = new RestTemplate().exchange(RequestEntity.get(url).build(), typeRef).getBody();
		ArrayList<MediaDTO> responseOut = new ArrayList<MediaDTO>(response);

		if (response == null) {
			throw new Exception("response was null");
		}

		for (MediaDTO mediaDTO : response) {
			Media media = FactoryMedia.build(mediaDTO);

			if (repository.findByDate(media.getDate()).size() == 0) {
				repository.save(media);
			} else {
				responseOut.remove(mediaDTO);
			}
		}
		return responseOut;
	}

	@Override
	public MediaDTO saveAndGetToday() throws Exception {
		String url = Constants.BASE_URL + "?" +
				"api_key=" + Constants.API_KEY + "&" +
				"thumbs=" + "True";

		MediaDTO response = new RestTemplate().exchange(RequestEntity.get(url).build(), MediaDTO.class).getBody();

		if (response == null) {
			throw new Exception("response was null");
		}

		Media media = FactoryMedia.build(response);

		if (repository.findByDate(media.getDate()).size() == 0) {
			repository.save(media);
		}

		return response;
	}

	@Override
	public List<Media> getHistory() {
		ArrayList<Media> output = new ArrayList<Media>();
		
		Stream<LocalDate> last7Days = LocalDate.now()
			.minusDays(6)
			.datesUntil(
				LocalDate.now().plusDays(1)
			);

		last7Days.iterator().forEachRemaining((day) -> {
			// Media dayMedia = null;
			if (repository.findByDate(day).size() != 0) {
				output.add(repository.findByDate(day).get(0));
			} else {
				output.add(null);
			}
		});

		return output;
	}

}
