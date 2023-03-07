package com.inti.model;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */

@Entity
@Table
public class Passager {

    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idP;
    private String nom;
    private String prenom;
    
    @OneToMany(mappedBy = "passager", targetEntity = Reservation.class)
    private List<Reservation> reservation;
    
	public Passager() {
	    }

	public Passager(String nom, String prenom, List<Reservation> reservation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.reservation = reservation;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Passager [idP=" + idP + ", nom=" + nom + ", prenom=" + prenom + ", reservation=" + reservation + "]";
	}
	
	
}