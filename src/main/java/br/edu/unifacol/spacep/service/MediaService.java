package br.edu.unifacol.spacep.service;

import br.edu.unifacol.spacep.dto.MediaDTO;

public interface MediaService {
	MediaDTO[] saveMedia(String url) throws Exception;
}
