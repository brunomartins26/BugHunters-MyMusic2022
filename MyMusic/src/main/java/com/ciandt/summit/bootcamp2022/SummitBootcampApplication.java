package com.ciandt.summit.bootcamp2022;

import com.ciandt.summit.bootcamp2022.repository.ArtistaRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummitBootcampApplication{

	private final MusicaRepository musicaRepository;
	private final ArtistaRepository artistaRepository;

	public SummitBootcampApplication(MusicaRepository musicaRepository, ArtistaRepository artistaRepository){
		this.musicaRepository = musicaRepository;
		this.artistaRepository = artistaRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SummitBootcampApplication.class, args);
	}


}
