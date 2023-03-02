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
@Table(name = "Donor")
@NamedQueries({
		@NamedQuery(name = "Donor.findById", query = "SELECT donor FROM Donor donor WHERE donor.id = :id"),
		@NamedQuery(name = "Donor.findAll", query = "SELECT donor FROM Donor donor"),
		@NamedQuery(name = "Donor.findByTypeOfDonation", query = "SELECT donor FROM Donor donor, IN(donor.typeOfDonation) donation WHERE donation.id = :id"),
		@NamedQuery(name = "Donor.findByTypeOfCategory", query = "SELECT donor FROM Donor donor, IN(donor.typeOfCategory) category WHERE category.id = :id")
})
public class Donor extends User {
	
	private int id;
	private String firstName;
	private String lastName;
	private int radius;
	private String city;
	private String country;
	private double latitude;
	private double longitude;
	private List<Donation> typeOfDonation;
	private List<Category> typeOfCategory;
	private List<History> history;
	
	
	public Donor() {super();}
	
	
	public Donor(int idUser, String login, String password, int id, String firstName, String lastName, int radius, String city, String country, double latitude,
			double longitude, List<Donation> typeOfDonation, List<Category> typeOfCategory, List<History> history) {
		super(idUser,login,password);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.radius = radius;
		this.city = city;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.typeOfDonation = typeOfDonation;
		this.typeOfCategory = typeOfCategory;
		this.history = history;
	}
	
	@Column(name = "Id", nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "FirstName", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "LastName", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "Radius", nullable = false)
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Column(name = "City", nullable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "Country", nullable = false)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name = "Latitude", nullable = false)
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	@Column(name = "Longitude", nullable = false)
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_donation_donor", referencedColumnName = "Id")
	public List<Donation> getTypeOfDonation() {
		return typeOfDonation;
	}
	public void setTypeOfDonation(List<Donation> typeOfDonation) {
		this.typeOfDonation = typeOfDonation;
	}
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_category_donor", referencedColumnName = "Id")
	public List<Category> getTypeOfCategory() {
		return typeOfCategory;
	}
	public void setTypeOfCategory(List<Category> typeOfCategory) {
		this.typeOfCategory = typeOfCategory;
	}
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_history_donor", referencedColumnName = "Id")
	public List<History> getHistory() {
		return history;
	}
	public void setHistory(List<History> history) {
		this.history = history;
	}
	
	
	public float totalDon() {
		float total = 0;
		for(int i = 0 ; i < history.size() ; i++) {
			total += history.get(i).getMontant();
		}
		return total;
	}
	
	
	public double totalDonForOneAssociation(Association association) {
		double total = 0;
		for(int i = 0 ; i < history.size() ; i++) {
			if(history.get(i).getAssociation() == association) {
				total += history.get(i).getMontant();
			}
		}
		return total;
	}
	
	
	public boolean alreadyDonate() {
		if(history.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

}
