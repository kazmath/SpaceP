package br.edu.unifacol.spacep.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacol.spacep.domain.Media;
import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.service.MediaService;

@RestController
@RequestMapping("/media")
public class SpacePController {

	@Autowired
	private MediaService service;

	@GetMapping("/save/{API_KEY}")
	public ResponseEntity<List<MediaDTO>> save(@PathVariable String API_KEY) throws Exception {
		List<MediaDTO> nasaAPOD = service.saveMedia(API_KEY);
		return ResponseEntity.ok(nasaAPOD);
	}

	@GetMapping("/today/{API_KEY}")
	public ResponseEntity<MediaDTO> today(@PathVariable String API_KEY) throws Exception {
		MediaDTO todayMedia = service.saveAndGetToday(API_KEY);
		return ResponseEntity.ok(todayMedia);
	}

	@GetMapping("/history")
	public ResponseEntity<List<Media>> history() throws Exception {
		List<Media> history = service.getHistory();
		return ResponseEntity.ok(history);
	}


}
