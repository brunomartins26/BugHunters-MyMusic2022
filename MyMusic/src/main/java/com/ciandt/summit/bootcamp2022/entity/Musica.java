package com.ciandt.summit.bootcamp2022.entity;
import javax.persistence.*;

@Entity
@Table(name = "Musicas")
public class Musica  {

    @Id
    private String id;
    @Column
    private String nome;
    @OneToOne
    @JoinColumn(name = "ArtistaId")
    private Artista artista;

    public Musica() {

    }

    public Musica(String id, String nome, String artista) {
        this.id = id;
        this.nome = nome;
        String Artista = artista;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
