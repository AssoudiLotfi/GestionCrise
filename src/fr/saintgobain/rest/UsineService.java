package fr.saintgobain.rest;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.UsineDaoImpl;
import fr.saintgobain.entities.Usine;
@Path("/usine")
public class UsineService {
	
	
		private UsineDaoImpl usineDaoImpl;
		private ClassPathXmlApplicationContext appContext;
		
		
		//charger le context Spring 
		@PostConstruct
		public void init() {
			appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			usineDaoImpl =(UsineDaoImpl)appContext.getBean("usineDaoImpl");
		}
		
		//select usine by id
		@GET
		@Path("/{idusine}")
		@Produces(MediaType.APPLICATION_JSON)
		public Usine getUsine(@PathParam("idusine") Integer idusine) {
			Usine usine= usineDaoImpl.getUsine(idusine);
			return usine;

		}

	}