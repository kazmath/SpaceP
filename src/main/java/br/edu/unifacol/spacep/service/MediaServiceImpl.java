package br.edu.unifacol.spacep.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
		String url = Constants.BASE_URL			+ "?" +
			"api_key="		+ Constants.API_KEY	+ "&" +
			"start_date="	+ start_date		+ "&" +
			"thumbs="		+ "True";

		RestTemplate restTemplate = new RestTemplate();

		ParameterizedTypeReference<ArrayList<MediaDTO>> typeRef = new ParameterizedTypeReference<ArrayList<MediaDTO>>() {};
		
		// List<MediaDTO> response = restTemplate.getForObject(url, typeRef.getType().getClass());
		ArrayList<MediaDTO> response = restTemplate.exchange(RequestEntity.get(url).build(), typeRef).getBody();
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

}
