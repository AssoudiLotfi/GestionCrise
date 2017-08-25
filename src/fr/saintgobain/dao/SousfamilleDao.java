package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Sousfamille;

public interface SousfamilleDao {
	public void createSousfamille(Sousfamille sousfamille);
    public void deleteSousfamilleById(int id);
    public List<Sousfamille> getAllSousfamille();
    public Sousfamille findSousfamilleById(int id);

}
