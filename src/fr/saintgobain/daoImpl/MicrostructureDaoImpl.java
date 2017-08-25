package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.MicrostructureDao;
import fr.saintgobain.entities.Microstructure;
import fr.saintgobain.repositories.MicrostructureRepository;

public class MicrostructureDaoImpl implements MicrostructureDao {
	
	private MicrostructureRepository microstructureRepository;

	/**
	 * 
	 * @return the Microstructure List
	 */
	public List<Microstructure> getAllMicrostructure() {
		return microstructureRepository.findAll();
	}

	/**
	 * create Microstructure
	 */
	public void createMicrostructure(Microstructure microstructure) {
		microstructureRepository.save(microstructure);
	}

	/**
	 * find Microstructure by id
	 */
	@Override
	public Microstructure findMicrostructureById(int id) {
		Microstructure microstructure = microstructureRepository.findOne(id);
		return microstructure;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Microstructure
	 */
	@Override
	public void deleteMicrostructureById(int id) {
		microstructureRepository.delete(id);

	}

	// getter
	public MicrostructureRepository getMicrostructureRepository() {
		return microstructureRepository;
	}

	// setter
	public void setMicrostructureRepository(MicrostructureRepository microstructureRepository) {
		this.microstructureRepository = microstructureRepository;
	}

}
