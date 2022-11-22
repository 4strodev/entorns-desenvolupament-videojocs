import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VideojocTestsGetiSet {

    public static final String NOM_VIDEOJOC = "League of Legends";
    public static final String GENERE = "Acció";
    public static final int NUM_JUGADORS = 2;
    public static final float PREU = 20.5f;
    public static final String PLATAFORMA = "PlayStation";
    public static final String AMBIENTACIO = "Muntanyes";
    public static final String EDAT_PEGI = "PEGI 12";
    public static final String CONTINGUT_ESPECIFIC_PEGI = "Violencia";
    public static final String REQUISIT = "Windows 10";


    @Test
    void setIGetNom() {
        Videojoc testVideojoc = new Videojoc("LOL");
        testVideojoc.setNom(NOM_VIDEOJOC);
        assert (testVideojoc.getNom() == NOM_VIDEOJOC);
    }

    @Test
    void setIGetGenere() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setGenere(GENERE);
        assert (testVideojoc.getGenere() == GENERE);
    }

    @Test
    void setIGetNumeroJugadors() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setNumeroJugadors(NUM_JUGADORS);
        assert (testVideojoc.getNumeroJugadors() == NUM_JUGADORS);
    }

    @Test
    void setIGetPreu() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setPreu(PREU);
        assertEquals(PREU, testVideojoc.getPreu());
    }

    @Test
    void setIGetPlataformes() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setPlataformes(PLATAFORMA);
        assertEquals(PLATAFORMA, testVideojoc.getPlataformes());
    }
    @Test
    void setIGetAmbientacio() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setAmbientacio(AMBIENTACIO);
        assert (testVideojoc.getAmbientacio() == AMBIENTACIO);
    }
    @Test
    void setiGetEdatRecomanadaPEGI() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setEdatRecomanadaPEGI(EDAT_PEGI);
        assert (testVideojoc.getEdatRecomanadaPEGI() == EDAT_PEGI);
    }
    @Test
    void setIGetContingutEspecificPEGI() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setContingutEspecificPEGI(CONTINGUT_ESPECIFIC_PEGI);
        assertEquals(CONTINGUT_ESPECIFIC_PEGI, testVideojoc.getContingutEspecificPEGI());
    }
    @Test
    void setIGetRequisits() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        testVideojoc.setRequisits(REQUISIT);
        assertEquals(REQUISIT, testVideojoc.getRequisits());
    }

    @Test
    void afegirUsuariQueConsulta() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        testVideojoc.afegirUsuariQueConsulta(usuari);
        Set<Usuari> usuarisQueHanConsultat = testVideojoc.getUsuarisQueHanConsultat();
        assert(usuarisQueHanConsultat.contains(usuari));
    }
    @Test
    void afegirComentari() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        Comentari comentari = new Comentari(usuari, "Muy buenoooo");
        testVideojoc.afegirComentari(comentari);
        Set<Comentari> comentaris = testVideojoc.getComentaris();
        assert(comentaris.contains(comentari));
    }
    @Test
    void getComentaris() {
        Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        Comentari comentari = new Comentari(usuari, "Muy buenoooo");
        testVideojoc.getComentaris();
    }
}

    /*
   Videojoc videojocDeProva = new Videojoc("Return to monkey island");
   String nomDelVideojoc = videojocDeProva.getNom();

    Videojoc testVideojoc = new Videojoc(NOM_VIDEOJOC);
    assert(testVideojoc == NOM_VIDEOJOC);
   */



