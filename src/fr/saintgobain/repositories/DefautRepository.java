package fr.saintgobain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.saintgobain.entities.Defaut;

public interface DefautRepository extends JpaRepository<Defaut, Integer> {

	@Query(value="select * from defaut c where c.lot_idlot=?",nativeQuery=true)
	public List<Defaut> getDefautByLot(int idLot);
}
