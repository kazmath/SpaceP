package br.edu.unifacol.spacep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifacol.spacep.dto.ImagesDTO;
import br.edu.unifacol.spacep.repository.ImageRepository;

@Service
public class ImgServiceImpl implements ImgService {

	@Autowired
	private ImageRepository repo;

	@Override
	public ImagesDTO exibirImagem(ImagesDTO imagemdto) {
		
		return null;
	}
	
}
