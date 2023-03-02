package fr.find.your.donation.dao.interfaces;


import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Donation;


//Cette interface se concentre sur la classe EpisodeDAO
public interface IDonationDao {

	// Les méthodes en lecture seules
	public Donation readDonation(int id) throws DaoException;

	public List<Donation> readAllDonation() throws DaoException;

	public List<Donation> readDonationByDonor(int idDonor) throws DaoException;

	public List<Donation> readDonationByAssociation(int idAssociaiton) throws DaoException;

	// Les méthodes d'écritures (d'édition)
	public Donation createDonation(Donation donation, final boolean useTransaction) throws DaoException;

	public void updateDonation(Donation donation, final boolean useTransaction) throws DaoException;

	public void deleteDonation(Donation donation, final boolean useTransaction) throws DaoException;

}