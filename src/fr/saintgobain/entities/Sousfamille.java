package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sousfamille implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idsousf;
	private int idfamillefk;
	private String nomsousfamille;
	
	
	
	public Sousfamille() {
		super();
	}
	public Sousfamille(int idsousf, int idfamillefk, String nomsousfamille) {
		super();
		this.idsousf = idsousf;
		this.idfamillefk = idfamillefk;
		this.nomsousfamille = nomsousfamille;
	}
	public int getIdsousf() {
		return idsousf;
	}
	public void setIdsousf(int idsousf) {
		this.idsousf = idsousf;
	}
	public int getIdfamillefk() {
		return idfamillefk;
	}
	public void setIdfamillefk(int idfamillefk) {
		this.idfamillefk = idfamillefk;
	}
	public String getNomsousfamille() {
		return nomsousfamille;
	}
	public void setNomsousfamille(String nomsousfamille) {
		this.nomsousfamille = nomsousfamille;
	}
	@Override
	public String toString() {
		return "Sousfamille [idsousf=" + idsousf + ", idfamillefk=" + idfamillefk + ", nomsousfamille=" + nomsousfamille
				+ "]";
	}
	
	


}
