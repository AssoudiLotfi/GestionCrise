	package fr.saintgobain.repositories;
	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.saintgobain.entities.Usine;

	public interface UsineRepository extends JpaRepository<Usine, Integer>{
		@Query(value="select * from usine  where idusine = ?",nativeQuery=true)
		public Usine getUsine(int idUsine);

	}