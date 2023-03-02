package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.IDonorDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Donor;

public class DonorDao implements IDonorDao{
	
private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public DonorDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public Donor readDonor(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donor> readAllDonor() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Donor createDonor(Donor donor, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDonor(Donor donor, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDonor(Donor donor, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
