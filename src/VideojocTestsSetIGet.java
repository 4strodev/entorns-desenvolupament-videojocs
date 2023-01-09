import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VideojocShould {

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
        // Arrange
        Videojoc sut = new Videojoc("LOL");
        // Act
        sut.setNom(NOM_VIDEOJOC);
        // Assert
        assert (sut.getNom() == NOM_VIDEOJOC);
    }

    @Test
    void setIGetGenere() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setGenere(GENERE);
        assert (sut.getGenere() == GENERE);
    }

    @Test
    void setIGetNumeroJugadors() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setNumeroJugadors(NUM_JUGADORS);
        assert (sut.getNumeroJugadors() == NUM_JUGADORS);
    }

    @Test
    void setIGetPreu() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setPreu(PREU);
        assertEquals(PREU, sut.getPreu());
    }

    @Test
    void setIGetPlataformes() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setPlataformes(PLATAFORMA);
        assertEquals(PLATAFORMA, sut.getPlataformes());
    }
    @Test
    void setIGetAmbientacio() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setAmbientacio(AMBIENTACIO);
        assert (sut.getAmbientacio() == AMBIENTACIO);
    }
    @Test
    void setIGetEdatRecomanadaPEGI() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setEdatRecomanadaPEGI(EDAT_PEGI);
        assert (sut.getEdatRecomanadaPEGI() == EDAT_PEGI);
    }
    @Test
    void setIGetContingutEspecificPEGI() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setContingutEspecificPEGI(CONTINGUT_ESPECIFIC_PEGI);
        assertEquals(CONTINGUT_ESPECIFIC_PEGI, sut.getContingutEspecificPEGI());
    }
    @Test
    void setIGetRequisits() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        sut.setRequisits(REQUISIT);
        assertEquals(REQUISIT, sut.getRequisits());
    }

    @Test
    void afegirUsuariQueConsulta() {
        // Arrange
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        // Act
        sut.afegirUsuariQueConsulta(usuari);
        // Assert
        Set<Usuari> usuarisQueHanConsultat = sut.getUsuarisQueHanConsultat();
        assert(usuarisQueHanConsultat.contains(usuari));
    }
    @Test
    void afegirComentari() {
        
        // Arrange
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        Comentari comentari = new Comentari(usuari, "Muy buenoooo");
        
        // Act
        sut.afegirComentari(comentari);
        
        // Assert
        Set<Comentari> comentaris = sut.getComentaris();
        assert(comentaris.contains(comentari));
    }
    @Test
    void getComentaris() {
        Videojoc sut = new Videojoc(NOM_VIDEOJOC);
        Usuari usuari = new Usuari("Alejandro");
        Comentari comentari = new Comentari(usuari, "Muy buenoooo");
        sut.getComentaris();
    }
}

    /*
   Videojoc videojocDeProva = new Videojoc("Return to monkey island");
   String nomDelVideojoc = videojocDeProva.getNom();

    Videojoc sut = new Videojoc(NOM_VIDEOJOC);
    assert(sut == NOM_VIDEOJOC);
   */



