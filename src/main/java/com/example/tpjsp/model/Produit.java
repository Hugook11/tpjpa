package com.example.tpjsp.model;

import jakarta.persistence.*;


@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private boolean disponibilite;
    private String photoUrl;
}