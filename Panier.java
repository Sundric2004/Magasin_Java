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
public class Panier {
    
    private List <Produit> produits;
    
    public Panier(){
        this.produits = new ArrayList();
    }
    
    public void ajouterProduit(Produit p){
        produits.add(p);
    }
    
    public void supprimerProduit(Produit p){
        produits.remove(p);
    }
    
    public void afficherPanier(){
        System.out.println(produits);
    }
    
    public int calculerTotal(){
        int total = 0;
        for (Produit p : produits){
            total += p.getPrix() ; 
        }
        return total;
    }
    
    public List <Produit> getProduits(){
        return produits;
    }
    
}
