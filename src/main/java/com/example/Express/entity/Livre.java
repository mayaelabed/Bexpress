package com.example.Express.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Livre {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title_livre;
    private String Auteur;
    private Date Date_publ;
    private long Num_ISBN;
    private int nombreExemplaires;

    public Livre(){
        
    }
    public Livre(Long id, String title_livre, String auteur, Date date_publ, long num_ISBN, int nombreExemplaires) {
        this.id = id;
        Title_livre = title_livre;
        Auteur = auteur;
        Date_publ = date_publ;
        Num_ISBN = num_ISBN;
        this.nombreExemplaires = nombreExemplaires;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle_livre() {
        return Title_livre;
    }
    public void setTitle_livre(String title_livre) {
        Title_livre = title_livre;
    }
    public String getAuteur() {
        return Auteur;
    }
    public void setAuteur(String auteur) {
        Auteur = auteur;
    }
    public Date getDate_publ() {
        return Date_publ;
    }
    public void setDate_publ(Date date_publ) {
        Date_publ = date_publ;
    }
    public long getNum_ISBN() {
        return Num_ISBN;
    }
    public void setNum_ISBN(long num_ISBN) {
        Num_ISBN = num_ISBN;
    }
    public int getNombreExemplaires() {
        return nombreExemplaires;
    }
    public void setNombreExemplaires(int nombreExemplaires) {
        this.nombreExemplaires = nombreExemplaires;
    }

    

    // Getters et setters
}
