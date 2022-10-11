// another one xd
import java.time.LocalDate;

//Nou Comentaria Janira
//Edgar

public class Usuari {
    private final int id;
    private static int ultimId = 0;

    private String nickname;
    private String nom;
    private String cognoms;
    private String correu;
    private LocalDate dataNaixement;
    public Usuari(String nickname) {
        this.nickname = nickname;
        ultimId++;
        this.id = ultimId;
    }

    public String getIdentificador() {
        return nickname+"#"+String.format("%04d", id);
    }

    public String getNomDelUsuari() {
        return this.nom;

        //Nou comentari
    }
}
