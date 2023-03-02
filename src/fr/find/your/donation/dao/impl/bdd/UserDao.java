package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.IUserDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.User;

public class UserDao implements IUserDao {
	
private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public UserDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public User readUser(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> readAllUser() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletUser(User user, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
