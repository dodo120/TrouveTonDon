package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.IAssociationDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Association;

public class AssociationDao implements IAssociationDao {
	
private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public AssociationDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public Association readAssociation(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Association> readAllAssociation() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Association> readAssociationByDonation(List<Integer> idDonations) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Association> readAssociationByCategory(List<Integer> idCategorys) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Association createAssociation(Association association, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAssociation(Association association, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAssociation(Association association, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
