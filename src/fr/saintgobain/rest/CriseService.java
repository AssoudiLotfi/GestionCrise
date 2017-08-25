package fr.saintgobain.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.CriseDaoImpl;
import fr.saintgobain.entities.Crise;
@Path("/crise")
public class CriseService {
	private CriseDaoImpl criseDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	
	
	//charger le context Spring 
	@PostConstruct
	public void init() {
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		criseDaoImpl =(CriseDaoImpl)appContext.getBean("criseDaoImpl");
	}
	
	//recuperation de la liste des crise par usine
	@GET
	@Path("/byUsine/{idusine}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Crise> getAllCriseByUsine(@PathParam("idusine") Integer idusine) {
		List<Crise> crises= criseDaoImpl.getCriseByUsine(idusine);
		return crises;

	}
	@DELETE
	@Path("/byid/{idcrise}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCriseById(@PathParam("idcrise") Integer idcrise){
		criseDaoImpl.deleteCriseById(idcrise);
	}
	@POST
	@Path("/savecrise")
	@Consumes(MediaType.APPLICATION_JSON)
	public void saveCrise(Crise crise ){
		
		criseDaoImpl.createCrise(crise);
	}
	

}

