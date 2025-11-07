/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author abdel
 */
public class Produit {
    private int id;
    private String nom;
    private int prix;
    private int quantite;
    
    public Produit(int id, String nom, int p, int q ) {
        this.id = id;
        this.nom = nom;
        prix = p;
        quantite = q;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getPrix(){
        return prix;
    }
    
    public int getQuantite(){
        return quantite;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrix(int p){
        prix = p;
    }
    
    public void setQuantite(int q){
        quantite = q;
    }
    
    public void afficherDetails(){
        System.out.println(
        "Les details du produit sont : "
                + "Id : " + id
                + "Nom : " + nom
                + "Prix : " + prix
                + "Quantite" + quantite
        );
    }
    
    
    
}
