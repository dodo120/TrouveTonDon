package fr.find.your.donation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Donation")
@NamedQueries({
		@NamedQuery(name = "Donation.findById", query = "SELECT donation FROM Donation donation WHERE donation.id = :id"),
		@NamedQuery(name = "Donation.findAll", query = "SELECT donation FROM Donation donation")
})
public class Donation {
	
	private int id;
	private String name;
	
	public Donation() {};
	
	public Donation(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "Name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
