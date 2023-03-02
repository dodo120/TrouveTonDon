package fr.find.your.donation.dao.interfaces;

import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Association;


//Cette interface se concentre sur la classe EpisodeDAO
public interface IAssociationDao {

	// Les méthodes en lecture seules
	public Association readAssociation(int id) throws DaoException;

	public List<Association> readAllAssociation() throws DaoException;

	public List<Association> readAssociationByDonation(List<Integer> idDonations) throws DaoException;

	public List<Association> readAssociationByCategory(List<Integer> idCategorys) throws DaoException;

	// Les méthodes d'écritures (d'édition)
	public Association createAssociation(Association association, final boolean useTransaction) throws DaoException;

	public void updateAssociation(Association association, final boolean useTransaction) throws DaoException;

	public void deleteAssociation(Association association, final boolean useTransaction) throws DaoException;

}