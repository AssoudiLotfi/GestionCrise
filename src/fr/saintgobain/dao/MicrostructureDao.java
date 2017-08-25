package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Microstructure;

public interface MicrostructureDao {
	
	public void createMicrostructure(Microstructure microstructure);
    public void deleteMicrostructureById(int id);
    public List<Microstructure> getAllMicrostructure();
    public Microstructure findMicrostructureById(int id);

}
