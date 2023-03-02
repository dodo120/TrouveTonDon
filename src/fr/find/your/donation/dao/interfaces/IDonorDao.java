package fr.find.your.donation.dao.interfaces;

import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Donor;


//Cette interface se concentre sur la classe EpisodeDAO
public interface IDonorDao {

	// Les méthodes en lecture seules
	public Donor readDonor(int id) throws DaoException;

	public List<Donor> readAllDonor() throws DaoException;


	// Les méthodes d'écritures (d'édition)
	public Donor createDonor(Donor donor, final boolean useTransaction) throws DaoException;

	public void updateDonor(Donor donor, final boolean useTransaction) throws DaoException;

	public void deleteDonor(Donor donor, final boolean useTransaction) throws DaoException;

}