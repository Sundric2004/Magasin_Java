/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionMagasin;

import java.util.Scanner;

/**
 *
 * @author abdel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        Magasin magasin = new Magasin();

        magasin.ajouterProduit(new Produit(1,"Pomme", 2,10));
        magasin.ajouterProduit(new Produit(2, "Banane", 9, 20));
        magasin.ajouterProduit(new Produit(3,"Mangue", 25,30));
        magasin.ajouterProduit(new Produit(4,"Fraise", 30,40));

        Panier panier = new Panier();

        int choix;

        do {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print(" Entrez votre choix : ");
            choix = sc.nextInt();
           
            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;

                case 2:
                    System.out.print("Entrez le nom du produit à ajouter : ");
                    String nomProduit = sc.nextLine();
                    Produit produitTrouve = magasin.trouverProduitParNom(nomProduit);
                    if (produitTrouve != null) {
                        panier.ajouterProduit(produitTrouve);
                        System.out.println(produitTrouve.getNom() + " ajouté au panier !");
                    } else {
                        System.out.println("Produit introuvable !");
                    }
                    break;

                case 3:
                    panier.afficherPanier();
                    break;

                case 4:
                    if (panier.getProduits().isEmpty()) {
                        System.out.println(" Votre panier est vide !");
                    } else {
                        System.out.println("Commande passée avec succès !");
                    }
                    break;

                case 5:
                    System.out.println(" Merci d'avoir visité notre magasin !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 5);
        
        
    }
    
}
