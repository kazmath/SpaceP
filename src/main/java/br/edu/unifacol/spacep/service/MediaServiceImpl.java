package br.edu.unifacol.spacep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.repository.MediaRepository;

@Service
public class MediaServiceImpl implements MediaService {

	@Autowired
	private MediaRepository repository; // repository.save(...)

	@Override
	public MediaDTO[] exibirImagem(String url) {
		// String url = "https://example.org/";
		RestTemplate restTemplate = new RestTemplate();
		MediaDTO[] response = restTemplate.getForObject(url, MediaDTO[].class);

		return response;
	}

}
