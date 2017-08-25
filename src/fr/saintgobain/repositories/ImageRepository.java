package fr.saintgobain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.saintgobain.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {

}