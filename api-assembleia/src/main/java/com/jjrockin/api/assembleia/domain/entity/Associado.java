package com.jjrockin.api.assembleia.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ASSOCIADO", schema = "DESAFIO_ASSEMBLEIA_VOTOS_API")
public class Associado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ASSOCIADO", nullable = false)
    private Long id;
    @NotNull
    @Column(name = "CPF")
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
