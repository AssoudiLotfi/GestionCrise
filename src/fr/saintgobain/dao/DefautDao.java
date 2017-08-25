package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Defaut;;

public interface DefautDao {
	
	public void createDefaut(Defaut defaut);
    public void deleteDefautById(int id);
    public List<Defaut> getAllDefaut();
    public Defaut findDefautById(int id);
	public List<Defaut> getDefautByLot(int idLot);


}
