package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.ArtistaRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class MusicaService { //todo trazer a regra de negocio dentro da service / criar metodo para encontrar artista e musica

    @Autowired
    private MusicaRepository musicaRepository;
    @Autowired
    private ArtistaRepository artistaRepository;

    public ResponseEntity<?> BuscarMusica(String filtro) {
        if (filtro.isEmpty()){
            return ResponseEntity.noContent().build();
        } else if (filtro.length() < 2) {
            return ResponseEntity.badRequest().body("A busca deve conter ao menos 2 caracteres");
        } else
            return ResponseEntity.ok(musicaRepository.BuscarMusica(filtro));
    }
}

