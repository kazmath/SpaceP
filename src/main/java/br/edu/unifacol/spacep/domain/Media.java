package br.edu.unifacol.spacep.domain;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

// import javax.persistence.*;

@Entity
@Data
@Builder
@Table(name = "media")
public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long media;

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pk_video", referencedColumnName = "id")
	private Video video;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pk_image", referencedColumnName = "id")
	private Image image;

}
