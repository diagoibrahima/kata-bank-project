package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Compte {

    protected int code;
    protected double solde;
    protected List<Operation> operations = new ArrayList<>();

    //constructeur sans parametre
    public Compte() {
        super();
    }

    //constructeur avec parametre
    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    // methode pour le versement
    public void verser(double montant){
        Versement v = new Versement(operations.size()+1, new Date(), montant );
        operations.add(v); // pour l'historique des operations
        solde+= montant;
    }

    // Methode abstract pour le retrait. Le retrait est different selon le type de compte
    public  abstract  void retirer(double montant);

    // methode pour consulter le solde
    public double consulterSolde(){
        return solde;
    }

    // Methode pour la mise a jour du solde
    public abstract void updateSolde();

    // Methode pour avoir la liste des operations
    public List<Operation> getOperations(){
        return operations;
    }
}
