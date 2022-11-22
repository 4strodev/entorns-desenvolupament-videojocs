import static org.junit.jupiter.api.Assertions.*;

class UsuariTest2 {

    @org.junit.jupiter.api.Test
    void getNickname() {
        Usuari testUser = new Usuari ("Pere");
        if (testUser.getNickname() == "Pere")
        System.out.println("Tot joya");

        else System.out.println("Error");
    }
}