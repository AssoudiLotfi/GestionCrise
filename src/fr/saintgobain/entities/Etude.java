package fr.saintgobain.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Etude implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idetude;
	private String progression;
	private Date studiesdate;
	private String commentdelay;
	private String typedefault;
	
	
	
	public Etude() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etude( String progression, Date studiesdate, String commentdelay, String typedefault,
			Document document) {
		super();
		
		this.progression = progression;
		this.studiesdate = studiesdate;
		this.commentdelay = commentdelay;
		this.typedefault = typedefault;
		
	}






	public int getIdetude() {
		return idetude;
	}
	public void setIdetude(int idetude) {
		this.idetude = idetude;
	}
	public String getProgression() {
		return progression;
	}
	public void setProgression(String progression) {
		this.progression = progression;
	}
	public Date getStudiesdate() {
		return studiesdate;
	}
	public void setStudiesdate(Date studiesdate) {
		this.studiesdate = studiesdate;
	}
	public String getCommentdelay() {
		return commentdelay;
	}
	public void setCommentdelay(String commentdelay) {
		this.commentdelay = commentdelay;
	}
	public String getTypedefault() {
		return typedefault;
	}
	public void setTypedefault(String typedefault) {
		this.typedefault = typedefault;
	}


	
	
	


}
