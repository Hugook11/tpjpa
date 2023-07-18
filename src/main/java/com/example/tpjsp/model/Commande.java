package com.example.tpjsp.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomClient;
    private String numeroTelephone;
    private Date jourRecuperation;
    private int quantiteProduit;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

}