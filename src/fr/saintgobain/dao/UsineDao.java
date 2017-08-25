package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Usine;

public interface UsineDao {
	
	public void createUsine(Usine usine);
    public void deleteUsineById(int id);
    public List<Usine> getAllUsine();
    public Usine findUsineById(int id);

}
