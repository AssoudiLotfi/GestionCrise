package fr.saintgobain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.saintgobain.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
