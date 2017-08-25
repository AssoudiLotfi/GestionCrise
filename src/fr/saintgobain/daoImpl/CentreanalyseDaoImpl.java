package fr.saintgobain.daoImpl;

import fr.saintgobain.entities.Centreanalyse;
import fr.saintgobain.dao.CentreanalyseDao;
import fr.saintgobain.repositories.CentreanalyseRepository;

public class CentreanalyseDaoImpl implements CentreanalyseDao {
	
	
	private CentreanalyseRepository centreanalyseRepository;
	
	
	/**
	 * create Centre analyse
	 */
	public void createCentreanalyse(Centreanalyse centreanalyse) {
		centreanalyseRepository.save(centreanalyse);
	}
	
	public CentreanalyseRepository getCentreanalyseRepository() {
		return centreanalyseRepository;
	}
	public void setCentreanalyseRepository(CentreanalyseRepository centreanalyseRepository) {
		this.centreanalyseRepository = centreanalyseRepository;
	}
	
}
