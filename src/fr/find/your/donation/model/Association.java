package fr.find.your.donation.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Association")
@NamedQueries({
		@NamedQuery(name = "Association.findById", query = "SELECT association FROM Association association WHERE association.id = :id"),
		@NamedQuery(name = "Association.findAll", query = "SELECT association FROM Association association"),
		@NamedQuery(name = "Association.findByTypeOfDonation", query = "SELECT association FROM Association association, IN(association.donation) donation WHERE donation.id = :id"),
		@NamedQuery(name = "Association.findByTypeOfCategory", query = "SELECT association FROM Association association, IN(association.category) category WHERE category.id = :id")
})
public class Association extends User{
	
	private int id;
	private String address;
	private String website;
	private String phone;
	private String image;
	private String description;
	private List<Category> category;
	private List<Donation> donation;
	private boolean validate;
	private List<History> listOfDonor;
	
	
	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Association(int idUser, String login, String password, int id, String address, String website, String phone, String image, String description,
				List<Donation> donation,List<Category> category, boolean validate,List<History> listOfDonor) {
			super(idUser,login,password);
			this.id = id;
			this.address = address;
			this.website = website;
			this.phone = phone;
			this.image = image;
			this.description = description;
			this.category = category;
			this.donation = donation;
			this.validate = validate;
			this.listOfDonor = listOfDonor;
	}
		
	@Column(name = "Id", nullable = false)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "Address", nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "Website", nullable = false)
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	@Column(name = "Phone", nullable = false)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name = "Image", nullable = false)
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Column(name = "Description", nullable = false)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_category_association", referencedColumnName = "Id")
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_donation_association", referencedColumnName = "Id")
	public List<Donation> getDonation() {
		return donation;
	}
	public void setDonation(List<Donation> donation) {
		this.donation = donation;
	}
	
	@Column(name = "Validate", nullable = false)
	public boolean isValidate() {
		return validate;
	}
	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_history_association", referencedColumnName = "Id")
	public List<History> getListOfDonor() {
		return listOfDonor;
	}

	public void setListOfDonor(List<History> listOfDonor) {
		this.listOfDonor = listOfDonor;
	}
	
	
	public String toStringCategorie() {
		String response = "";
		for(int i = 0 ; i < category.size() ; i++) {
			if(i == category.size()-1) {
				response += category.get(i).getName();
			} else {
				response += category.get(i).getName() + ", ";
			}
			
		}
		return response;
	}
	
	
	public String toStringAcceptedDon() {
		String response = "";
		for(int i = 0 ; i < donation.size() ; i++) {
			if(i == donation.size()-1) {
				response += donation.get(i).getName();
			} else {
				response += donation.get(i).getName() + ", ";
			}
			
		}
		return response;
	}
	
	
	

}
