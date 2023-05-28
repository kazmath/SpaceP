package br.edu.unifacol.spacep.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.service.MediaService;

@RestController
@RequestMapping("/media")
public class SpacePController {

	@Autowired
	private MediaService service;

	@GetMapping("/save")
	public ResponseEntity<List<MediaDTO>> getImagesAll() throws Exception {
		List<MediaDTO> nasaAPOD = service.saveMedia();
		return ResponseEntity.ok(nasaAPOD);
	}

}
