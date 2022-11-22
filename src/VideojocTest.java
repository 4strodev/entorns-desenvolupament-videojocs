import org.junit.jupiter.api.Test;

class VideojocTest {

    @Test
    void getNom() {
        Videojoc callOFduty = new Videojoc("Return to monkey island");
        String nomdelVideojuego = callOFduty.getNom();

        assert(nomdelVideojuego == "Return to monkey island");
    }

    @Test
    void setEdatRecomanadaPEGI() {
        Videojoc callOFduty = new Videojoc("Return to monkey island");
        callOFduty.setEdatRecomanadaPEGI("Pegi 12");
        assert(callOFduty.getEdatRecomanadaPEGI() == "12");

    }

    @Test
    void setIgetNom() {
        Videojoc callOFduty = new Videojoc("Return to monkey island");
        callOFduty.setEdatRecomanadaPEGI("Pegi 12");
        assert(callOFduty.getEdatRecomanadaPEGI() == "12");
    }
}