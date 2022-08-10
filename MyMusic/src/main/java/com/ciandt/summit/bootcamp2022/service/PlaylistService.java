package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.entity.PlayList;
import com.ciandt.summit.bootcamp2022.exceptions.ErrorException;
import com.ciandt.summit.bootcamp2022.repository.MusicRepository;
import com.ciandt.summit.bootcamp2022.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Service
public class PlaylistService {

    @Autowired
    private MusicRepository musicRepository;
    @Autowired
    private PlaylistRepository playListRepository;
    @Autowired
    private MusicService musicService;

    public PlayList addMusicsByPlaylistId(String playlistId, Musica payLoad) {
        PlayList playList = playListRepository.findById(playlistId).orElseThrow(() -> new ErrorException("PlayList not found"));
        Musica musica = musicRepository.findById(payLoad.getId()).orElseThrow(() -> new ErrorException("Song not found"));

        List<Musica> listMusicFilter = playList.getMusica().stream().filter(musica1 -> musica1.equals(musica)).collect(Collectors.toList());
        if (listMusicFilter.size() > 0 ){
            throw new ErrorException("music exists in the playlist");
        }

        playList.getMusica().add(musica);
        playListRepository.save(playList);
        return playList;
    }

    public String removeSongFromPlayList(String playlistId, String musicaId){

        Musica musicFind = musicRepository.findById(musicaId).orElseThrow(() -> new ErrorException("Song not found."));
        PlayList playList = playListRepository.findById(playlistId).orElseThrow(() -> new ErrorException("PlayList not found"));

        List<Musica> musics = playList.getMusica().stream().filter(music -> music.equals(musicFind)).collect(Collectors.toList());

        if(musics.size() < 1){
            throw new ErrorException("PlayList Song not found in playlist.");
        }

        try {
            playList.getMusica().remove(musicFind);
            playListRepository.save(playList);
            return "Song "+musicaId+" removed from playlist successfull.";
        }catch (Exception e){
            return e.getMessage();
        }
    }

}
