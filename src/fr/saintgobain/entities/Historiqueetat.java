package fr.saintgobain.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Historiqueetat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idhisto;
	private int idcrisefk;
	private int idetudefk;
	private int idlotfk;
	private Date dateetat;
	private String natureetat;
	
	
	
	public Historiqueetat() {
		super();
	}
	public Historiqueetat(int idhisto, int idcrisefk, int idetudefk, int idlotfk, Date dateetat, String natureetat) {
		super();
		this.idhisto = idhisto;
		this.idcrisefk = idcrisefk;
		this.idetudefk = idetudefk;
		this.idlotfk = idlotfk;
		this.dateetat = dateetat;
		this.natureetat = natureetat;
	}
	public int getIdhisto() {
		return idhisto;
	}
	public void setIdhisto(int idhisto) {
		this.idhisto = idhisto;
	}
	public int getIdcrisefk() {
		return idcrisefk;
	}
	public void setIdcrisefk(int idcrisefk) {
		this.idcrisefk = idcrisefk;
	}
	public int getIdetudefk() {
		return idetudefk;
	}
	public void setIdetudefk(int idetudefk) {
		this.idetudefk = idetudefk;
	}
	public int getIdlotfk() {
		return idlotfk;
	}
	public void setIdlotfk(int idlotfk) {
		this.idlotfk = idlotfk;
	}
	public Date getDateetat() {
		return dateetat;
	}
	public void setDateetat(Date dateetat) {
		this.dateetat = dateetat;
	}
	public String getNatureetat() {
		return natureetat;
	}
	public void setNatureetat(String natureetat) {
		this.natureetat = natureetat;
	}
	@Override
	public String toString() {
		return "Historiqueetat [idhisto=" + idhisto + ", idcrisefk=" + idcrisefk + ", idetudefk=" + idetudefk
				+ ", idlotfk=" + idlotfk + ", dateetat=" + dateetat + ", natureetat=" + natureetat + "]";
	}
	
	


}
