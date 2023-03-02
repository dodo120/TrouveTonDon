package fr.find.your.donation.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;





public class MainTest {
	
	private long testStartTime;

	
	private static Donation donation1, donation2, donation3;
	private static Category category1, category2, category3, category4;
	private static Admin admin;
	private static User userAdmin, userAssoc, userDonor;
	private static List<Category> categoryResto = new ArrayList<>();
	private static List<Donation> donationResto = new ArrayList<>();
	private static List<History> historyResto = new ArrayList<>();
	private static Association restoDuCoeur;
	private static List<Category> categoryPatrick = new ArrayList<>();
	private static List<Donation> donationPatrick = new ArrayList<>();
	private static List<History> historyPatrick = new ArrayList<>();
	private static Donor donor1;
	
	private static final double DELTA = 1e-15;
	

	 @BeforeEach
	    void setUp() {
	        testStartTime = System.currentTimeMillis();
	        System.out.println("Démarrage d\'un test...");
	   }

	@BeforeAll
    static void setUpAll() {
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("SET UP ALL DATA");
		System.out.println("===============");
		System.out.println("===============");
		
		donation1 = new Donation(1,"Don d'argent");
		donation2 = new Donation(2,"Don de matériel");
		donation3 = new Donation(3,"Don de temps");
		
		category1 = new Category(1,"Environnement");
	    category2 = new Category(2,"Humanitaire");
		category3 = new Category(3,"Alimentaire");
		category4 = new Category(4,"Catastrophe naturelle");
		
		userAssoc = new User(2,"president@restoducoeur.org","password");
		userAdmin = new User(1,"admin","admin");
		userDonor = new User(3,"patrick@orange.fr","patrick");
		
		admin = new Admin(userAdmin);
		
		
		categoryResto.add(category2);
		categoryResto.add(category3);
		
		donationResto.add(donation1);
		donationResto.add(donation2);
		donationResto.add(donation3);
		
		
		restoDuCoeur = new Association(userAssoc.getId(),userAssoc.getLogin(),userAssoc.getPassword(),1,"3 rue de bayonne 64600 Bayonne","restosducoeur.org","0505050505","image","description",donationResto,categoryResto,false,historyResto);

		categoryPatrick.add(category1);
		categoryPatrick.add(category3);
		categoryPatrick.add(category4);
		
		donationPatrick.add(donation1);
		donationPatrick.add(donation2);
		donationPatrick.add(donation3);
		
		Date date = new Date();
		historyPatrick.add(new History(1,restoDuCoeur, donor1,date,100));
		historyPatrick.add(new History(1,restoDuCoeur, donor1,date,50));
		historyPatrick.add(new History(1,restoDuCoeur, donor1,date,240));
		historyPatrick.add(new History(1,restoDuCoeur, donor1,date,160));
		
		donor1 = new Donor(userDonor.getId(),userDonor.getLogin(),userDonor.getPassword(),1,"Patrick","Legrand",20,"Bayonne","France",43.543,6.34,donationPatrick,categoryPatrick,historyPatrick);
    
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("ALL DATA ARE SETTED");
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("DEBUT DES TESTS");
		System.out.println("===============");
		System.out.println("===============");
	}
	
	
	@DisplayName("Test fonction connexion")
	@Test
    void testCnnexionUser() {
		boolean connexion = userAdmin.connexion();
		assertTrue(connexion);
    }
	
	
	@DisplayName("Test fonction déconnexion")
	@Test
    void testDeconnexionUser() {
		boolean deconnexion = userAdmin.deconnexion();
		assertTrue(deconnexion);
    }

	@DisplayName("Test fonction administrateur valide association")
	@Test
    void testValidateAssociation() {
		boolean validate = admin.valideAssociation(restoDuCoeur);
		assertTrue(validate);
    }
	
	
	@DisplayName("Test fonction administrateur refuse association")
	@Test
    void testRefuseAssociation() {
		boolean validate = admin.refuseAssociation(restoDuCoeur);
		assertTrue(validate);
    }
	
	@DisplayName("Test si un donateur a fait un don")
	@Test
    void testDonorHasDonate() {
		boolean donate = donor1.alreadyDonate();
		assertTrue(donate);
    }
	
	@DisplayName("Test des catégories du resto du coeur")
	@Test
	void testCategorieRestoDuCoeur() {
		String categorieStr = restoDuCoeur.toStringCategorie();
		String testCategorie = "Humanitaire, Alimentaire";
		assertEquals(testCategorie,categorieStr);
	}
	
	@DisplayName("Test des donations acceptées par les resto du coeur")
	@Test
	void testDonationRestoDuCoeur() {
		String donationStr = restoDuCoeur.toStringAcceptedDon();
		String testDonation = "Don d'argent, Don de matériel, Don de temps";
		assertEquals(testDonation,donationStr);
	}
	
	@DisplayName("Test Total Don")
	@Test
	void testTotalDon() {
		double total = donor1.totalDon();
		assertEquals(550,total,DELTA);
	}
	
	@DisplayName("Test Total Don du Donor1 pour l'association Resto du coeur")
	@Test
	void testTotalDonForOneAssociation() {
		double total = donor1.totalDonForOneAssociation(restoDuCoeur);
		assertEquals(550,total,DELTA);
	}
	
	
	/*@Test
	public void testPaswwordAdmin() {
		assertThat(donationPatrick, containsInAnyOrder(
                hasProperty("name", is("Spring in Action")),
                hasProperty("name", is("Java in Action"))
        ));
	}
	
	*/
	
	
/*	@DisplayName("Test Total Don Mocks")
	@Test
	void testTotalDonMocks() {
		double total = donor1.totalDon();
		when(donor1.totalDon()).thenReturns(550);
		assertEquals(550,total,DELTA);
		verify(donor1).totalDon();
	} */
	
	
	
	
	
}
