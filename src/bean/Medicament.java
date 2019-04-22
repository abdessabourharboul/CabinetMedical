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
public class Medicament {

    private int id;
    private String nom;
    private String famille;
    private String indication;
    private String contreIndication;
    private String libelle;
    private String paysFab;
    private String forme;
    private String laboFab;
    private String composition;
    private int code;
    private List<Ordonnance> ordonnances;

    public Medicament() {
    }

    public Medicament(String nom, String famille, String indication, String contreIndication, String libelle, String paysFab, String forme, String laboFab, String composition, int code) {
        this.nom = nom;
        this.famille = famille;
        this.indication = indication;
        this.contreIndication = contreIndication;
        this.libelle = libelle;
        this.paysFab = paysFab;
        this.forme = forme;
        this.laboFab = laboFab;
        this.composition = composition;
        this.code = code;
    }

    public String getContreIndication() {
        return contreIndication;
    }

    public void setContreIndication(String contreIndication) {
        this.contreIndication = contreIndication;
    }

    public List<Ordonnance> getOrdonnances() {
        return ordonnances;
    }

    public void setOrdonnances(List<Ordonnance> ordonnances) {
        this.ordonnances = ordonnances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPaysFab() {
        return paysFab;
    }

    public void setPaysFab(String paysFab) {
        this.paysFab = paysFab;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getLaboFab() {
        return laboFab;
    }

    public void setLaboFab(String laboFab) {
        this.laboFab = laboFab;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Medicament{" + "id=" + id + ", nom=" + nom + ", famille=" + famille + ", indication=" + indication + ", contreIndication=" + contreIndication + ", libelle=" + libelle + ", paysFab=" + paysFab + ", forme=" + forme + ", laboFab=" + laboFab + ", composition=" + composition + ", code=" + code + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
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
        final Medicament other = (Medicament) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
