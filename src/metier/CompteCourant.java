package metier;

import java.util.Date;

public class CompteCourant extends  Compte{

    public CompteCourant() {
        super();
    }

    public CompteCourant(int code, double solde, double decouverte) {
        super(code,solde);
        this.decouverte = decouverte;
    }

    //Avec ce type de compte on peut avoir un decouvert
    private double decouverte;

    // Redefinition de la methode retirer pour un compte courant
    @Override
    public void retirer(double montant) {
        if(montant>solde+decouverte) throw new RuntimeException("Solde insufisant");
        Retrait r = new Retrait(operations.size()+1, new Date(), montant);
        operations.add(r);
        solde = solde-montant;
    }

    @Override
    public void updateSolde() {

    }
}
