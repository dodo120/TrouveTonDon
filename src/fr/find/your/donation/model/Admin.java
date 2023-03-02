package fr.find.your.donation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
@NamedQueries({
		@NamedQuery(name = "Admin.findById", query = "SELECT admin FROM Admin admin WHERE admin.id = :id"),
		@NamedQuery(name = "Admin.findAll", query = "SELECT admin FROM Admin admin")
})
public class Admin extends User {

	private int id;

	
	public Admin(User user) {
		super();
		this.id = user.getId();
		// TODO Auto-generated constructor stub
	}
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String login, String password) {
		super(id, login, password);
		// TODO Auto-generated constructor stub
	}

	@Column(name = "Id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public boolean valideAssociation(Association association) {
		return true;
	}
	
	
	public boolean refuseAssociation(Association association) {
		return true;
	}
	
	
}
