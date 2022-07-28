package com.ciandt.summit.bootcamp2022.repository;

import com.ciandt.summit.bootcamp2022.entity.Artista;
import com.ciandt.summit.bootcamp2022.entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Blob;
import java.util.List;


@Repository
public interface MusicaRepository extends JpaRepository<Musica, String> {
    @Query("SELECT m FROM Musica m JOIN m.artista a WHERE a.nome like %:nome%")
    public List<Musica> BuscarMusica(@Param("nome") String nome);
    //todo

    //@Query("SELECT m FROM Musica m")
   // public List<Musica> BuscarMusica ();
}




