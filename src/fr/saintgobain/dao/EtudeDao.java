	package fr.saintgobain.dao;

	import java.util.List;

	import fr.saintgobain.entities.Etude;

	public interface EtudeDao {
	    
	    public void createEtude(Etude etude);
	    public void deleteEtudeById(int id);
	    public List<Etude> getAllEtude();
	    public Etude findEtudeById(int id);
	 
	}