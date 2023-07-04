package com.jjrockin.api.assembleia.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "SESSAO", schema = "DESAFIO_ASSEMBLEIA_VOTOS_API")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO", nullable = false)
    private Long id;
    @Column(name = "DATA_HORA_INICIO")
    private LocalDateTime dataHoraInicio;
    @Column(name = "DATA_HORA_FIM")
    private LocalDateTime dataHoraFim;
    @NotNull
    @OneToOne
    @JoinColumn(name = "ID_PAUTA")
    private Pauta pauta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Pauta getPauta() {
        return pauta;
    }

    public void setPauta(Pauta pauta) {
        this.pauta = pauta;
    }
}
