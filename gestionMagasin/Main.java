/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babykalombotp1.gestionMagasin;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author babyk
 */
public class Main {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Magasin monMagasin = new Magasin();
        monMagasin.ajouterProduit(new Produit(1, "Ordinateur", 800.0, 5));
        monMagasin.ajouterProduit(new Produit(2, "Souris", 25.5, 20));
        monMagasin.ajouterProduit(new Produit(3, "Clavier", 45.0, 10));
        
        Client client1 = new Client(101, "Baby", "baby@email.com");
        Panier panierClient = new Panier();
        
        int choix = 0;
        int numCommande = 1;
        
        while(choix != 5){
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            
            choix = sc.nextInt();
            sc.nextLine(); 
            
            if(choix == 1){
                monMagasin.afficherProduitsDisponibles();
            }
            else if(choix == 2){
                System.out.print("Entrez le nom du produit a ajouter : ");
                String nomProd = sc.nextLine();
                Produit p = monMagasin.trouverProduitParNom(nomProd);
                
                if(p != null){
                    panierClient.ajouterProduit(p);
                } else {
                    System.out.println("Produit introuvable !");
                }
            }
            else if(choix == 3){
                panierClient.afficherPanier();
                System.out.println("Total actuel : " + panierClient.calculerTotal() + " EUR");
            }
            else if(choix == 4){
                if(panierClient.getProduits().isEmpty()){
                    System.out.println("Votre panier est vide, commandez d'abord quelque chose !");
                } else {
                    Commande cmd = new Commande(numCommande, client1, panierClient.getProduits());
                    cmd.afficherDetailsCommande();
                    numCommande++;
                    panierClient = new Panier(); 
                }
            }
            else if(choix == 5){
                System.out.println("Au revoir !");
            }
            else {
                System.out.println("Choix incorrect, reessayez.");
            }
        }
        sc.close();
    }
    
}
