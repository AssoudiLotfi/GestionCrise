	package fr.saintgobain.repositories;
	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.saintgobain.entities.Lot;

	public interface LotRepository extends JpaRepository<Lot, Integer>{
		
		
		@Query(value="select * from lot  where crise_idcrise = ?",nativeQuery=true)
		public List<Lot> getLotbyCrise(int idCrise);

	}