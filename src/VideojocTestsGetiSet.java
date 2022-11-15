import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideojocTestsGetiSet {

    public static final String NOM_VIDEOJOC = "League of Legends";
    public static final String EDAT_PEGI = "PEGI 12";
    public static final String AMBIENTACIO = "Muntanyes";

    @Test
    void getNom() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        assertEquals(testVideojoc.getNom(), NOM_VIDEOJOC);
    }

    /*
   Videojoc videojocDeProva = new Videojoc("Return to monkey island");
   String nomDelVideojoc = videojocDeProva.getNom();

    Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
    assert(testVideojoc == NOM_VIDEOJOC);
   */

    @Test
    void setiGetEdatRecomanadaPEGI() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setEdatRecomanadaPEGI(EDAT_PEGI);
        assert(testVideojoc.getEdatRecomanadaPEGI() == EDAT_PEGI);
    }

    @Test
    void setIGetNom() {
        Videojoc testVideojoc = new Videojoc("LOL");
        testVideojoc.setNom(NOM_VIDEOJOC);
        assert(testVideojoc.getNom() == NOM_VIDEOJOC);
    }

    @Test
    void setIGetGenere() {
        Videojoc testVideojoc = new Videojoc("Marº");
        testVideojoc.setNom(NOM_VIDEOJOC);
        assert(testVideojoc.getNom() == NOM_VIDEOJOC);
    }
}





