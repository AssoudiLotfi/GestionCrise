package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Microstructure implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idmicros;
	private int idsousffk;
	private String nommicros;
	
	
	public Microstructure() {
		super();
	}
	public Microstructure(int idmicros, int idsousffk, String nommicros) {
		super();
		this.idmicros = idmicros;
		this.idsousffk = idsousffk;
		this.nommicros = nommicros;
	}
	public int getIdmicros() {
		return idmicros;
	}
	public void setIdmicros(int idmicros) {
		this.idmicros = idmicros;
	}
	public int getIdsousffk() {
		return idsousffk;
	}
	public void setIdsousffk(int idsousffk) {
		this.idsousffk = idsousffk;
	}
	public String getNommicros() {
		return nommicros;
	}
	public void setNommicros(String nommicros) {
		this.nommicros = nommicros;
	}
	@Override
	public String toString() {
		return "Microstructure [idmicros=" + idmicros + ", idsousffk=" + idsousffk + ", nommicros=" + nommicros + "]";
	}


}
