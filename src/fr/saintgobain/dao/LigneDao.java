package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Ligne;

public interface LigneDao {
	
	public void createLigne(Ligne ligne);
    public void deleteLigneById(int id);
    public List<Ligne> getAllLigne();
    public Ligne findLigneById(int id);

}
