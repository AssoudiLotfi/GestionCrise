package fr.saintgobain.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Usine implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUsine;
	private String nom;
	private String trigramme;
	private String adresse;

	
	
	public Usine() {
		super();
	}
	
	public Usine(String nom, String trigramme, String adresse) {
		super();
		this.nom = nom;
		this.trigramme = trigramme;
		this.adresse = adresse;
	}

	public int getIdUsine() {
		return idUsine;
	}
	public void setIdUsine(int idUsine) {
		this.idUsine = idUsine;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTrigramme() {
		return trigramme;
	}
	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	
	
	
}
