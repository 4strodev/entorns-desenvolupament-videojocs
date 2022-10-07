import java.util.HashSet;
import java.util.Set;
// Java we will kill you
public class BibliotecaDeVideojocs {
    private Set<Videojoc> videojocs;

    public BibliotecaDeVideojocs() {
        videojocs = new HashSet<>();
        crearVideojocsInicials();
    }

    public Videojoc buscar(Usuari usuari, String nomDelVideojoc) {
        Videojoc videojocTrobat = buscar(nomDelVideojoc);
        if (videojocTrobat != null) {
            videojocTrobat.afegirUsuariQueConsulta(usuari);
        }
        return videojocTrobat;
    }

    private Videojoc buscar(String nomDelVideojoc) {
        Videojoc videojocTrobat = null;
        for (Videojoc videojoc : videojocs) {
            if (videojoc.getNom().equals(nomDelVideojoc)) {
                videojocTrobat = videojoc;
            }
        }
        return videojocTrobat;
    }

    private void crearVideojocsInicials() {
        Videojoc returnToMonkeyIsland = new Videojoc("Return to Monkey Island");
        returnToMonkeyIsland.setGenere("Aventura gràfica");
        returnToMonkeyIsland.setNumeroJugadors(15539);
        returnToMonkeyIsland.setPreu(22.99f);
        returnToMonkeyIsland.setPlataformes("Windows, mac, Switch");
        returnToMonkeyIsland.setAmbientacio("Pirates");
        returnToMonkeyIsland.setEdatRecomanadaPEGI("12");
        returnToMonkeyIsland.setContingutEspecificPEGI("Moderate Violence");
        returnToMonkeyIsland.setRequisits("""
                Windows: MÍNIMO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: Windows 10
                Procesador: AMD FX-4300 (4 * 3800) or equivalent / Intel Core i3-3240 (2 * 3400) or equivalent
                Memoria: 8 GB de RAM
                Gráficos: Radeon HD 7750 (1024 VRAM) or equivalent / GeForce GT 640 (2048 VRAM) or equivalent
                Almacenamiento: 4 GB de espacio disponible
                RECOMENDADO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: TBA

                macOS: MÍNIMO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: MacOS High Sierra and above
                Procesador: AMD FX-4300 (4 * 3800) or equivalent / Intel Core i3-3240 (2 * 3400) or equivalent
                Memoria: 8 GB de RAM
                Gráficos: Radeon HD 7750 (1024 VRAM) or equivalent / GeForce GT 640 (2048 VRAM) or equivalent
                Almacenamiento: 4 GB de espacio disponible
                RECOMENDADO:
                Requiere un procesador y un sistema operativo de 64 bits
                SO: Big Sur""");
        videojocs.add(returnToMonkeyIsland);

        Videojoc videojocDeProva = new Videojoc("Nom de prova");
        videojocDeProva.setGenere("Gènere de prova");
        videojocDeProva.setNumeroJugadors(99);
        videojocDeProva.setPreu(99f);
        videojocDeProva.setPlataformes("Plataforma de prova");
        videojocDeProva.setAmbientacio("Ambientació de prova");
        videojocDeProva.setEdatRecomanadaPEGI("Edat de prova");
        videojocDeProva.setContingutEspecificPEGI("Continguts de prova");
        videojocDeProva.setRequisits("Requisits de prova");
        videojocs.add(videojocDeProva);
    }
}
