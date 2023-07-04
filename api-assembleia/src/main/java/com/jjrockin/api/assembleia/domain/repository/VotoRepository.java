package com.jjrockin.api.assembleia.domain.repository;

import com.jjrockin.api.assembleia.domain.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, Long> {
}
