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
    private int numero;
    private LocalDate date;
    
    private Vol vol;
    
    
    
    @ManyToOne
    @JoinColumn(name = "idClient")
	private Client client;

  
    public Reservation() {
    }



    
    
    
    public void Annuler() {
        // TODO implement here
    }


    public void Confirmer() {
        // TODO implement here
    }

}