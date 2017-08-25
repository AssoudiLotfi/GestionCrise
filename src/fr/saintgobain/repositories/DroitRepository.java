package fr.saintgobain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.saintgobain.entities.Droit;

public interface DroitRepository extends JpaRepository<Droit, Integer> {

}