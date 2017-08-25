package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Centreanalyse implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idca;
	private String nom;
	private String adresse;
	
	
	
	
	public Centreanalyse() {
		super();
	}

	public Centreanalyse(int idca, String nom, String adresse) {
		super();
		this.idca = idca;
		this.nom = nom;
		this.adresse = adresse;
	}

	public int getIdca() {
		return idca;
	}

	public void setIdca(int idca) {
		this.idca = idca;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Centreanalyse [idca=" + idca + ", nom=" + nom + ", adresse=" + adresse + "]";
	}

	
	
}
