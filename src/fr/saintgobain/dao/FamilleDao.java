package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Famille;

public interface FamilleDao {
	
	public void createFamille(Famille famille);
    public void deleteFamilleById(int id);
    public List<Famille> getAllFamille();
    public Famille findFamilleById(int id);

}
