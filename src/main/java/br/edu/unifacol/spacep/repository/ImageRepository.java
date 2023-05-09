package br.edu.unifacol.spacep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unifacol.spacep.domain.Images;

@Repository
public interface ImageRepository extends JpaRepository<Images, Long> {
}
