package test;

import metier.Compte;
import metier.CompteCourant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepotTest {

    Compte c1 = new CompteCourant(1,10000,3000 );

    @Test
    public void verser(){
        c1.verser(5000);
        c1.consulterSolde();
        assertEquals(15000,c1.consulterSolde(),"Error test versement");
    }
}
