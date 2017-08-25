package fr.saintgobain.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Crise implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int idcrise;
	private String progression;
	private String startdate;
	private String finaldate;
	private String nature;
	private String familiesdefects;
	private String specialevent;
	private int deltalossmax;
	private int deltalossaverage;
	private String screenshotantares;
	private String crisiscontext;
	private String dateeventcrisis;
	private String commentdti;
	private String commentusine;
	private String referencecrisis;
	private String crisismemory;
	private String crisismother;

	public Crise() {
		super();
	}
	
	public Crise(String progression, String startdate, String finaldate, String nature, String familiesdefects,
			String specialevent, int deltalossmax, int deltalossaverage, String screenshotantares, String crisiscontext,
			String dateeventcrisis, String commentdti, String commentusine, String referencecrisis, String crisismemory,
			String crisismother) {
		super();
		this.progression = progression;
		this.startdate = startdate;
		this.finaldate = finaldate;
		this.nature = nature;
		this.familiesdefects = familiesdefects;
		this.specialevent = specialevent;
		this.deltalossmax = deltalossmax;
		this.deltalossaverage = deltalossaverage;
		this.screenshotantares = screenshotantares;
		this.crisiscontext = crisiscontext;
		this.dateeventcrisis = dateeventcrisis;
		this.commentdti = commentdti;
		this.commentusine = commentusine;
		this.referencecrisis = referencecrisis;
		this.crisismemory = crisismemory;
		this.crisismother = crisismother;
		
	}

	
	




	public int getIdCrise() {
		return idcrise;
	}

	public void setIdCrise(int idCrise) {
		this.idcrise = idCrise;
	}

	public String getProgression() {
		return progression;
	}

	public void setProgression(String progression) {
		this.progression = progression;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getFinaldate() {
		return finaldate;
	}

	public void setFinaldate(String finaldate) {
		this.finaldate = finaldate;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getFamiliesdefects() {
		return familiesdefects;
	}

	public void setFamiliesdefects(String familiesdefects) {
		this.familiesdefects = familiesdefects;
	}

	public String getSpecialevent() {
		return specialevent;
	}

	public void setSpecialevent(String specialevent) {
		this.specialevent = specialevent;
	}

	public int getDeltalossmax() {
		return deltalossmax;
	}

	public void setDeltalossmax(int deltalossmax) {
		this.deltalossmax = deltalossmax;
	}

	public int getDeltalossaverage() {
		return deltalossaverage;
	}

	public void setDeltalossaverage(int deltalossaverage) {
		this.deltalossaverage = deltalossaverage;
	}

	public String getScreenshotantares() {
		return screenshotantares;
	}

	public void setScreenshotantares(String screenshotantares) {
		this.screenshotantares = screenshotantares;
	}

	public String getCrisiscontext() {
		return crisiscontext;
	}

	public void setCrisiscontext(String crisiscontext) {
		this.crisiscontext = crisiscontext;
	}

	public String getDateeventcrisis() {
		return dateeventcrisis;
	}

	public void setDateeventcrisis(String dateeventcrisis) {
		this.dateeventcrisis = dateeventcrisis;
	}

	public String getCommentdti() {
		return commentdti;
	}

	public void setCommentdti(String commentdti) {
		this.commentdti = commentdti;
	}

	public String getCommentusine() {
		return commentusine;
	}

	public void setCommentusine(String commentusine) {
		this.commentusine = commentusine;
	}

	public String getReferencecrisis() {
		return referencecrisis;
	}

	public void setReferencecrisis(String referencecrisis) {
		this.referencecrisis = referencecrisis;
	}

	public String getCrisismemory() {
		return crisismemory;
	}

	public void setCrisismemory(String crisismemory) {
		this.crisismemory = crisismemory;
	}

	public String getCrisismother() {
		return crisismother;
	}

	public void setCrisismother(String crisismother) {
		this.crisismother = crisismother;
	}
	

	public int getIdcrise() {
		return idcrise;
	}

	public void setIdcrise(int idcrise) {
		this.idcrise = idcrise;
	}




	
	
}
