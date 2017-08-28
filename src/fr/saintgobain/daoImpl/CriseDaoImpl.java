package fr.saintgobain.daoImpl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import fr.saintgobain.dao.CriseDao;
import fr.saintgobain.entities.Crise;
import fr.saintgobain.repositories.CriseRepository;
@Transactional
public class CriseDaoImpl implements CriseDao {
	private CriseRepository criseRepository;
	
	/**
	 * 
	 * @return the crise List
	 */
	@Override
	public List<Crise> getAllCrise() {
		return criseRepository.findAll();
	}

	/**
	 * create crise
	 */
	@Override
	public Crise createCrise(Crise crise) {
		return criseRepository.save(crise);
	}

	/**
	 * find Crise by id
	 */
	
	@Override
	public Crise findCriseById(int id) {
		Crise crise = criseRepository.findOne(id);
		return crise;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Crise
	 */
	@Override
	public void deleteCriseById(int id) {
		criseRepository.delete(id);

	}

	// getter
	public CriseRepository getCriseRepository() {
		return criseRepository;
	}

	// setter
	public void setCriseRepository(CriseRepository criseRepository) {
		this.criseRepository = criseRepository;
	}

	@Override
	public List<Crise> getCriseByUsine(int idUsine) {
		// TODO Auto-generated method stub
		List<Crise> criseList=this.criseRepository.getCriseByUsine(idUsine);
	    return criseList;
	}
	

	

}
