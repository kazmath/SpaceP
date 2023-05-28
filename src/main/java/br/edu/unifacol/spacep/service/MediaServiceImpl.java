package br.edu.unifacol.spacep.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
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
	public MediaDTO[] saveMedia() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String start_date = LocalDate.now().minusDays(6).format(formatter);
		String url = Constants.endpoint			+ "?" +
			"api_key="		+ Constants.api_key	+ "&" +
			"start_date="	+ start_date		+ "&" +
			"thumbs="		+ "True";

		RestTemplate restTemplate = new RestTemplate();
		MediaDTO[] response = restTemplate.getForObject(url, MediaDTO[].class);

		if (response == null) {
			throw new Exception("response was null");
		}

		for (MediaDTO mediaDTO : response) {
			Media media = FactoryMedia.build(mediaDTO);
			
			if (repository.findByDate(media.getDate()).size() == 0) {
				repository.save(media);
			}
		}
		return response;
	}

}
