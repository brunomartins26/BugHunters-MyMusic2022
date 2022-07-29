package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.websocket.server.PathParam;
import java.sql.Blob;

@RestController
@RequestMapping("/api/musicas")
public class MusicController {

    @Autowired
    MusicaRepository musicaRepository;

<<<<<<< HEAD
    @GetMapping("/{query}")
    public ResponseEntity<List<Musica>> get(@RequestParam String query) {
        return ResponseEntity.ok(musicaRepository.findAll());
=======
    @GetMapping()
    public ResponseEntity<?> get(@RequestParam("nome") String IdArtista) {
        //add some logic here
        return ResponseEntity.ok(musicaRepository.BuscarMusica(IdArtista));
>>>>>>> 55f1a915c065d55236a9e86350fddfd924352d15
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

