package com.example.Express.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Temporal(TemporalType.DATE)
    private Date dateFin;

    private boolean renouvelable;

    // Getters et setters

    public Emprunt() {
        // Constructeur par défaut
    }

    public Emprunt(Livre livre, Utilisateur utilisateur, Date dateDebut, Date dateFin, boolean renouvelable) {
        this.livre = livre;
        this.utilisateur = utilisateur;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.renouvelable = renouvelable;
    }

    // Méthode pour renouveler l'emprunt
    public void renouvelerEmprunt() {
        if (renouvelable) {
            // Logique pour renouveler l'emprunt
            // Par exemple, mise à jour de la date de fin
            // ...
        } else {
            throw new UnsupportedOperationException("Cet emprunt ne peut pas être renouvelé.");
        }
    }

    // Méthode pour gérer le retour du livre
    public void retournerLivre() {
        // Logique pour gérer le retour du livre
        // Par exemple, mise à jour de la date de retour, vérification des retards, etc.
        // ...
    }
}
