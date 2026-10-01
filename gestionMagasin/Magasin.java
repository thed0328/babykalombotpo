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
public class Magasin {private ArrayList<Produit> produits;
    
    public Magasin(){
        this.produits = new ArrayList<Produit>(); }
        
    public void ajouterProduit(Produit produit){
        produits.add(produit); }
        
    public void afficherProduitsDisponibles(){
        System.out.println("--- Produits disponibles en magasin ---");
        for(int i = 0; i < produits.size(); i++){
            produits.get(i).afficherDetails();
        }
    }
    
    public Produit trouverProduitParNom(String nom){
        for(int i = 0; i < produits.size(); i++){
            if(produits.get(i).getNom().equalsIgnoreCase(nom)){
                return produits.get(i);
            }
        }
        return null; 
    }
    
}
