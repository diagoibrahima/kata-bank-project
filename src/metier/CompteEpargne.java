package metier;

import java.util.Date;

public class CompteEpargne extends Compte{

    public CompteEpargne(int code, double solde) {
        super(code, solde);
    }

    public CompteEpargne() {
        super();
    }


    //Avec ce type de compte nous ajoutons le taux qui sera ajoute dans le solde
    private double taux;

    @Override
    public void retirer(double montant) {
        if(montant>solde) throw new RuntimeException("Solde insufisant");
        Retrait r = new Retrait(operations.size()+1, new Date(), montant);
        operations.add(r);
        solde = solde-montant;

    }

    @Override
    public void updateSolde() {
        solde = solde + (solde*taux/100);
    }

    public CompteEpargne(int code, double solde, double taux) {
        super(code, solde);
        this.taux = taux;
    }
}
