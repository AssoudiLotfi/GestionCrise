package fr.saintgobain.daoImpl.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.DefautDaoImpl;
import fr.saintgobain.daoImpl.LotDaoImpl;
import fr.saintgobain.entities.Defaut;
import fr.saintgobain.entities.Lot;
import junit.framework.TestCase;

public class TestDefautDAOImpl extends TestCase {

	private DefautDaoImpl defautDaoImpl;
	private LotDaoImpl lotDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	private Defaut defaut=null;
	private Lot lot = null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		defautDaoImpl =(DefautDaoImpl)appContext.getBean("defautDaoImpl");
		lotDaoImpl =(LotDaoImpl)appContext.getBean("lotDaoImpl");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse("21/12/2012");
		Date d2 = sdf.parse("22/12/2012");
		lot = lotDaoImpl.findLotById(2);
		
//		defaut = new Defaut(5,"progression",d,2,
//				"positionthickness","positionedge","positionleft","ag3","ag4","barrage",
//				12,"diagnosisfactory","color","thickness","typedefaultsgr",
//				"familiessgr","subfamiliessgr","microstructuresgr","commentsgr",lot);

				
	
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		//emp = null;
		appContext = null;
		lotDaoImpl = null;
		defautDaoImpl = null;

	}

//	public void testSaveDefaut() {
//		defautDaoImpl.createDefaut(defaut);
//		
//	}
	
//  public void testDeleteDefautById(){
//	  defautDaoImpl.deleteDefautById(3);
//}

//    public void testGetAllCrise() {
//		List<Crise> crises = criseDaoImpl.getAllCrise();
//		 crises.forEach(t->{
//			 System.out.println(t.toString());
//		 });
//	}
	
//  public void testGetDefautById() {
//		Defaut defaut= defautDaoImpl.findDefautById(1);
//		
//		 System.out.println(defaut.toString());
//	}
	
//	public void testgetDefautByLot() {
//		List<Defaut> lots = defautDaoImpl.getDefautByLot(2);
//		lots.forEach(t -> {
//			System.out.println(t.toString());
//		});
//	}
}
