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
@Table(name="User")
@NamedQueries({
		@NamedQuery(name = "User.findById", query = "SELECT user FROM User user WHERE user.id = :id"),
		@NamedQuery(name = "User.findAll", query = "SELECT user FROM User user"),
})
public class User {
	
	private int id;
	private String login;
	private String password;
	
	
	public User() {}
	
	
	public User(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
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
	
	@Column(name = "Login", nullable = false)
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Column(name = "Password", nullable = false)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean connexion() {
		if(login.equals("admin") && password.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean deconnexion() {
		return true;
	}
	
	

	

}
