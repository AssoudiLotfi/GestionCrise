package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Lot implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idlot;
	private String progression;
	private String centreanalyse;
	private String levelemergency;
	private String emergencycomment;
	private String billing;
	private String dtipriority;
	private String parcelnumber;

	
	public Lot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lot( String progression, String centreanalyse, String levelemergency, String emergencycomment,
			String billing, String dtipriority, String parcelnumber) {
		super();
		
		this.progression = progression;
		this.centreanalyse = centreanalyse;
		this.levelemergency = levelemergency;
		this.emergencycomment = emergencycomment;
		this.billing = billing;
		this.dtipriority = dtipriority;
		this.parcelnumber = parcelnumber;
		
	}

	
	public int getIdlot() {
		return idlot;
	}
	public void setIdlot(int idlot) {
		this.idlot = idlot;
	}

	public String getProgression() {
		return progression;
	}
	public void setProgression(String progression) {
		this.progression = progression;
	}
	public String getCentreanalyse() {
		return centreanalyse;
	}
	public void setCentreanalyse(String centreanalyse) {
		this.centreanalyse = centreanalyse;
	}
	public String getLevelemergency() {
		return levelemergency;
	}
	public void setLevelemergency(String levelemergency) {
		this.levelemergency = levelemergency;
	}
	public String getEmergencycomment() {
		return emergencycomment;
	}
	public void setEmergencycomment(String emergencycomment) {
		this.emergencycomment = emergencycomment;
	}
	public String getBilling() {
		return billing;
	}
	public void setBilling(String billing) {
		this.billing = billing;
	}
	public String getDtipriority() {
		return dtipriority;
	}
	public void setDtipriority(String dtipriority) {
		this.dtipriority = dtipriority;
	}
	public String getParcelnumber() {
		return parcelnumber;
	}
	public void setParcelnumber(String parcelnumber) {
		this.parcelnumber = parcelnumber;
	}

	

	

	
	
	


}
