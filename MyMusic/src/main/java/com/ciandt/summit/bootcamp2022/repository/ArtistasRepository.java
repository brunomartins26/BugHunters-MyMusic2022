package com.ciandt.summit.bootcamp2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ArtistasRepository extends JpaRepository<Artistas, String>{

    List<Artistas> findByNomeContainingIgnoreCase(String nome);

}