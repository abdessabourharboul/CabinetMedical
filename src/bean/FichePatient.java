/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Yassine
 */
public class FichePatient {

    private String id;
    private String dateEnregistrement;
    private String prenom;
    private String nom;
    private String prenomPere;
    private String dateNaissance;
    private Double age;
    private String sexe;
    private String proffesion;
    private String etatCivil;
    private Double nbrEnfant;
    private String pays;
    private String ville;
    private String adresse;
    private String telFix;
    private String telMobile;
    private String email;
    private String decede;
    private String dateDeces;
    private Double codePostale;
    private int cmp;
    private List<Consultation> consulations;
    private List<Ordonnance> ordonnances;
    private List<Rendez_Vous> rendez_Vouses;

    public List<Rendez_Vous> getRendez_Vouses() {
        return rendez_Vouses;
    }

    public void setRendez_Vouses(List<Rendez_Vous> rendez_Vouses) {
        this.rendez_Vouses = rendez_Vouses;
    }

    public List<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void setOrdonnances(List<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public FichePatient() {
        generateId();
    }

    public void generateId() {
        cmp++;
        id = "fiche" + cmp;
    }

    public FichePatient(String prenom, String nom, String dateNaissance) {
        generateId();
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }

    public String getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(String dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    public Double getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(Double codePostale) {
        this.codePostale = codePostale;
    }

    public List<Consultation> getConsulations() {
        return consulations;
    }

    public void setConsulations(List<Consultation> consulations) {
        this.consulations = consulations;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCmp() {
        return cmp;
    }

    public void setCmp(int cmp) {
        this.cmp = cmp;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenomPere() {
        return prenomPere;
    }

    public void setPrenomPere(String prenomPere) {
        this.prenomPere = prenomPere;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public String getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(String etatCivil) {
        this.etatCivil = etatCivil;
    }

    public Double getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(Double nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelFix() {
        return telFix;
    }

    public void setTelFix(String telFix) {
        this.telFix = telFix;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDecede() {
        return decede;
    }

    public void setDecede(String decede) {
        this.decede = decede;
    }

    public String getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(String dateDeces) {
        this.dateDeces = dateDeces;
    }

    @Override
    public String toString() {
        return "FichePatient{" + "id=" + id + ", dateEnregistrement=" + dateEnregistrement + ", prenom=" + prenom + ", nom=" + nom + ", prenomPere=" + prenomPere + ", dateNaissance=" + dateNaissance + ", age=" + age + ", sexe=" + sexe + ", proffesion=" + proffesion + ", etatCivil=" + etatCivil + ", nbrEnfant=" + nbrEnfant + ", pays=" + pays + ", ville=" + ville + ", adresse=" + adresse + ", telFix=" + telFix + ", telMobile=" + telMobile + ", email=" + email + ", decede=" + decede + ", dateDeces=" + dateDeces + ", codePostale=" + codePostale + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichePatient other = (FichePatient) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
