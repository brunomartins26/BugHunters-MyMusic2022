package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/music")
public class MusicController {
                                   //todo verificar o uso do lombok
    //todo add Log de erro para o client visualizar

    @Autowired
    MusicService musicService;

    @GetMapping("/musicas")
    public ResponseEntity<?> get(@RequestParam("nome") String nomeArtista) {
        return musicService.BuscarMusica(nomeArtista);
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

