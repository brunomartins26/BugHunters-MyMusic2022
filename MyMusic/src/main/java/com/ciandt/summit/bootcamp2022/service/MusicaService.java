package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;


    public List<Musica> BuscarMusica(String idArtista) {
        return musicaRepository.BuscarMusica(idArtista);
    }
}
