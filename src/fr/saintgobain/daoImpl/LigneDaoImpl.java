package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.LigneDao;
import fr.saintgobain.entities.Ligne;
import fr.saintgobain.repositories.LigneRepository;

public class LigneDaoImpl implements LigneDao {
	
	private LigneRepository ligneRepository;

	/**
	 * 
	 * @return the Ligne List
	 */
	public List<Ligne> getAllLigne() {
		return ligneRepository.findAll();
	}

	/**
	 * create Ligne
	 */
	public void createLigne(Ligne ligne) {
		ligneRepository.save(ligne);
	}

	/**
	 * find Ligne by id
	 */
	@Override
	public Ligne findLigneById(int id) {
		Ligne ligne = ligneRepository.findOne(id);
		return ligne;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Ligne
	 */
	@Override
	public void deleteLigneById(int id) {
		ligneRepository.delete(id);

	}

	// getter
	public LigneRepository getLigneRepository() {
		return ligneRepository;
	}

	// setter
	public void setLigneRepository(LigneRepository ligneRepository) {
		this.ligneRepository = ligneRepository;
	}

}
