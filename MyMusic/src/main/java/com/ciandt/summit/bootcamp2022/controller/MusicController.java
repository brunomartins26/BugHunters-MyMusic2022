package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.sql.Blob;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {

    @Autowired
    MusicaRepository musicaRepository;

    @GetMapping()
    public ResponseEntity<?> get(@RequestParam("nome") String IdArtista) {
        //add some logic here
        return ResponseEntity.ok(musicaRepository.BuscarMusica(IdArtista));
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

