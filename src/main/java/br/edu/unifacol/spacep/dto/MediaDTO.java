package br.edu.unifacol.spacep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MediaDTO {

	private String media_type;
	private String url;
	private String hdurl;

	private String title;
	private String explanation;
	private String date;
	private String thumbnail_url;

}
