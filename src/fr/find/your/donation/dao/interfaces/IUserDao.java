package fr.find.your.donation.dao.interfaces;

import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.User;


//Cette interface se concentre sur la classe EpisodeDAO
public interface IUserDao {

	// Les méthodes en lecture seules
	public User readUser(int id) throws DaoException;

	public List<User> readAllUser() throws DaoException;


	// Les méthodes d'écritures (d'édition)
	public User createUser(User user, final boolean useTransaction) throws DaoException;

	public void updateUser(User user, final boolean useTransaction) throws DaoException;

	public void deletUser(User user, final boolean useTransaction) throws DaoException;

}
