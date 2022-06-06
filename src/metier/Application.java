package metier;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        Compte c1 = new CompteCourant(1,10000,3000 );
        Compte c2 = new CompteEpargne(2,5000, 4.5);

        c1.verser(2000);
        c1.retirer(500);


        System.out.println("Le solde du compte c1 "+ c1.consulterSolde());
        System.out.println("Le solde du compte c2 "+ c2.consulterSolde());

        //Historique des operations ddu compte
        List<Operation> listOperations = c1.getOperations();
        for(Operation o:listOperations){
            System.out.println(o.getNumero()+"****"+o.getClass().getSimpleName()+"****"+o.getMontant()+"****"+o.getDateOperation());
        }

    }
}
