package fr.saintgobain.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.DefautDaoImpl;
import fr.saintgobain.entities.Defaut;
@Path("/defaut")
public class DefautService {

	
	private DefautDaoImpl defautDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	
	
	//charger le context Spring 
	@PostConstruct
	public void init() {
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		defautDaoImpl =(DefautDaoImpl)appContext.getBean("defautDaoImpl");
	}
	
	//recuperation de la liste des crise par usine
	@GET
	@Path("/byLot")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Defaut> getAllDefaut() {
		List<Defaut> defauts = defautDaoImpl.getAllDefaut();
		return defauts;

	}
	
	@GET
	@Path("/ByIdLot/{idlot}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Defaut> getLotByCriseId (@PathParam("idlot") int idlot){
		
		List<Defaut> listdefaut = defautDaoImpl.getDefautByLot(idlot);
		return listdefaut;
	}
	@POST
	@Path("/savedefaut")
	@Produces(MediaType.APPLICATION_JSON)
	public Defaut saveDefaut(Defaut defaut  ){
		
		return defautDaoImpl.createDefaut(defaut);
	}
}
