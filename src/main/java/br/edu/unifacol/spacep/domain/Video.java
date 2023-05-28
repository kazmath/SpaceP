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
@Table(name = "video")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long video_id;

	@NonNull
	@Column(name = "thumbnail")
	private String thumbnail;

	@OneToOne(mappedBy = "video")
    private Media media;

	@Override
	public String toString() {
		return "Video [video_id=" + video_id + ", thumbnail=" + thumbnail + "]";
	}

}
