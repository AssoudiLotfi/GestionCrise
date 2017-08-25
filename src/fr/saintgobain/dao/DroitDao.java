package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Droit;

public interface DroitDao {
	
	public void createDroit(Droit droit);
    public void deleteDroitById(int id);
    public List<Droit> getAllDroit();
    public Droit findDroitById(int id);

}
