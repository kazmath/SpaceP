package br.edu.unifacol.spacep.service;

import java.util.List;

import br.edu.unifacol.spacep.domain.Media;
import br.edu.unifacol.spacep.dto.MediaDTO;

public interface MediaService {
	List<MediaDTO> saveMedia(String API_KEY) throws Exception;
	MediaDTO saveAndGetToday(String API_KEY) throws Exception;
	List<Media> getHistory();
}
