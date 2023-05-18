package br.edu.unifacol.spacep.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "imagem")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	@Column(name = "hdurl")
	private String hdurl;

	@OneToOne(mappedBy = "image")
    private Media media;

}
