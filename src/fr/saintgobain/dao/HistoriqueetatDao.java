package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Historiqueetat;

public interface HistoriqueetatDao {
	
	public void createHistoriqueetat(Historiqueetat historiqueetat);
    public void deleteHistoriqueetatById(int id);
    public List<Historiqueetat> getAllHistoriqueetat();
    public Historiqueetat findHistoriqueetatById(int id);

}
