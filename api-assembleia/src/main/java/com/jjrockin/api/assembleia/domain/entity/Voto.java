package com.jjrockin.api.assembleia.domain.entity;

import com.jjrockin.api.assembleia.domain.enumeration.TipoVoto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "VOTO", schema = "DESAFIO_ASSEMBLEIA_VOTOS_API")
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VOTO", nullable = false)
    private Long id;
    @NotNull
    @Column(name = "VOTO")
    @Enumerated(EnumType.STRING)
    private TipoVoto voto;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_ASSOCIADO")
    private Associado associado;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_SESSAO")
    private Sessao sessao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoVoto getVoto() {
        return voto;
    }

    public void setVoto(TipoVoto voto) {
        this.voto = voto;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
