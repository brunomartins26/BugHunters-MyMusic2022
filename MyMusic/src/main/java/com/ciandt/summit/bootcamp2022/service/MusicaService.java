package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.ArtistaRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicaService { //todo trazer a regra de negocio dentro da service / criar metodo para encontrar artista e musica

    @Autowired
    private MusicaRepository musicaRepository;
    @Autowired
    private ArtistaRepository artistaRepository;

    public List<Musica> BuscarMusica(String filtro) {

        return musicaRepository.BuscarMusica(filtro);
    }
}

