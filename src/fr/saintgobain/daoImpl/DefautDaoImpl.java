package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.DefautDao;
import fr.saintgobain.entities.Defaut;
import fr.saintgobain.repositories.DefautRepository;

public class DefautDaoImpl implements DefautDao {

	private DefautRepository defautRepository;

	/**
	 * 
	 * @return the Defaut List
	 */
	public List<Defaut> getAllDefaut() {
		return defautRepository.findAll();
	}

	/**
	 * create Defaut
	 */
	public void createDefaut(Defaut defaut) {
		defautRepository.save(defaut);
	}

	/**
	 * find Defaut by id
	 */
	@Override
	public Defaut findDefautById(int id) {
		Defaut defaut = defautRepository.findOne(id);
		return defaut;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Defaut
	 */
	@Override
	public void deleteDefautById(int id) {
		defautRepository.delete(id);

	}

	// getter
	public DefautRepository getDefautRepository() {
		return defautRepository;
	}

	// setter
	public void setDefautRepository(DefautRepository defautRepository) {
		this.defautRepository = defautRepository;
	}

	@Override
	public List<Defaut> getDefautByLot(int idLot) {
		List<Defaut> defautList=this.defautRepository.getDefautByLot(idLot);
		return defautList;
	}
}
