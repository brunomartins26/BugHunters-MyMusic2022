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
<<<<<<< HEAD
    List<Musica> findByNomeContainingIgnoreCase(String nome);
    List<Musica> findByArtistas(Artista artista);
}
=======
    @Query("SELECT m FROM Musica m JOIN Artista a on a.id = m.artista WHERE a.nome like '%'|| :filtro ||'%' or m.nome like '%'|| :filtro ||'%' ORDER by a.nome, m.nome asc")
    List<Musica> BuscarMusica(@Param("filtro") String filtro);
    //todo

}




>>>>>>> 55f1a915c065d55236a9e86350fddfd924352d15
