package com.ciandt.summit.bootcamp2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MusicasRepository extends JpaRepository<Musica, String> {
    List<Musica> findByNomeContainingIgnoreCase(String nome);
    List<Musica> findByArtistas(Artistas artistas);
    }
