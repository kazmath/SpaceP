package br.edu.unifacol.spacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.service.MediaService;

@RestController
@RequestMapping("/image")
public class SpacePController {
	
    @Autowired
    private MediaService service;

	@PostMapping
	public ResponseEntity<MediaDTO> getImages(@RequestBody MediaDTO imagesDTO) {
		MediaDTO nasaAPOD = service.exibirImagem(imagesDTO); // Astronomy Picture of the Day
		return new ResponseEntity<>(nasaAPOD, HttpStatus.OK);
	}
	// public ImagesDTO getImages(@PathVariable String test) {
	// 	String url = "https://www.example.org/";
	// 	RestTemplate restTemplate = new RestTemplate();
	// 	ImagesDTO response = restTemplate.getForObject(url, ImagesDTO.class);
	// 	return response;
	// }
}
