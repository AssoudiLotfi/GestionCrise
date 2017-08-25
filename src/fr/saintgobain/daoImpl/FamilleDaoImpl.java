package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.FamilleDao;
import fr.saintgobain.entities.Famille;
import fr.saintgobain.repositories.FamilleRepository;

public class FamilleDaoImpl implements FamilleDao {
	
	private FamilleRepository familleRepository;

	/**
	 * 
	 * @return the Famille List
	 */
	public List<Famille> getAllFamille() {
		return familleRepository.findAll();
	}

	/**
	 * create Famille
	 */
	public void createFamille(Famille famille) {
		familleRepository.save(famille);
	}

	/**
	 * find Famille by id
	 */
	@Override
	public Famille findFamilleById(int id) {
		Famille famille = familleRepository.findOne(id);
		return famille;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Famille
	 */
	@Override
	public void deleteFamilleById(int id) {
		familleRepository.delete(id);

	}

	// getter
	public FamilleRepository getFamilleRepository() {
		return familleRepository;
	}

	// setter
	public void setFamilleRepository(FamilleRepository familleRepository) {
		this.familleRepository = familleRepository;
	}

}
