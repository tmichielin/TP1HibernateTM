package com.inti.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class CompagnieAerienne {

	public CompagnieAerienne() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idComp;

	private String nom;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Vol_CA", 
	joinColumns = @JoinColumn(name = "idCA"), 
	inverseJoinColumns = @JoinColumn(name = "idV"))
	private List<Vol> listeVol;

	public CompagnieAerienne(String nom) {
		super();
		this.nom = nom;
	}

	public int getIdComp() {
		return idComp;
	}

	public void setIdComp(int idComp) {
		this.idComp = idComp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Vol> getListeVol() {
		return listeVol;
	}

	public void setListeVol(List<Vol> listeVol) {
		this.listeVol = listeVol;
	}

	@Override
	public String toString() {
		return "CompagnieAerienne [idComp=" + idComp + ", nom=" + nom + ", listeVol=" + listeVol + "]";
	}

}