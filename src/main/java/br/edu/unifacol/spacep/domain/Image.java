package br.edu.unifacol.spacep.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// import javax.persistence.*;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "image")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long image_id;

	@NonNull
	@Column(name = "hdurl")
	private String hdurl;

	@OneToOne(mappedBy = "image")
    private Media media;

}
