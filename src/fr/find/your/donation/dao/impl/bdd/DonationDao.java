package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.IDonationDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Donation;

public class DonationDao implements IDonationDao{
	
private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public DonationDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public Donation readDonation(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donation> readAllDonation() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donation> readDonationByDonor(int idDonor) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donation> readDonationByAssociation(int idAssociaiton) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Donation createDonation(Donation donation, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDonation(Donation donation, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDonation(Donation donation, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
