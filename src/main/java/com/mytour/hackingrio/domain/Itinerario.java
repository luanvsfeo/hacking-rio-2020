package com.mytour.hackingrio.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Itinerario")
public class Itinerario {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long usuarioId;

    @Column
    private Date dataInicio;

    @Column
    private Date dataFim;

    @Column
    private long cidadeId;

    @Column
    private long paisId;


    @ManyToMany(fetch = FetchType.LAZY)
    private List<Voo> voos;


    /*@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Hotel> hoteis;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PassagemOnibus> passagensOnibus;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AluguelCarro> aluguelCarros;*/


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public long getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(long cidadeId) {
        this.cidadeId = cidadeId;
    }

    public long getPaisId() {
        return paisId;
    }

    public void setPaisId(long paisId) {
        this.paisId = paisId;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

    public void atualizar(Itinerario itinerario){
        this.dataFim = itinerario.getDataFim();
        this.dataInicio = itinerario.getDataInicio();
        this.voos = itinerario.getVoos();
    }
}
