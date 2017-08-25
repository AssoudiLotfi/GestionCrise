package fr.saintgobain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.saintgobain.entities.Ligne;

public interface LigneRepository extends JpaRepository<Ligne, Integer> {

}