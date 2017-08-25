package fr.saintgobain.rest;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.UtilisateurDaoImpl;
import fr.saintgobain.entities.Utilisateur;
@Path("/user")
public class UserService {
	private UtilisateurDaoImpl utilisateurDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	
	//charger le context Spring 
	@PostConstruct
	public void init() {
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		utilisateurDaoImpl =(UtilisateurDaoImpl)appContext.getBean("utilisateurDaoImpl");
	}
	
	//login 
	@GET
	@Path("/login/{login}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Utilisateur getTrackInJSON(@PathParam("login") String login,@PathParam("password") String password) {
		Utilisateur utilisateur=null;
		utilisateur = utilisateurDaoImpl.login(login,password);
		return utilisateur;

	}

	

}

