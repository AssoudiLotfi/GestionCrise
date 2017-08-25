package fr.saintgobain.daoImpl.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.CriseDaoImpl;
import fr.saintgobain.entities.Crise;
import fr.saintgobain.entities.Lot;
import fr.saintgobain.entities.Usine;
import junit.framework.TestCase;

public class TestCriseDAOImpl extends TestCase {

	private CriseDaoImpl criseDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	private Crise crise=null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		criseDaoImpl =(CriseDaoImpl)appContext.getBean("criseDaoImpl");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse("00/12/2000");
		Date d2 = sdf.parse("22/12/2012");
		
		Usine usine =new Usine();
		usine.setIdUsine(1);
		List<Lot> lotList = new ArrayList<Lot>(); 
		crise = criseDaoImpl.findCriseById(41);
		//crise = new Crise("progis",d,d2, "douglas", "mdpdoug", "Douglas",11,15,"MBIANDOU", "douglas",d2, "douglas", "mdpdoug", "Douglas", "mdpdoug", "Douglas", usine, lotList);

				
	
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		//emp = null;
		appContext = null;
		criseDaoImpl = null;
	}

//	public void testSaveCrise() {
//		criseDaoImpl.createCrise(crise);
//		
//	}
	
//  public void testGetCriseById() {
//		Crise crises = criseDaoImpl.findCriseById(41);
//		
//		 System.out.println(crises.toString());
//	}

//  public void testDeleteCriseById(){
//	  criseDaoImpl.deleteCriseById(41);
//	   
//	  
//  }
  
//    public void testGetAllCrise() {
//		List<Crise> crises = criseDaoImpl.getAllCrise();
//		 crises.forEach(t->{
//			 System.out.println(t.toString());
//		 });
//	}
	
	public void testGetCriseByUsine() {
		List<Crise> crises = criseDaoImpl.getCriseByUsine(1);
		crises.forEach(t -> {
			System.out.println(t.toString());
		});
	}
}
