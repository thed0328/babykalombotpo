/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babykalombotp1.gestionMagasin;
import java.util.ArrayList;

/**
 *
 * @author babyk
 */
public class Commande {
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;
    
    public Commande(int idCommande, Client client, ArrayList<Produit> produits){
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(produits);
        
        double somme = 0.0;
        for (Produit p: this.produitsCommandes){
            somme = somme + p.getPrix();
        }
        this.total = somme; }
        
    public void afficherDetailsCommande(){
        System.out.println("**** COMMANDE N°" + idCommande + " ***");
        client.afficherDetails();
        System.out.println("Produits commandes :");
        for(int i = 0; i < produitsCommandes.size(); i++){
            System.out.println("- " + produitsCommandes.get(i).getNom() + " : " + produitsCommandes.get(i).getPrix() + " EUR");
        }
        System.out.println("Total a payer : " + total + " EUR");
        System.out.println("***********************"); }
}
