package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.repository.ArtistRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Service
public class MusicService {


    @Autowired
    private MusicRepository musicRepository;
    @Autowired
    private ArtistRepository artistRepository;

    public ResponseEntity<?> BuscarMusica(String nomeArtista) {
        if (nomeArtista.isEmpty()){
            LOGGER.info("Nome de artista invalido ou nao encontrado");
            return ResponseEntity.noContent().build();
        } else if (nomeArtista.length() < 2) {
            LOGGER.info("Nome de artista deve conter ao menos 2 caracteres");
            return ResponseEntity.badRequest().body("A busca deve conter ao menos 2 caracteres");
        } else
            LOGGER.info("Musicas encontradas com sucesso");
            return ResponseEntity.ok(musicRepository.BuscarMusica(nomeArtista));
    }
}

