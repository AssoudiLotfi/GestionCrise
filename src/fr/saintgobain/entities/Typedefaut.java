package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Typedefaut implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idtd;
	private int iddefautfk;
	private String nomdefaut;
	
	
	public Typedefaut() {
		super();
	}
	public Typedefaut(int idtd, int iddefautfk, String nomdefaut) {
		super();
		this.idtd = idtd;
		this.iddefautfk = iddefautfk;
		this.nomdefaut = nomdefaut;
	}
	public int getIdtd() {
		return idtd;
	}
	public void setIdtd(int idtd) {
		this.idtd = idtd;
	}
	public int getIddefautfk() {
		return iddefautfk;
	}
	public void setIddefautfk(int iddefautfk) {
		this.iddefautfk = iddefautfk;
	}
	public String getNomdefaut() {
		return nomdefaut;
	}
	public void setNomdefaut(String nomdefaut) {
		this.nomdefaut = nomdefaut;
	}
	@Override
	public String toString() {
		return "Typedefaut [idtd=" + idtd + ", iddefautfk=" + iddefautfk + ", nomdefaut=" + nomdefaut + "]";
	}
	
	
	


}
