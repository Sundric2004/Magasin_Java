/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdel
 */
public class Magasin {
    private List <Produit> produits;
    
    public Magasin(){
        this.produits = new ArrayList<>();
    }
    
    public void ajouterProduit(Produit p){
        produits.add(p);
    }
    
    public void afficherProduitsDisponibles(){
        System.out.println(produits);
    }
   
    public Produit trouverProduitParNom(String nom){
        for (Produit p : produits){
            if (p.getNom().equalsIgnoreCase(nom)){
                return p;
            }
        }
        return null;
    }
}
