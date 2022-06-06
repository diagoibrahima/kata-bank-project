package metier;

import java.util.Date;

public class Operation {

    private int numero;
    private Date dateOperation;
    private double montant;

    //Constructeur
    public Operation() {
        super();
    }

    public Operation(int numero, Date dateOperation, double montant) {
        super();
        this.numero = numero;
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    // Getter et setter
    public int getNumero() {
        return numero;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
