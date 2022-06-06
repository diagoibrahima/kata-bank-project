package test;

import metier.Compte;
import metier.CompteEpargne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetraitTest {

    Compte c2 = new CompteEpargne(2,7000,4.5);



    @Test
    public void retirer(){
        c2.retirer(3000);
        c2.updateSolde();

        c2.consulterSolde();
        assertEquals(4180,c2.consulterSolde(),"Erreur test retrait");

    }
}
