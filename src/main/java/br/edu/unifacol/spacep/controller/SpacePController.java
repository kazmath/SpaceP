package br.edu.unifacol.spacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.unifacol.spacep.dto.ImagesDTO;
import br.edu.unifacol.spacep.service.ImgService;

@RestController
@RequestMapping("/image")
public class SpacePController {
	
    @Autowired
    private ImgService service;

	public ImagesDTO getImages(@PathVariable String test) {
		String url = "https://www.example.org/";
		RestTemplate restTemplate = new RestTemplate();
		ImagesDTO response = restTemplate.getForObject(url, ImagesDTO.class);
		return response;
	}
}
