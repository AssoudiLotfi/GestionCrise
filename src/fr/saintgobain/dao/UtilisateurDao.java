package fr.saintgobain.dao;

import java.util.List;

import fr.saintgobain.entities.Utilisateur;

public interface UtilisateurDao {
	
	public void createUtilisateur(Utilisateur utilisateur);
    public void deleteUtilisateurById(int id);
    public List<Utilisateur> getAllUtilisateur();
    public Utilisateur findUtilisateurById(int id);

}
