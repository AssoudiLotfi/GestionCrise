package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Famille implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idfamille;
	private int idtypedfk;
	private String 	nomfamille;
	
	
	
	public Famille() {
		super();
	}
	public Famille(int idfamille, int idtypedfk, String nomfamille) {
		super();
		this.idfamille = idfamille;
		this.idtypedfk = idtypedfk;
		this.nomfamille = nomfamille;
	}
	public int getIdfamille() {
		return idfamille;
	}
	public void setIdfamille(int idfamille) {
		this.idfamille = idfamille;
	}
	public int getIdtypedfk() {
		return idtypedfk;
	}
	public void setIdtypedfk(int idtypedfk) {
		this.idtypedfk = idtypedfk;
	}
	public String getNomfamille() {
		return nomfamille;
	}
	public void setNomfamille(String nomfamille) {
		this.nomfamille = nomfamille;
	}
	@Override
	public String toString() {
		return "Famille [idfamille=" + idfamille + ", idtypedfk=" + idtypedfk + ", nomfamille=" + nomfamille + "]";
	}
	


}
