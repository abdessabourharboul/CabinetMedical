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
public class Rendez_Vous {

    private int id;
    private String date;
    private String heureDebut;
    private String heureFin;
    private Double duree;
    private String type;
    private String observation;

    private FichePatient fichePatient;

    public Rendez_Vous() {
    }

    public Rendez_Vous(String date, String heureDebut, String heureFin, Double duree, String type, String observation) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.duree = duree;
        this.type = type;
        this.observation = observation;
    }

    public FichePatient getFichePatient() {
        return fichePatient;
    }

    public void setFichePatient(FichePatient fichePatient) {
        this.fichePatient = fichePatient;
    }
    

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public Double getDuree() {
        return duree;
    }

    public void setDuree(Double duree) {
        this.duree = duree;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Rendez_Vous other = (Rendez_Vous) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rendez_Vous{" + "id=" + id + ", date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", duree=" + duree + ", type=" + type + ", observation=" + observation + '}';
    }

}
