package br.edu.unifacol.spacep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.unifacol.spacep.domain.Media;
import java.util.List;
import java.time.LocalDate;

public interface MediaRepository extends JpaRepository<Media, Long> {
	List<Media> findByDate(LocalDate date);
}
