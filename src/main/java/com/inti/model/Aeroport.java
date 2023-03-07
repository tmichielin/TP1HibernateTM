package com.inti.model;
import java.util.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Aeroport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAer;
    private String nom;
    
    
    
    @OneToMany(mappedBy = "vol", targetEntity = Vol.class)
    private List<Vol> listeVol;
    
    
    public Aeroport() {
    }
    
    

	public Aeroport(String nom) {
		super();
		this.nom = nom;
		
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	



	
    
    



}