package fr.saintgobain.daoImpl.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.saintgobain.daoImpl.EtudeDaoImpl;
import fr.saintgobain.entities.Document;
import fr.saintgobain.entities.Etude;
import junit.framework.TestCase;

public class TestEtudeDaoImpl extends TestCase {

	private EtudeDaoImpl etudeDaoImpl;
	private ClassPathXmlApplicationContext appContext;
	private Etude etude = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse("21/12/2012");
		Date d2 = sdf.parse("22/12/2012");
		Date d3 = sdf.parse("21/11/2012");
		Document document =new Document();
		document.setIddoc(1);
		etude = new Etude( "hhg", d, "gg", "hhg", document);

		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		etudeDaoImpl = (EtudeDaoImpl) appContext.getBean("etudeDaoImpl");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		// emp = null;
		appContext = null;
		etudeDaoImpl = null;
	}

	public void testSaveDefault() {
		etudeDaoImpl.createEtude(etude);
	}

	public void testGetAllEtude() {
		List<Etude> etudes = etudeDaoImpl.getAllEtude();
		etudes.forEach(t -> {
			System.out.println(t.toString());
		});
	}
}
