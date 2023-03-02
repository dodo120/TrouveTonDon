package fr.find.your.donation.dao;

import fr.find.your.donation.dao.impl.bdd.AdminDao;
import fr.find.your.donation.dao.impl.bdd.AssociationDao;
import fr.find.your.donation.dao.impl.bdd.CategoryDao;
import fr.find.your.donation.dao.impl.bdd.DonationDao;
import fr.find.your.donation.dao.impl.bdd.DonorDao;
import fr.find.your.donation.dao.impl.bdd.HistoryDao;
import fr.find.your.donation.dao.impl.bdd.UserDao;
import fr.find.your.donation.dao.interfaces.IAdminDao;
import fr.find.your.donation.dao.interfaces.IAssociationDao;
import fr.find.your.donation.dao.interfaces.ICategoryDao;
import fr.find.your.donation.dao.interfaces.IDonationDao;
import fr.find.your.donation.dao.interfaces.IDonorDao;
import fr.find.your.donation.dao.interfaces.IHistoryDao;
import fr.find.your.donation.dao.interfaces.IUserDao;
import fr.find.your.donation.exceptions.DaoException;

//Un pattern DAO permet de facilement créer un lien entre "nos classes Java et notre BDD PostegreSQL"
//Cette classe est de type Factory. Le pattern Factory permet d'avoir plusieurs classes abstraites qui auront chacune leurs 
//Spécificités. Pour faciliter la création selon le cas, nous créons un Factory (une usine) qui s'occupe de l'instanciation des classes
//selon notre besoin, tout ça depuis une seule et même classe (donc pas besoin d'avoir une référence entre toutes les classes abstraites).
//
//Vous pouvez en apprendre plus sur le pattern DAO ici : https://cyrille-herby.developpez.com/tutoriels/java/mapper-sa-base-donnees-avec-pattern-dao/
//Et sur le pattern Factory ici : https://refactoring.guru/fr/design-patterns/factory-method
//https://refactoring.guru/fr/design-patterns/abstract-factory
public class DaoFactory {

	private static DaoFactory instance = null;

	private IAdminDao adminDao = null;
	private IAssociationDao associationDao = null;
	private ICategoryDao categoryDao = null;
	private IDonationDao donationDao = null;
	private IDonorDao donorDao = null;
	private IHistoryDao historyDao = null;
	private IUserDao userDao = null;


	/**
	 * Ici, nous implémentons le côté Singleton de cette classe.
	 * S'il n'y a pas d'instance déjà créée, nous ne créons une, sinon nous
	 * retournons l'instance déjà créée.
	 * Vous pouvez en apprendre plus sur le pattern Singleton ici :
	 * https://refactoring.guru/fr/design-patterns/singleton
	 *
	 * @return instance de la classe DaoFactory
	 */
	public static DaoFactory getInstance() {
		if (instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}

	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe SerieDAO
	 *
	 * @return instance de la classe AdminDAO
	 * @throws DaoException
	 */
	public IAdminDao getAdminDao() {
		if (this.adminDao == null) {
			try {
				this.adminDao = new AdminDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.adminDao;
	}

	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe SaisonDAO
	 *
	 * @return instance de la classe AssociationDAO
	 * @throws DaoException
	 */
	public IAssociationDao getAssociationDao() throws DaoException {
		if (this.associationDao == null) {
			try {
				this.associationDao = new AssociationDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.associationDao;
	}

	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe EpisodeDAO
	 *
	 * @return instance de la classe CategoryDAO
	 * @throws DaoException
	 */
	public ICategoryDao getCategoryDao() throws DaoException {
		if (this.categoryDao == null) {
			try {
				this.categoryDao = new CategoryDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.categoryDao;
	}
	
	
	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe EpisodeDAO
	 *
	 * @return instance de la classe DonationDAO
	 * @throws DaoException
	 */
	public IDonationDao getDonationDao() throws DaoException {
		if (this.donationDao == null) {
			try {
				this.donationDao = new DonationDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.donationDao;
	}
	
	
	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe EpisodeDAO
	 *
	 * @return instance de la classe DonorDAO
	 * @throws DaoException
	 */
	public IDonorDao getDonorDao() throws DaoException {
		if (this.donorDao == null) {
			try {
				this.donorDao = new DonorDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.donorDao;
	}
	
	
	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe EpisodeDAO
	 *
	 * @return instance de la classe HistoryDAO
	 * @throws DaoException
	 */
	public IHistoryDao getHistoryDao() throws DaoException {
		if (this.historyDao == null) {
			try {
				this.historyDao = new HistoryDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.historyDao;
	}
	
	
	/**
	 * Ici, le cas est le même que précédemment en incluant une clause try-catch
	 * pour
	 * attraper de potentielles erreurs pendant l'instanciation.
	 * De plus, cette méthode s'occupe seulement de la classe EpisodeDAO
	 *
	 * @return instance de la classe UserDAO
	 * @throws DaoException
	 */
	public IUserDao getUserDao() throws DaoException {
		if (this.userDao == null) {
			try {
				this.userDao = new UserDao();
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return this.userDao;
	}
	

}
