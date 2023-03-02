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
@Table(name = "Category")
@NamedQueries({
		@NamedQuery(name = "Category.findById", query = "SELECT category FROM Category category WHERE category.id = :id"),
		@NamedQuery(name = "Category.findAll", query = "SELECT category FROM Category category")
})
public class Category {
	
	private int id;
	private String name;
	
	public Category() {}
	
	public Category(int id, String name) {
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
