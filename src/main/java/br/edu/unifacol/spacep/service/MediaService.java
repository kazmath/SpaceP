package br.edu.unifacol.spacep.service;

import java.util.List;

import br.edu.unifacol.spacep.domain.Media;
import br.edu.unifacol.spacep.dto.MediaDTO;

public interface MediaService {
	List<MediaDTO> saveMedia(String APIKEY) throws Exception;
	MediaDTO saveAndGetToday(String APIKEY) throws Exception;
	List<Media> getHistory();
}
