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
public class Paiement {

    private int id;
    private String type;
    private Double montantRestant;
    private Double Montant;
    private String regle;
    private Consultation consultation;

    public Paiement() {
    }

    public Paiement(String type, Double montantRestant, Double Montant, String regle) {
        this.type = type;
        this.montantRestant = montantRestant;
        this.Montant = Montant;
        this.regle = regle;
    }

    public String getRegle() {
        return regle;
    }

    public void setRegle(String regle) {
        this.regle = regle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(Double montantRestant) {
        this.montantRestant = montantRestant;
    }

    public Double getMontant() {
        return Montant;
    }

    public void setMontant(Double Montant) {
        this.Montant = Montant;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Paiement other = (Paiement) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", type=" + type + ", montantRestant=" + montantRestant + ", Montant=" + Montant + ", regle=" + regle + ", consultation=" + consultation + '}';
    }

}
