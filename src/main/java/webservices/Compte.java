package webservices;

import java.util.Date;

public class Compte {
    private int code;
    private double montant;
    private Date dateCreation;

    public Compte(int code, double montant, Date dateCreation) {
        this.code = code;
        this.montant = montant;
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
