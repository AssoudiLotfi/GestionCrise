package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Typedefaut;

public interface TypedefautDao {
	
	public void createTypedefaut(Typedefaut typedefaut);
    public void deleteTypedefautById(int id);
    public List<Typedefaut> getAllTypedefaut();
    public Typedefaut findTypedefautById(int id);

}
