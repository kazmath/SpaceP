package br.edu.unifacol.spacep.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MediaDTO {
	
	private String tipo;
	private String url;
	private String imagem;

	private String title;
	private String expl;
	private String data;
}
