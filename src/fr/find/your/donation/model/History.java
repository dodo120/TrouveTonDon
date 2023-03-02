package fr.find.your.donation.model;

import java.util.Date;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "History")
@NamedQueries({
		@NamedQuery(name = "History.findById", query = "SELECT hist FROM History hist WHERE hist.id = :id"),
		@NamedQuery(name = "History.findAll", query = "SELECT hist FROM History hist"),
		@NamedQuery(name = "History.findByDonor", query = "SELECT hist FROM History hist, hist.donor d WHERE d.id = :id"),
		@NamedQuery(name = "History.findByAssociation", query = "SELECT hist FROM History hist, hist.association assoc WHERE assoc.id = :id")
})
public class History {
	
	private int id;
	private Association association;
	private Donor donor;
	private Date date;
	private double montant;
	
	public History() {}
	
	public History(int id, Association association, Donor donor, Date date, double montant) {
		super();
		this.id = id;
		this.association = association;
		this.donor = donor;
		this.date = date;
		this.montant = montant;
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
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_association", referencedColumnName = "Id")
	public Association getAssociation() {
		return association;
	}
	public void setAssociation(Association association) {
		this.association = association;
	}
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_donor", referencedColumnName = "Id")
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	
	@Column(name = "Date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "Montant", nullable = false)
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
