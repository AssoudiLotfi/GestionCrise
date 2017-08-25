package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ligne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idligne;
	private int idusinefk;
	private String nomligne;
	private String trigramme;
	private String adresseligne;
	
	
	
	public Ligne() {
		super();
	}
	public Ligne(int idligne, int idusinefk, String nomligne, String trigramme, String adresseligne) {
		super();
		this.idligne = idligne;
		this.idusinefk = idusinefk;
		this.nomligne = nomligne;
		this.trigramme = trigramme;
		this.adresseligne = adresseligne;
	}
	public int getIdligne() {
		return idligne;
	}
	public void setIdligne(int idligne) {
		this.idligne = idligne;
	}
	public int getIdusinefk() {
		return idusinefk;
	}
	public void setIdusinefk(int idusinefk) {
		this.idusinefk = idusinefk;
	}
	public String getNomligne() {
		return nomligne;
	}
	public void setNomligne(String nomligne) {
		this.nomligne = nomligne;
	}
	public String getTrigramme() {
		return trigramme;
	}
	public void setTrigramme(String trigramme) {
		this.trigramme = trigramme;
	}
	public String getAdresseligne() {
		return adresseligne;
	}
	public void setAdresseligne(String adresseligne) {
		this.adresseligne = adresseligne;
	}
	@Override
	public String toString() {
		return "Ligne [idligne=" + idligne + ", idusinefk=" + idusinefk + ", nomligne=" + nomligne + ", trigramme="
				+ trigramme + ", adresseligne=" + adresseligne + "]";
	}
	
	


}
