package fr.saintgobain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.saintgobain.entities.Famille;

public interface FamilleRepository extends JpaRepository<Famille, Integer> {

}