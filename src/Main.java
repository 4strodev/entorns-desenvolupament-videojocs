import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BibliotecaDeVideojocs biblioteca = new BibliotecaDeVideojocs();

        Usuari joan = new Usuari("Joan");
        Videojoc videojoc1 = biblioteca.buscar(joan, "Return to Monkey Island");
        videojoc1.mostrarDades();
        joan.afegirComentari(videojoc1, "Aquest videojoc és molt guay.");
        joan.afegirComentari(videojoc1, """                
                ⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀ ⣀⣀⣤⣤⣤⣀⡀
                ⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀
                ⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆ Ta bueno
                ⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆
                ⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆
                ⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠸⣼⡿
                ⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉
                ⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇compralo
                ⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇
                ⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇
                ⠀⠀ ⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠇
                ⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇
                ⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                """);

        Usuari josep = new Usuari("Josep");
        Videojoc videojoc2 = biblioteca.buscar(josep, "Return to Monkey Island");
        videojoc2.mostrarDades();

        System.out.println("\n** USUARIS QUE HAN CONSULTAT **");
        Set<Usuari> usuarisQueHanConsultat = videojoc1.getUsuarisQueHanConsultat();
        for (Usuari usuari : usuarisQueHanConsultat) {
            System.out.println(usuari.getIdentificador());
        }

        System.out.println("\n** COMENTARIS **");
        Set<Comentari> comentarisDelVideojoc = videojoc1.getComentaris();
        for (Comentari comentari : comentarisDelVideojoc) {
            System.out.println("- " + comentari.getData() + ": " + comentari.getUsuari().getIdentificador());
            System.out.println(comentari.getText());
        }
    }
}
