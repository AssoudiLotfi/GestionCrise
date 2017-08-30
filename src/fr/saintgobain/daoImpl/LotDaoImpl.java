package fr.saintgobain.daoImpl;

import java.util.List;

import fr.saintgobain.dao.LotDao;
import fr.saintgobain.entities.Lot;
import fr.saintgobain.repositories.LotRepository;

public class LotDaoImpl implements LotDao {
	
	private LotRepository lotRepository;

	/**
	 * 
	 * @return the lot List
	 */
	public List<Lot> getAllLot() {
		return lotRepository.findAll();
	}

	/**
	 * create Lot
	 */
	public Lot createLot(Lot lot) {
		return lotRepository.save(lot);
	}

	/**
	 * find Lot by id
	 */
	@Override
	public Lot findLotById(int id) {
		Lot lot = lotRepository.findOne(id);
		return lot;
	}

	/**
	 * 
	 * @param id
	 *            : the id of Lot
	 */
	@Override
	public void deleteLotById(int id) {
		lotRepository.delete(id);

	}

	// getter
	public LotRepository getLotRepository() {
		return lotRepository;
	}

	// setter
	public void setLotRepository(LotRepository lotRepository) {
		this.lotRepository = lotRepository;
	}

	@Override
	public List<Lot> getLotbyCrise(int idCrise) {
		// TODO Auto-generated method stub
		List<Lot> lotlist=this.lotRepository.getLotbyCrise(idCrise);
	    return lotlist;
	}

}
