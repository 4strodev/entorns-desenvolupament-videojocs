import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    @Test
    void getIdentificador() {
        Usuari personaje = new Usuari("Jorge");
        Usuari personaje2 = new Usuari("Javi");
        assertEquals("Jorge#0001", personaje.getIdentificador());
        assertEquals("Javi#0002", personaje2.getIdentificador());
    }

    @Test
    void getNomDelUsuari() {
        Usuari nombre = new Usuari("Marlon");
        assertEquals("Marlon", nombre.getNomDelUsuari());
    }
}