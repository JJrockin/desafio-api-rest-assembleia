package com.jjrockin.api.assembleia.domain.repository;

import com.jjrockin.api.assembleia.domain.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
}
