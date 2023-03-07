package com.inti.model;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int idReservation;
	
    private int numero;
    private LocalDate date;
    
    @ManyToOne
    @JoinColumn(name = "idClient")
	private Client client;

    /**
     * Default constructor
     */
    public Reservation() {
    }

    
    public void Annuler() {
        // TODO implement here
    }


    public void Confirmer() {
        // TODO implement here
    }


	public Reservation(int numero, LocalDate date, Client client) {
		super();
		this.numero = numero;
		this.date = date;
		this.client = client;
	}


	public int getIdReservation() {
		return idReservation;
	}


	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", numero=" + numero + ", date=" + date + ", client="
				+ client + "]";
	}
    
    
    
    
    

}