package com.mytour.hackingrio.domain;

import com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor.ApiRootObject;
import com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "lugar")
public class Lugar {

    @Id
    private long locationId;

    @Column
    private Date dataCheckin;

    @Column
    private long itinerarioId;

    @Column
    private int pontuacao;

    @Column
    private String nome;

    @Column
    private String cidade;

    @Column
    private String estado;

    @Column
    private String pais;

    @Column
    private String latitude;

    @Column
    private String longitude;

    public Lugar() {
    }

    public Lugar(ApiRootObject apiRootObject) {
        this.locationId = apiRootObject.getLocation_id() != null ? Long.parseLong(apiRootObject.getLocation_id()) : 0L;
        this.nome = apiRootObject.getName();
        this.cidade = apiRootObject.getAddress_obj().getCity();
        this.estado = apiRootObject.getAddress_obj().getState();
        this.pais = apiRootObject.getAddress_obj().getCountry();
    }

    public Lugar(Data data){
        this.locationId = data.getLocation_id() != null ? Long.parseLong(data.getLocation_id()) : 0L;
        this.nome = data.getName();
        this.cidade = data.getAddress_obj().getCity();
        this.estado = data.getAddress_obj().getState();
        this.pais = data.getAddress_obj().getCountry();
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public long getItinerarioId() {
        return itinerarioId;
    }

    public void setItinerarioId(long itinerarioId) {
        this.itinerarioId = itinerarioId;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
