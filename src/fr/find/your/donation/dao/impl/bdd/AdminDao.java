package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.IAdminDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Admin;
import jakarta.ws.rs.Path;

@Path("/admin")
public class AdminDao implements IAdminDao{
	
	private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public AdminDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public Admin readAdmin(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> readAllAdmin() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin createAdmin(Admin admin, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdmin(Admin admin, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(Admin admin, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
