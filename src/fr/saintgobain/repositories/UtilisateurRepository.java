package fr.saintgobain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.saintgobain.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

	
	@Query(value="select * from utilisateur u where u.login=:userName and u.password=:userPassword",nativeQuery=true)
	Utilisateur isExistUser(@Param("userName") String userName,@Param("userPassword") String userPassword);
}