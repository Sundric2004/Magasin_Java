/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author abdel
 */
public class Commande {
    
    private int idCommande;
    private Client client;
    private Panier produitsCommandes;
    private int total;
    
    public Commande(Client c, Panier p){
        client = c;
        produitsCommandes = p;
    }
    
    public void afficherDetailsCommande(){
        System.out.println("Les details de la commande sont :"
                + "Id commande : " + idCommande
                + "Client : " + client.getNom()
                + "Les produits commandés : " + produitsCommandes.getProduits()
                + "Prix Total : " + produitsCommandes.calculerTotal()
        );
    }
    
}
