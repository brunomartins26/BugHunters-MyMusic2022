package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.controller.MusicController;
import com.ciandt.summit.bootcamp2022.entity.Artista;
import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.ArtistRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;


import java.util.*;

import static org.mockito.BDDMockito.given;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(MusicController.class)
class MusicServiceTest {
    @InjectMocks
    MusicService musicService;
    @Mock
    MusicRepository musicRepository;
    @Mock
    ArtistRepository artistRepository;

    @Test
    void test_findMusic(){
        Musica musica = new Musica();
        musica.setId("67f5976c-eb1e-404e-8220-2c2a8a23be47");
        musica.setNome("Hippy Hippy Shake");

        Artista artista = new Artista();
        artista.setId("32844fdd-bb76-4c0a-9627-e34ddc9fd892");
        artista.setNome("The Beatles");
        musica.setArtista(artista);


        given(artistRepository.findById(artista.getId())).willReturn(Optional.of(artista));

        given(musicRepository.BuscarMusica("The Beatles")).willReturn(Collections.emptyList());

        List<Musica> music = new ArrayList<Musica>();
        assertEquals(music, musicService.BuscarMusica(artista.getNome()));


    }

}
