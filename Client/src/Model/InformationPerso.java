package Model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by baaliham on 16/04/15.
 */



public class InformationPerso {



    private String nom;
    private String Prenom;
    private String adresse;

    public String getNom() {
        return nom;
    }

    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    @XmlElement
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    @XmlElement
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public InformationPerso() {
    }

    public InformationPerso(String nom, String prenom, String adresse) {
        this.nom = nom;
        Prenom = prenom;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "\n\t {" +
                "\n\t  nom='" + nom + '\'' +
                "\n\t  Prenom='" + Prenom + '\'' +
                "\n\t  adresse='" + adresse + '\'' +
                '}';
    }

    public String nomtostring(){
    return" "+nom+" ";}
    public String prenomtostring(){
    return" "+Prenom+" ";}
    public String adressetostring(){
    return" "+adresse+" ";}
}
