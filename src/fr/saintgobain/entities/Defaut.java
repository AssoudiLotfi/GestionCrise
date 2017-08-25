package fr.saintgobain.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Defaut implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iddefaut;
	private int idantares;
	private String progression;
	private Date defaultdate;
	private int alignment;
	private String positionthickness;
	private String positionedge;
	private String positionleft;
	private String ag3;
	private String ag4;
	private String barrage;
	private int classdefault;
	private String diagnosisfactory;
	private String color;
	private String thickness;
	private String typedefaultsgr;
	private String familiessgr;
	private String subfamiliessgr;
	private String microstructuresgr;
	private String commentsgr;


	public Defaut() {
		// TODO Auto-generated constructor stub

		super();
	}

	
	public Defaut(int idantares, String progression, Date defaultdate, int alignment,
			String positionthickness, String positionedge, String positionleft, String ag3, String ag4, String barrage,
			int classdefault, String diagnosisfactory, String color, String thickness, String typedefaultsgr,
			String familiessgr, String subfamiliessgr, String microstructuresgr, String commentsgr) {
		super();
		
		this.idantares = idantares;
		this.progression = progression;
		this.defaultdate = defaultdate;
		this.alignment = alignment;
		this.positionthickness = positionthickness;
		this.positionedge = positionedge;
		this.positionleft = positionleft;
		this.ag3 = ag3;
		this.ag4 = ag4;
		this.barrage = barrage;
		this.classdefault = classdefault;
		this.diagnosisfactory = diagnosisfactory;
		this.color = color;
		this.thickness = thickness;
		this.typedefaultsgr = typedefaultsgr;
		this.familiessgr = familiessgr;
		this.subfamiliessgr = subfamiliessgr;
		this.microstructuresgr = microstructuresgr;
		this.commentsgr = commentsgr;
	}



	public int getIddefaut() {
		return iddefaut;
	}

	public void setIddefaut(int iddefaut) {
		this.iddefaut = iddefaut;
	}



	public int getIdantares() {
		return idantares;
	}

	public void setIdantares(int idantares) {
		this.idantares = idantares;
	}

	public String getProgression() {
		return progression;
	}

	public void setProgression(String progression) {
		this.progression = progression;
	}

	public Date getDefaultdate() {
		return defaultdate;
	}

	public void setDefaultdate(Date defaultdate) {
		this.defaultdate = defaultdate;
	}

	public int getAlignment() {
		return alignment;
	}

	public void setAlignment(int alignment) {
		this.alignment = alignment;
	}

	public String getPositionthickness() {
		return positionthickness;
	}

	public void setPositionthickness(String positionthickness) {
		this.positionthickness = positionthickness;
	}

	public String getPositionedge() {
		return positionedge;
	}

	public void setPositionedge(String positionedge) {
		this.positionedge = positionedge;
	}

	public String getPositionleft() {
		return positionleft;
	}

	public void setPositionleft(String positionleft) {
		this.positionleft = positionleft;
	}

	public String getAg3() {
		return ag3;
	}

	public void setAg3(String ag3) {
		this.ag3 = ag3;
	}

	public String getAg4() {
		return ag4;
	}

	public void setAg4(String ag4) {
		this.ag4 = ag4;
	}

	public String getBarrage() {
		return barrage;
	}

	public void setBarrage(String barrage) {
		this.barrage = barrage;
	}

	public int getClassdefault() {
		return classdefault;
	}

	public void setClassdefault(int classdefault) {
		this.classdefault = classdefault;
	}

	public String getDiagnosisfactory() {
		return diagnosisfactory;
	}

	public void setDiagnosisfactory(String diagnosisfactory) {
		this.diagnosisfactory = diagnosisfactory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getTypedefaultsgr() {
		return typedefaultsgr;
	}

	public void setTypedefaultsgr(String typedefaultsgr) {
		this.typedefaultsgr = typedefaultsgr;
	}

	public String getFamiliessgr() {
		return familiessgr;
	}

	public void setFamiliessgr(String familiessgr) {
		this.familiessgr = familiessgr;
	}

	public String getSubfamiliessgr() {
		return subfamiliessgr;
	}

	public void setSubfamiliessgr(String subfamiliessgr) {
		this.subfamiliessgr = subfamiliessgr;
	}

	public String getMicrostructuresgr() {
		return microstructuresgr;
	}

	public void setMicrostructuresgr(String microstructuresgr) {
		this.microstructuresgr = microstructuresgr;
	}

	public String getCommentsgr() {
		return commentsgr;
	}

	public void setCommentsgr(String commentsgr) {
		this.commentsgr = commentsgr;
	}


	

	

}
