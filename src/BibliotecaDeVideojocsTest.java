import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliotecaDeVideojocsTest {

    static final String GAME_NAME = "Return to Monkey Island";

    @Test
    void buscar() {
        BibliotecaDeVideojocs biblioteca = new BibliotecaDeVideojocs();
        Usuari user = new Usuari("anormaluserwithafuckingnickname");
        Videojoc videojoc = biblioteca.buscar(user, GAME_NAME);
        assertEquals(GAME_NAME, videojoc.getNom());

        Set<Usuari> usuarisQueHanConsultat = videojoc.getUsuarisQueHanConsultat();
        assert(usuarisQueHanConsultat.contains(user));
    }
}