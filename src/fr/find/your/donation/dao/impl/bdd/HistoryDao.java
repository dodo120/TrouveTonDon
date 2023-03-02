package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.IHistoryDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.History;

public class HistoryDao implements IHistoryDao{
	
private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public HistoryDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public History readHistory(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<History> readAllHistory() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<History> readHistoryByDonor(int idDonor) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<History> readHistoryByAssociation(int idAssociaiton) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public History createHistory(History history, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateHistory(History history, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteHistory(History history, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
