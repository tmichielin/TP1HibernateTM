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
    
    @OneToMany(mappedBy = "aeroport", targetEntity = Vol.class)
    private List<Aeroport> listeAeroport; 
    
    public Aeroport() {
    }
    
    

	public Aeroport(String nom, List<Aeroport> listeAeroport) {
		super();
		this.nom = nom;
		this.listeAeroport = listeAeroport;
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Aeroport> getListeAeroport() {
		return listeAeroport;
	}

	public void setListeAeroport(List<Aeroport> listeAeroport) {
		this.listeAeroport = listeAeroport;
	}



	@Override
	public String toString() {
		return "Aeroport [idAer=" + idAer + ", nom=" + nom + ", listeAeroport=" + listeAeroport + "]";
	}
    
    

	
}