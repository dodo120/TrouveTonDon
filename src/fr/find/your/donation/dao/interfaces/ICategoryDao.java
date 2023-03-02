package fr.find.your.donation.dao.interfaces;

import java.util.List;

import fr.find.your.donation.exceptions.DaoException;
import fr.find.your.donation.model.Category;


//Cette interface se concentre sur la classe EpisodeDAO
public interface ICategoryDao {

	// Les méthodes en lecture seules
	public Category readCategory(int id) throws DaoException;

	public List<Category> readAllCategory() throws DaoException;

	public List<Category> readCategoryByDonor(int idDonor) throws DaoException;

	public List<Category> readCategoryByAssociation(int idAssociaiton) throws DaoException;

	// Les méthodes d'écritures (d'édition)
	public Category createCategory(Category category, final boolean useTransaction) throws DaoException;

	public void updateCategory(Category category, final boolean useTransaction) throws DaoException;

	public void deleteCategory(Category category, final boolean useTransaction) throws DaoException;

}