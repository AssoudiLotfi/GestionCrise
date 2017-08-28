package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Crise;

public interface CriseDao {
    
    public Crise createCrise(Crise crise);
    public void deleteCriseById(int id);
    public List<Crise> getAllCrise();
    public Crise findCriseById(int id);
    public List<Crise> getCriseByUsine(int idUsine);
 
}
