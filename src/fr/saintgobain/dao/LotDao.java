package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Lot;

public interface LotDao {
	
	public void createLot(Lot Lot);
    public void deleteLotById(int id);
    public List<Lot> getAllLot();
    public Lot findLotById(int id);
    public List<Lot> getLotbyCrise(int idCrise);

}
