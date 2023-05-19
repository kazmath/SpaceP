package br.edu.unifacol.spacep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
// import AlgumaException;

import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.repository.MediaRepository;
import br.edu.unifacol.spacep.utils.FactoryMedia;

@Service
public class MediaServiceImpl implements MediaService {

	@Autowired
	private MediaRepository repository; // repository.save(...)

	@Override
	public MediaDTO[] saveMedia(String url) throws Exception {
		// String url = "https://example.org/";
		RestTemplate restTemplate = new RestTemplate();
		MediaDTO[] response = restTemplate.getForObject(url, MediaDTO[].class);

		if (response == null) {
			throw new Exception("response was null");
		}
		
		for (MediaDTO mediaDTO : response) {
			repository.save(FactoryMedia.build(mediaDTO));
		}
		return response;
	}

}
