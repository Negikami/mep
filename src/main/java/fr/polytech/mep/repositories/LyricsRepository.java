package fr.polytech.mep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.polytech.mep.models.Lyrics;

public interface LyricsRepository extends JpaRepository<Lyrics,Long>{
}