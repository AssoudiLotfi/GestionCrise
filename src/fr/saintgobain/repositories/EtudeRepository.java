package fr.saintgobain.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.saintgobain.entities.Etude;

public interface EtudeRepository extends JpaRepository<Etude, Integer>{

}