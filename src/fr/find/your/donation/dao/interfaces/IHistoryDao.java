package fr.find.your.donation.dao.interfaces;

import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.History;


//Cette interface se concentre sur la classe EpisodeDAO
public interface IHistoryDao {

	// Les méthodes en lecture seules
	public History readHistory(int id) throws DaoException;

	public List<History> readAllHistory() throws DaoException;

	public List<History> readHistoryByDonor(int idDonor) throws DaoException;

	public List<History> readHistoryByAssociation(int idAssociaiton) throws DaoException;

	// Les méthodes d'écritures (d'édition)
	public History createHistory(History history, final boolean useTransaction) throws DaoException;

	public void updateHistory(History history, final boolean useTransaction) throws DaoException;

	public void deleteHistory(History history, final boolean useTransaction) throws DaoException;

}
