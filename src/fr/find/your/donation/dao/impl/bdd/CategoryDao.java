package fr.find.your.donation.dao.impl.bdd;

import java.util.List;

import fr.find.your.donation.dao.interfaces.ICategoryDao;
import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Category;

public class CategoryDao implements ICategoryDao{
	
private final DaoBddHelper bdd;
	
	/**
	 * Le constructeur de notre classe.
	 * Essaye de récupérer une instance de la classe DaoBddHelper.
	 * 
	 * @throws DaoException
	 */
	public CategoryDao() throws DaoException {
		this.bdd = DaoBddHelper.getInstance();
	}

	@Override
	public Category readCategory(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> readAllCategory() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> readCategoryByDonor(int idDonor) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> readCategoryByAssociation(int idAssociaiton) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category createCategory(Category category, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(Category category, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(Category category, boolean useTransaction) throws DaoException {
		// TODO Auto-generated method stub
		
	}

}
