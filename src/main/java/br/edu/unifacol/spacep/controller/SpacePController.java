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

	@GetMapping("/save/{APIKEY}")
	public ResponseEntity<List<MediaDTO>> save(@PathVariable String APIKEY) throws Exception {
		List<MediaDTO> nasaAPOD = service.saveMedia(APIKEY);
		return ResponseEntity.ok(nasaAPOD);
	}

	@GetMapping("/today/{APIKEY}")
	public ResponseEntity<MediaDTO> today(@PathVariable String APIKEY) throws Exception {
		MediaDTO todayMedia = service.saveAndGetToday(APIKEY);
		return ResponseEntity.ok(todayMedia);
	}

	@GetMapping("/history")
	public ResponseEntity<List<Media>> history() throws Exception {
		List<Media> history = service.getHistory();
		return ResponseEntity.ok(history);
	}


}
