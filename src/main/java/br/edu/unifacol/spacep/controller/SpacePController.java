package br.edu.unifacol.spacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.repository.MediaRepository;
import br.edu.unifacol.spacep.service.MediaService;

@RestController
@RequestMapping("/images")
public class SpacePController {

	@Autowired
	private MediaService service;

	@GetMapping("/all")
	public ResponseEntity<MediaDTO[]> getImagesAll() {
		// TODO: Adicionar endpoint correto
		// Astronomy Picture of the Day
		MediaDTO[] nasaAPOD = service.exibirImagem("https://api.nasa.gov/planetary/apod?api_key=**API_KEY**&start_date=2023-04-14&thumbs=True");
		// return new ResponseEntity<>(nasaAPOD, HttpStatus.OK);
		return ResponseEntity
				.ok(nasaAPOD);
	}

	// @GetMapping
	// public MediaDTO getImages() {
	// MediaDTO nasaAPOD = this.repository; // Astronomy Picture of the Day
	// return nasaAPOD;
	// }

	@GetMapping("/hello")
	public String welcome() {
		return "Hello World";
	}

	// public ImagesDTO getImages(@PathVariable String test) {
	// String url = "https://www.example.org/";
	// RestTemplate restTemplate = new RestTemplate();
	// ImagesDTO response = restTemplate.getForObject(url, ImagesDTO.class);
	// return response;
	// }
}
