package com.ciandt.summit.bootcamp2022.model;

public class MusicaDTO {

    private String id;
    private String nome;
    private ArtistasDTO artista;

    public MusicaDTO(String id, String nome, ArtistasDTO artista) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
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

    public ArtistasDTO getArtista() {
        return artista;
    }

    public void setArtistas(ArtistasDTO artista) {
        this.artista = artista;
    }
}