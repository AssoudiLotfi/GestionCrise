package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.UsineDao;
import fr.saintgobain.entities.Usine;
import fr.saintgobain.repositories.UsineRepository;

public class UsineDaoImpl implements UsineDao{
	
	private UsineRepository usineRepository;

	/**
	 * 
	 * @return the Usine List
	 */
	public List<Usine> getAllUsine() {
		return usineRepository.findAll();
	}

	/**
	 * create Usine
	 */
	public void createUsine(Usine usine) {
		usineRepository.save(usine);
	}

	/**
	 * find Usine by id
	 */
	@Override
	public Usine findUsineById(int id) {
		Usine usine = usineRepository.findOne(id);
		return usine;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Usine
	 */
	@Override
	public void deleteUsineById(int id) {
		usineRepository.delete(id);

	}

	// getter
	public UsineRepository getUsineRepository() {
		return usineRepository;
	}

	// setter
	public void setUsineRepository(UsineRepository usineRepository) {
		this.usineRepository = usineRepository;
	}

}
