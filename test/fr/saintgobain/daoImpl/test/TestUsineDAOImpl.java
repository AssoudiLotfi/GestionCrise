package fr.saintgobain.daoImpl.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.UsineDaoImpl;
import fr.saintgobain.entities.Usine;
import junit.framework.TestCase;

public class TestUsineDAOImpl extends TestCase {

	private UsineDaoImpl usineDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	private Usine usine=null;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		usineDaoImpl =(UsineDaoImpl)appContext.getBean("usineDaoImpl");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse("21/12/2012");
		Date d2 = sdf.parse("22/12/2012");
		
		Usine usine =new Usine();
		usine.setIdUsine(2);
//		List<Lot> lotList = new ArrayList<Lot>(); 
//		crise = criseDaoImpl.findCriseById(31);
		//crise = new Crise("progis",d,d2, "douglas", "mdpdoug", "Douglas",11,15,"MBIANDOU", "douglas",d2, "douglas", "mdpdoug", "Douglas", "mdpdoug", "Douglas", usine, lotList);

				
	
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		//emp = null;
		appContext = null;
		usineDaoImpl = null;
	}

//	public void testSaveCrise() {
//		criseDaoImpl.createCrise(crise);
//		
//	}

    public void testGetAllCrise() {
		List<Usine> usines = usineDaoImpl.getAllUsine();
				
		usines.forEach(t->{
			 System.out.println(t.toString());
		 });
	}
	
//	public void getCriseByUsine() {
//		List<Crise> crises = criseDaoImpl.getCriseByUsine(2);
//		crises.forEach(t -> {
//		});
//	}
}
