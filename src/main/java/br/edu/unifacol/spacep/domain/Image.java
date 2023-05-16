package br.edu.unifacol.spacep.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// import javax.persistence.*;

@Entity
@Data
@Table(name = "imagem")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "media_type")
	private String media_type;

	@Column(name = "url")
	private String url;
	
	@Column(name = "explanation")
	private String explanation;
	
	@Column(name = "date")
	private LocalDate date;

}
