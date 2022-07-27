package com.ciandt.summit.bootcamp2022;

import com.ciandt.summit.bootcamp2022.repository.ArtistasRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicasRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SummitBootcampApplication{

	private final MusicasRepository musicasRepository;
	private final ArtistasRepository artistasRepository;

	public SummitBootcampApplication(MusicasRepository musicasRepository, ArtistasRepository artistasRepository){
		this.musicasRepository = musicasRepository;
		this.artistasRepository = artistasRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(SummitBootcampApplication.class, args);
	}


}
