package com.ciandt.summit.bootcamp2022.repository;

import com.ciandt.summit.bootcamp2022.entity.Artista;
import com.ciandt.summit.bootcamp2022.entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface MusicaRepository extends JpaRepository<Musica, String> {
    @Query("SELECT m FROM Musica m Join Artista a on artista.id = ")
    List<Musica> findByArtistasNomeContainingIgnoreCaseOrderByArtistasNomeAsc(String nomeArtista);
    //todo
}




