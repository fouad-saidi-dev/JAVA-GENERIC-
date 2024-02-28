package com.fouadev.exercice2.metier;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{

    List<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : produits) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {

        Produit removeProduit = null;

        for (Produit p : produits) {
            if (p.getId() == id){
                removeProduit = p;
            }
        }
        if (removeProduit != null) {
            produits.remove(removeProduit);
            System.out.println("Product deleted "+removeProduit);
        }

    }
}
