package br.edu.unifacol.spacep.service;

import java.util.List;

import br.edu.unifacol.spacep.dto.MediaDTO;

public interface MediaService {
	List<MediaDTO> saveMedia() throws Exception;
}
