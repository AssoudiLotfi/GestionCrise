package fr.saintgobain.daoImpl.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.CriseDaoImpl;
import fr.saintgobain.daoImpl.LotDaoImpl;
import fr.saintgobain.entities.Crise;
import fr.saintgobain.entities.Defaut;
import fr.saintgobain.entities.Lot;
import junit.framework.TestCase;

public class TestLotDAOImpl extends TestCase {

	private CriseDaoImpl criseDaoImpl;
	private LotDaoImpl lotDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	private Crise crise=null;
	private Lot lot=null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		criseDaoImpl =(CriseDaoImpl)appContext.getBean("criseDaoImpl");
		lotDaoImpl =(LotDaoImpl)appContext.getBean("lotDaoImpl");
		
		List<Defaut> defautList = new ArrayList<Defaut>(); 

				crise = criseDaoImpl.findCriseById(31);
		
		// lot=new Lot("nn","jjj", "kkkk", "jjjjjj", "ghjgj", "kkkkk", "llllll", crise, defautList);
	
		
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		//emp = null;
		appContext = null;
		criseDaoImpl = null;
		lotDaoImpl=null;
	}

	public void testSaveLot() {
		//lotDaoImpl.createLot(lot);
		
	}

//    public void testGetAllLot() {
//		List<Lot> lots = lotDaoImpl.getAllLot();
//		 lots.forEach(t->{
//			 
//			 System.out.println(t.getDefautList().toString());
//			 //System.out.println(t.toString());
//		 });
//	}
}
