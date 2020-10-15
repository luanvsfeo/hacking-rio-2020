package com.mytour.hackingrio.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private UUID uuid;

    @Column
    private int pontos;


    @Transient
    private Collection<Lugar> historicoCheckIns;

    //private String genero;
    //private String sexo;


    public void adicionarPontuacao(int pontos){
        this.pontos = this.pontos + pontos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Collection<Lugar> getHistoricoCheckIns() {
        return historicoCheckIns;
    }

    public void setHistoricoCheckIns(Collection<Lugar> historicoCheckIns) {
        this.historicoCheckIns = historicoCheckIns;
    }
}
