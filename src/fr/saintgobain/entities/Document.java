package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private int etude_idetude;
	
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Document(int iddoc, String chemainserveur, int etude_idetude) {
		super();
		this.iddoc = iddoc;
		this.chemainserveur = chemainserveur;
		this.etude_idetude = etude_idetude;
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






	public int getEtude_idetude() {
		return etude_idetude;
	}






	public void setEtude_idetude(int etude_idetude) {
		this.etude_idetude = etude_idetude;
	}



	
	
	


}
