package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iddoc;
	private String chemainserveur;
	
	@OneToOne
    private Etude etude ;
	
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Document(int iddoc, String chemainserveur, Etude etude) {
		super();
		this.iddoc = iddoc;
		this.chemainserveur = chemainserveur;
		this.etude = etude;
	}
	
	
	
	public Etude getEtude() {
		return etude;
	}



	public void setEtude(Etude etude) {
		this.etude = etude;
	}



	public int getIddoc() {
		return iddoc;
	}
	public void setIddoc(int iddoc) {
		this.iddoc = iddoc;
	}
	
	public String getChemainserveur() {
		return chemainserveur;
	}
	public void setChemainserveur(String chemainserveur) {
		this.chemainserveur = chemainserveur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Document [iddoc=" + iddoc + ", chemainserveur=" + chemainserveur + ", etude=" + etude + "]";
	}
	
	
	


}
