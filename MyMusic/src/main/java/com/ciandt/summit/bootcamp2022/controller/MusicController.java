package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/musicas")    //todo verificar se API musicas ou no contrato ta pedindo outro endpoint api/v1/music
public class MusicController {     //todo refatorar codigo para ingles
                                   //todo verificar o uso do lombok
    //todo add Log de erro para o client visualizar

    @Autowired
    MusicaService musicaService; //todo refatorar codigo para ingles

    @GetMapping() //todo verificar o endpoint"BUSCAR"
    public ResponseEntity<?> get(@RequestParam("nome") String filtro) { //todo verificar o operador ternario de ? para String
        try {
            if (filtro.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            if (filtro.length() == 1 || filtro.length() < 3) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e){
            throw new RuntimeException("Erro ao filtrar musica");
        }
        return ResponseEntity.ok(musicaService.BuscarMusica(filtro));
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

