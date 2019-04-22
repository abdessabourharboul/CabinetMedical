/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author Yassine
 */
public class Consultation {

    private int id;
    private String date;
    private String heure;
    private String lieu; // cabinet domicile clinique hopital
    private Double taille;
    private Double temperature;
    private Double poids;
    private Double pouls;
    private Double tensionArtMin;
    private Double tensionArtMax;
    private String type; //periodique urgence
    private String motif;
    private FichePatient fichePatient = new FichePatient();
    private List<Paiement> paiements;
    private int cmp;

    public Consultation() {
//        generateId();
    }

    public Consultation(String date, String heure, String lieu, Double taille, Double temperature, Double poids, Double pouls, Double tensionArtMin, Double tensionArtMax, String type, String motif) {
//        generateId();
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.taille = taille;
        this.temperature = temperature;
        this.poids = poids;
        this.pouls = pouls;
        this.tensionArtMin = tensionArtMin;
        this.tensionArtMax = tensionArtMax;
        this.type = type;
        this.motif = motif;
    }

//    public void generateId() {
//        cmp++;
//        id = cmp;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCmp() {
        return cmp;
    }

    public void setCmp(int cmp) {
        this.cmp = cmp;
    }

    public FichePatient getFichePatient() {
        return fichePatient;
    }

    public void setFichePatient(FichePatient fichePatient) {
        this.fichePatient = fichePatient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public Double getPouls() {
        return pouls;
    }

    public void setPouls(Double pouls) {
        this.pouls = pouls;
    }

    public Double getTensionArtMin() {
        return tensionArtMin;
    }

    public void setTensionArtMin(Double tensionArtMin) {
        this.tensionArtMin = tensionArtMin;
    }

    public Double getTensionArtMax() {
        return tensionArtMax;
    }

    public void setTensionArtMax(Double tensionArtMax) {
        this.tensionArtMax = tensionArtMax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return "Consultation{" + "id=" + id + ", date=" + date + ", heure=" + heure + ", lieu=" + lieu + ", taille=" + taille + ", temperature=" + temperature + ", poids=" + poids + ", pouls=" + pouls + ", tensionArtMin=" + tensionArtMin + ", tensionArtMax=" + tensionArtMax + ", type=" + type + ", motif=" + motif + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
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
        final Consultation other = (Consultation) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
