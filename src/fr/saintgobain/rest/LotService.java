package fr.saintgobain.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.LotDaoImpl;
import fr.saintgobain.entities.Lot;
@Path("/Lot")
public class LotService {

	
	private LotDaoImpl lotDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	
	
	//charger le context Spring 
	@PostConstruct
	public void init() {
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		lotDaoImpl =(LotDaoImpl)appContext.getBean("lotDaoImpl");
	}
	
	//recuperation de la liste des crise par usine
	@GET
	@Path("/byCrise")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lot> getAllLot() {
		List<Lot> lots = lotDaoImpl.getAllLot();
		return lots;

	}
	@GET
	@Path("/ByIdCrise/{idcrise}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lot> getLotByCriseId (@PathParam("idcrise") int idcrise){
		
		List<Lot> listlot = lotDaoImpl.getLotbyCrise(idcrise);
		return listlot;
	}

}
