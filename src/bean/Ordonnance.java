/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Yassine
 */
public class Ordonnance {

    private int id;
    private String traitement;
    private String textOrdonnance;
    private FichePatient fichePatient;

    public Ordonnance() {
    }

    public Ordonnance(String traitement, String textOrdonnance) {
        this.traitement = traitement;
        this.textOrdonnance = textOrdonnance;
    }

    public String getTraitement() {
        return traitement;
    }

    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }

    public String getTextOrdonnance() {
        return textOrdonnance;
    }

    public void setTextOrdonnance(String textOrdonnance) {
        this.textOrdonnance = textOrdonnance;
    }

    public FichePatient getFichePatient() {
        return fichePatient;
    }

    public void setFichePatient(FichePatient fichePatient) {
        this.fichePatient = fichePatient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
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
        final Ordonnance other = (Ordonnance) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ordonnance{" + "id=" + id + ", traitement=" + traitement + ", textOrdonnance=" + textOrdonnance + '}';
    }

}
