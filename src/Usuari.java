import java.time.LocalDate;


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

    public String getNickname() {
        return nickname;
    }

    public String getIdentificador() {
        return nickname+"#"+String.format("%04d", id);
    }

    public void afegirComentari(Videojoc videojoc, String textDelComentari) {
        Comentari comentari = new Comentari(this, textDelComentari);
        videojoc.afegirComentari(comentari);
    }
}
