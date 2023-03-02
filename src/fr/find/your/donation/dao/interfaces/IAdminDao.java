package fr.find.your.donation.dao.interfaces;

import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Admin;

//Cette interface se concentre sur la classe EpisodeDAO
public interface IAdminDao {

	// Les méthodes en lecture seules
	public Admin readAdmin(int id) throws DaoException;

	public List<Admin> readAllAdmin() throws DaoException;


	// Les méthodes d'écritures (d'édition)
	public Admin createAdmin(Admin admin, final boolean useTransaction) throws DaoException;

	public void updateAdmin(Admin admin, final boolean useTransaction) throws DaoException;

	public void deleteAdmin(Admin admin, final boolean useTransaction) throws DaoException;

}