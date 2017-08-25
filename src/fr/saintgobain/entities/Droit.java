package fr.saintgobain.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Droit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iddroit;
	private String role;

	
	
	
	public Droit(int iddroit, String role) {
		super();
		this.iddroit = iddroit;
		this.role = role;
		
	}
	


	public int getIddroit() {
		return iddroit;
	}
	public void setIddroit(int iddroit) {
		this.iddroit = iddroit;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	


}
