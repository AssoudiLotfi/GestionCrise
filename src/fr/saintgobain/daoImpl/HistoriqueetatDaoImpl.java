package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.HistoriqueetatDao;
import fr.saintgobain.entities.Historiqueetat;
import fr.saintgobain.repositories.HistoriqueetatRepository;

public class HistoriqueetatDaoImpl implements HistoriqueetatDao {
	
	private HistoriqueetatRepository historiqueetatRepository;

	/**
	 * 
	 * @return the Historiqueetat List
	 */
	public List<Historiqueetat> getAllHistoriqueetat() {
		return historiqueetatRepository.findAll();
	}

	/**
	 * create Historiqueetat
	 */
	public void createHistoriqueetat(Historiqueetat historiqueetat) {
		historiqueetatRepository.save(historiqueetat);
	}

	/**
	 * find Historiqueetat by id
	 */
	@Override
	public Historiqueetat findHistoriqueetatById(int id) {
		Historiqueetat historiqueetat = historiqueetatRepository.findOne(id);
		return historiqueetat;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Historiqueetat
	 */
	@Override
	public void deleteHistoriqueetatById(int id) {
		historiqueetatRepository.delete(id);

	}

	// getter
	public HistoriqueetatRepository getHistoriqueetatRepository() {
		return historiqueetatRepository;
	}

	// setter
	public void setHistoriqueetatRepository(HistoriqueetatRepository historiqueetatRepository) {
		this.historiqueetatRepository = historiqueetatRepository;
	}

}
