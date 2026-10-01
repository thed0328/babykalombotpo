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
public class Panier {private ArrayList<Produit> produits;
    
    public Panier(){
        this.produits = new ArrayList<Produit>(); }
    
    public ArrayList<Produit> getProduits(){
        return this.produits;
    }
        
    public void ajouterProduit(Produit produit){
        produits.add(produit);
        System.out.println(produit.getNom() + " a ete ajoute au panier."); }
        
    public void supprimerProduit(Produit produit){
        produits.remove(produit);
        System.out.println(produit.getNom() + " a ete retire du panier."); }
   
        
    public void afficherPanier(){
        if(produits.isEmpty()){
            System.out.println("Le panier est vide.");
        } else {
            System.out.println("*** Contenu du panier ***");
            for(int i = 0; i < produits.size(); i++){
                produits.get(i).afficherDetails();
            }
        }
    }
    
    public double calculerTotal(){
        double total = 0;
        for(int i = 0; i < produits.size(); i++){
            total = total + produits.get(i).getPrix();
        }
        return total; }
        
   
    
}
