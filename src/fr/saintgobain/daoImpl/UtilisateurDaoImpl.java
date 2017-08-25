package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.UtilisateurDao;
import fr.saintgobain.entities.Utilisateur;
import fr.saintgobain.repositories.UtilisateurRepository;
public class UtilisateurDaoImpl implements UtilisateurDao {
	


	private UtilisateurRepository utilisateurRepository;

	/**
	 * 
	 * @return the Utilisateur List
	 */
	public List<Utilisateur> getAllUtilisateur() {
		return utilisateurRepository.findAll();
	}

	/**
	 * create Utilisateur
	 */
	public void createUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.save(utilisateur);
	}

	/**
	 * find Utilisateur by id
	 */
	@Override
	public Utilisateur findUtilisateurById(int id) {
		Utilisateur utilisateur = utilisateurRepository.findOne(id);
		return utilisateur;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Utilisateur
	 */
	@Override
	public void deleteUtilisateurById(int id) {
		utilisateurRepository.delete(id);

	}

	// getter
	public UtilisateurRepository getUtilisateurRepository() {
		return utilisateurRepository;
	}

	// setter
	public void setUtilisateurRepository(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository = utilisateurRepository;
	}
	
	
	public Utilisateur login(String userName,String userPassword){
		
		Utilisateur utilisateur=this.utilisateurRepository.isExistUser(userName,userPassword);
		
		return utilisateur;
		
	}

}
