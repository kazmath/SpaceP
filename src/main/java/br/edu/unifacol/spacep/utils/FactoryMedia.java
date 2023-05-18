package br.edu.unifacol.spacep.utils;

import java.time.LocalDate;


import br.edu.unifacol.spacep.domain.Image;
import br.edu.unifacol.spacep.domain.Media;
import br.edu.unifacol.spacep.domain.Video;
import br.edu.unifacol.spacep.dto.MediaDTO;

public class FactoryMedia {

	
	public static Media build(MediaDTO mediaDTO) {
		Media media = null;
		if (mediaDTO.getMedia_type() == "image") {
			media = Media.builder()
				.title(mediaDTO.getTitle())
				.media_type(mediaDTO.getMedia_type())
				.url(mediaDTO.getUrl())
				.explanation(mediaDTO.getExplanation())
				.date(LocalDate.parse(mediaDTO.getDate()))
				.image(new Image(mediaDTO.getHdurl()))
				.build();

		} else if (mediaDTO.getMedia_type() == "video") {
			media = Media.builder()
				.title(mediaDTO.getTitle())
				.media_type(mediaDTO.getMedia_type())
				.url(mediaDTO.getUrl())
				.explanation(mediaDTO.getExplanation())
				.date(LocalDate.parse(mediaDTO.getDate()))
				.video(new Video(mediaDTO.getThumbnail_url()))
				.build();

		}
		return media;
	}
}
