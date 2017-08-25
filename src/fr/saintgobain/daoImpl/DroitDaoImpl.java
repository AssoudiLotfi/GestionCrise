package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.entities.Droit;
import fr.saintgobain.dao.DroitDao;
import fr.saintgobain.repositories.DroitRepository;

public class DroitDaoImpl implements DroitDao {
	
	private DroitRepository droitRepository;

	/**
	 * 
	 * @return the Droit List
	 */
	public List<Droit> getAllDroit() {
		return droitRepository.findAll();
	}

	/**
	 * create Droit
	 */
	public void createDroit(Droit droit) {
		droitRepository.save(droit);
	}

	/**
	 * find Droit by id
	 */
	@Override
	public Droit findDroitById(int id) {
		Droit droit = droitRepository.findOne(id);
		return droit;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Droit
	 */
	@Override
	public void deleteDroitById(int id) {
		droitRepository.delete(id);

	}

	// getter
	public DroitRepository getDroitRepository() {
		return droitRepository;
	}

	// setter
	public void setDroitRepository(DroitRepository droitRepository) {
		this.droitRepository = droitRepository;
	}

}
