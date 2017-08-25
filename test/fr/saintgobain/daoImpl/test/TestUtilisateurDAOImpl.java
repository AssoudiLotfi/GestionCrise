package fr.saintgobain.daoImpl.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.UtilisateurDaoImpl;
import fr.saintgobain.entities.Utilisateur;
import junit.framework.TestCase;

public class TestUtilisateurDAOImpl extends TestCase {

	private UtilisateurDaoImpl utilisateurDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	private Utilisateur utilisateur =null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		utilisateurDaoImpl =(UtilisateurDaoImpl)appContext.getBean("utilisateurDaoImpl");
		

		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		//emp = null;
		appContext = null;
		utilisateurDaoImpl = null;
	}


	
	public void testLogin() {
		 utilisateur = utilisateurDaoImpl.login("lotfi","lotfi");
			System.out.println(utilisateur);
	}
}
