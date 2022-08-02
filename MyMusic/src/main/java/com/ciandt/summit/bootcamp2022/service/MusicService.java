package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.repository.ArtistRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MusicService { //todo trazer a regra de negocio dentro da service / criar metodo para encontrar artista e musica

    @Autowired
    private MusicRepository musicRepository;
    @Autowired
    private ArtistRepository artistRepository;

    public ResponseEntity<?> BuscarMusica(String filtro) {
        if (filtro.isEmpty()){
            return ResponseEntity.noContent().build();
        } else if (filtro.length() < 2) {
            return ResponseEntity.badRequest().body("A busca deve conter ao menos 2 caracteres");
        } else
            return ResponseEntity.ok(musicRepository.BuscarMusica(filtro));
    }
}

