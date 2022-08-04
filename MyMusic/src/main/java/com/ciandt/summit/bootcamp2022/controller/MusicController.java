package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;


@RestController
@RequestMapping("/api/v1/music")
public class MusicController {


    @Autowired
    MusicService musicService;

    @GetMapping("/musicas")
    public ResponseEntity<?> get(@RequestParam("nome") String nomeArtista) {
        return musicService.BuscarMusica(nomeArtista);
    }

        @PostMapping(
            value = "/playlists/musicas",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> addAll(@RequestParam("playlistId") String playlistId, @RequestBody List<Musica> payload) {
//        return ResponseEntity.ok(musicService.addMusicsByPlaylistId(playlistId, payload)); //todo fazer a camada service para validar dados e add no banco
        LOGGER.info("Playlist id: " + playlistId);
        return ResponseEntity.ok().body(payload);
    }
}
//    @PutMapping("/playlists/{playlistId}/musicas")
//    public ResponseEntity<String> addAll(@RequestParam String playlistId) {
//
//        //add some logic here
//        return ResponseEntity.ok(musicRepository.get(query));
//    }
//
//    @DeleteMapping("/api/playlists/{playlistId}/musicas/{musicaId}")
//    public ResponseEntity<String> addAll( @RequestParam String playlistId,
//                                          @RequestParam String musicaId) {
//        //add some logic here
//        return ResponseEntity.ok(musicRepository.get(query));
//    }

