package com.mytour.hackingrio.domain;

import com.mytour.hackingrio.domain.ApiObjects.Aviationstack.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "voo")
public class Voo {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String iata;

    @Column
    private String numero;

    @Column
    private String icao;

    @Column
    private String nomeAeroportoOrigem;

    @Column
    private String siglaAeroportoOrigem;

    @Column
    private String terminalOrigem;

    @Column
    private String portaoOrigem;

    @Column
    private Date estimadaOrigem;

    @Column
    private String nomeAeroportoDestino;

    @Column
    private String siglaAeroportoDestino;

    @Column
    private String terminalDestino;

    @Column
    private String portaoDestino;

    @Column
    private Date estimadaDestino;

    @Column
    private String nomeCompanhiaAerea;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Itinerario> itinerarios;


    public Voo() {}

    public Voo(Data data) {
        this.iata = data.getFlight().getIata();
        this.numero =  data.getFlight().getNumber();
        this.icao =  data.getFlight().getIcao();
        this.nomeAeroportoOrigem = data.getArrival().getAirport();
        this.siglaAeroportoOrigem = data.getArrival().getIata();
        this.terminalOrigem = data.getArrival().getTerminal().toString();
        this.portaoOrigem =  data.getArrival().getGate() != null ? data.getArrival().getGate().toString() : null ;
        this.estimadaOrigem = data.getArrival().getEstimated();
        this.nomeAeroportoDestino = data.getDeparture().getAirport();;
        this.siglaAeroportoDestino = data.getDeparture().getIata();
        this.terminalDestino = data.getDeparture().getTerminal().toString();
        this.portaoDestino = data.getDeparture().getGate() != null ? data.getDeparture().getGate().toString() : null ;
        this.estimadaDestino = data.getDeparture().getEstimated();
        this.nomeCompanhiaAerea = data.getAirline().getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getNomeAeroportoOrigem() {
        return nomeAeroportoOrigem;
    }

    public void setNomeAeroportoOrigem(String nomeAeroportoOrigem) {
        this.nomeAeroportoOrigem = nomeAeroportoOrigem;
    }

    public String getSiglaAeroportoOrigem() {
        return siglaAeroportoOrigem;
    }

    public void setSiglaAeroportoOrigem(String siglaAeroportoOrigem) {
        this.siglaAeroportoOrigem = siglaAeroportoOrigem;
    }

    public String getTerminalOrigem() {
        return terminalOrigem;
    }

    public void setTerminalOrigem(String terminalOrigem) {
        this.terminalOrigem = terminalOrigem;
    }

    public String getPortaoOrigem() {
        return portaoOrigem;
    }

    public void setPortaoOrigem(String portaoOrigem) {
        this.portaoOrigem = portaoOrigem;
    }

    public Date getEstimadaOrigem() {
        return estimadaOrigem;
    }

    public void setEstimadaOrigem(Date estimadaOrigem) {
        this.estimadaOrigem = estimadaOrigem;
    }

    public String getNomeAeroportoDestino() {
        return nomeAeroportoDestino;
    }

    public void setNomeAeroportoDestino(String nomeAeroportoDestino) {
        this.nomeAeroportoDestino = nomeAeroportoDestino;
    }

    public String getSiglaAeroportoDestino() {
        return siglaAeroportoDestino;
    }

    public void setSiglaAeroportoDestino(String siglaAeroportoDestino) {
        this.siglaAeroportoDestino = siglaAeroportoDestino;
    }

    public String getTerminalDestino() {
        return terminalDestino;
    }

    public void setTerminalDestino(String terminalDestino) {
        this.terminalDestino = terminalDestino;
    }

    public String getPortaoDestino() {
        return portaoDestino;
    }

    public void setPortaoDestino(String portaoDestino) {
        this.portaoDestino = portaoDestino;
    }

    public Date getEstimadaDestino() {
        return estimadaDestino;
    }

    public void setEstimadaDestino(Date estimadaDestino) {
        this.estimadaDestino = estimadaDestino;
    }

    public String getNomeCompanhiaAerea() {
        return nomeCompanhiaAerea;
    }

    public void setNomeCompanhiaAerea(String nomeCompanhiaAerea) {
        this.nomeCompanhiaAerea = nomeCompanhiaAerea;
    }

    public List<Itinerario> getItinerarios() {
        return itinerarios;
    }

    public void setItinerarios(List<Itinerario> itinerarios) {
        this.itinerarios = itinerarios;
    }
}
