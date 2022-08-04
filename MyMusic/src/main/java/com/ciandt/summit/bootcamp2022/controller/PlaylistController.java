package com.ciandt.summit.bootcamp2022.controller;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.entity.PlayList;
import com.ciandt.summit.bootcamp2022.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/playlists")
public class PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @PostMapping(
            value = "/{playlistId}/musicas")
    public ResponseEntity<PlayList> addAll(@PathVariable String playlistId, @RequestBody Musica payload) {

        return ResponseEntity.ok().body(playlistService.addMusicsByPlaylistId(playlistId, payload));
    }
}