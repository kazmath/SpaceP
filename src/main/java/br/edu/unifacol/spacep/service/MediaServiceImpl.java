package br.edu.unifacol.spacep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifacol.spacep.dto.MediaDTO;
import br.edu.unifacol.spacep.repository.MediaRepository;

@Service
public class MediaServiceImpl implements MediaService {

	@Autowired
	private MediaRepository repo;

	@Override
	public MediaDTO exibirImagem(MediaDTO imagemdto) {
		
		return null;
	}
	
}
