package src;

/**
 * Décrivez votre classe Livre ici.
 *
 * @author Laye Kemo DIARSO - Michel NGUYEN
 * @version 28/04/2020
 */
public class Livre
{
	
	// add d'un côté = set de l'autre
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre = "Histoire de l'Art";
    private double prixVente = 50;
    private Auteur auteur;
    private int nbVendus = 0;
        
    /**
     * Constructeur d'objets de classe Livre
     */
    public Livre(){ /* initialisation des variables d'instance */ }

    /**
     * Méthode qui calcule le nouveau prix d'un livre à partir d'une promotion
     * @param  promotion le pourcentage de la promotion (ex 0.3)
     */

    public void promotion(double promotion)
    {
        this.prixVente = (1 - promotion) * this.prixVente;
    }
    
    public String infoLivre()
    {
        return "Le livre " + this.titre + " co�te " + this.prixVente;
    }
    
    public int vente(int nbExemplairesVendus)
    {
        return this.setNbVendus(this.auteur.vente(nbExemplairesVendus));
    }
    
    public double getPrix()
    {
        return this.prixVente;
    }
    
    public void setPrix(int prix)
    {
        this.prixVente = prix;
    }    

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
    
    public Auteur getAuteur() {
        return this.auteur;
    }
    
    
    /** Getters & setters
     * 
     */
    public String getTitre()
    {
        // Insérez votre code ici
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }

	public int getNbVendus() {
		return nbVendus;
	}

	public int setNbVendus(int nbVendus) {
		this.nbVendus = nbVendus;
		return nbVendus;
	}
    
    

   
}
