package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Image implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idimage;
	private int idcrisefk;
	private int idetudefk;
	private int iddefautfk;
	private String chemainserveur;
	
	
	
	public Image() {
		super();
	}
	public Image(int idimage, int idcrisefk, int idetudefk, int iddefautfk, String chemainserveur) {
		super();
		this.idimage = idimage;
		this.idcrisefk = idcrisefk;
		this.idetudefk = idetudefk;
		this.iddefautfk = iddefautfk;
		this.chemainserveur = chemainserveur;
	}
	public int getIdimage() {
		return idimage;
	}
	public void setIdimage(int idimage) {
		this.idimage = idimage;
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
	public int getIddefautfk() {
		return iddefautfk;
	}
	public void setIddefautfk(int iddefautfk) {
		this.iddefautfk = iddefautfk;
	}
	public String getChemainserveur() {
		return chemainserveur;
	}
	public void setChemainserveur(String chemainserveur) {
		this.chemainserveur = chemainserveur;
	}
	@Override
	public String toString() {
		return "Image [idimage=" + idimage + ", idcrisefk=" + idcrisefk + ", idetudefk=" + idetudefk + ", iddefautfk="
				+ iddefautfk + ", chemainserveur=" + chemainserveur + "]";
	}
	
	


}
