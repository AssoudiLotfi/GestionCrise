package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idutilisateur;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private int usine_idusine;

	public Utilisateur() {
		super();
	}

	
	

	
	




	public Utilisateur(int idutilisateur, String nom, String prenom, String login, String password, int usine_idusine) {
		super();
		this.idutilisateur = idutilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.usine_idusine = usine_idusine;
	}










	public int getIdutilisateur() {
		return idutilisateur;
	}
	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}










	public int getUsine_idusine() {
		return usine_idusine;
	}










	public void setUsine_idusine(int usine_idusine) {
		this.usine_idusine = usine_idusine;
	}




	
	
	
	
	
	


}
