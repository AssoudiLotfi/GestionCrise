package fr.saintgobain.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.saintgobain.entities.Crise;

public interface CriseRepository extends JpaRepository<Crise, Integer>{
	
	@Query(value="select * from crise  where usine_idusine = ?",nativeQuery=true)
	public List<Crise> getCriseByUsine(int idUsine);
	
	
	
	
}



