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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "media")
public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long media_id;

	@NonNull
	@Column(name = "title")
	private String title;

	@NonNull
	@Column(name = "media_type")
	private String media_type;

	@NonNull
	@Column(name = "url")
	private String url;

	@NonNull
	@Column(name = "explanation")
	private String explanation;

	@NonNull
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private LocalDate date;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pk_video", referencedColumnName = "video_id")
	private Video video;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pk_image", referencedColumnName = "image_id")
	private Image image;

	@Override
	public String toString() {
		return "Media [" +
				"media_id=" + media_id +
				", title=" + title +
				", media_type=" + media_type +
				", url=" + url +
				", explanation=" + explanation.substring(0, 47) + "..." +
				", date=" + date +
				", video=" + video +
				", image=" + image +
				"]";
	}

}
