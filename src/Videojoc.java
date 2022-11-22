import java.util.HashSet;
import java.util.Set;

public class Videojoc {
    //hola
    //Hola de nuevo
    //Adios
    private String nom;
    private String genere;
    private int numeroJugadors;
    private float preu;
    private String plataformes;
    private String ambientacio;
    private String edatRecomanadaPEGI;
    private String contingutEspecificPEGI;
    private String requisits;

    private Set<Usuari> usuarisQueHanConsultat;

    public Set<Usuari> getUsuarisQueHanConsultat() {
        return usuarisQueHanConsultat;
    }

    public Videojoc(String nom) {
        this.nom = nom;
        usuarisQueHanConsultat = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {this.nom = nom;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.ambientacio = genere;
    }

    public int getNumeroJugadors() {
        return numeroJugadors;
    }

    public void setNumeroJugadors(int numeroJugadors) {
        this.numeroJugadors = numeroJugadors;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = this.preu;
    }

    public String getPlataformes() {
        return plataformes;
    }

    public void setPlataformes(String plataformes) {
        this.plataformes = plataformes;
    }

    public String getAmbientacio() {
        return genere;
    }

    public void setAmbientacio(String ambientacio) {
        this.ambientacio = ambientacio;
    }

    public String getEdatRecomanadaPEGI() {
        return edatRecomanadaPEGI;
    }

    public void setEdatRecomanadaPEGI(String edatRecomanadaPEGI) {
        this.edatRecomanadaPEGI = edatRecomanadaPEGI;
    }

    public String getContingutEspecificPEGI() {
        return contingutEspecificPEGI;
    }

    public void setContingutEspecificPEGI(String contingutEspecificPEGI) {
        this.contingutEspecificPEGI = contingutEspecificPEGI;
    }

    public String getRequisits() {
        return requisits;
    }

    public void setRequisits(String requisits) {
        this.requisits = requisits;
    }

    public void mostrarDades() {
        System.out.println(this.getNom());
        System.out.println("-------------------------------");
        System.out.println("* GÈNERE: " + this.getGenere());
        System.out.println("* NUMERO DE JUGADORS: " + this.getNumeroJugadors());
        System.out.println("* PREU: " + this.getPreu());
        System.out.println("* PLATAFORMES: " + this.getPlataformes());
        System.out.println("* AMBIENTACIÓ: " + this.getAmbientacio());
        System.out.println("* EDAT RECOMANADA (PEGI): " + this.getEdatRecomanadaPEGI());
        System.out.println("* CONTINGUT ESPECÍFIC (PEGI) : " + this.getContingutEspecificPEGI());
        System.out.println("* REQUISITS:\n" + this.getRequisits());
        System.out.println();
        System.out.println();
    }

    public void afegirUsuariQueConsulta(Usuari usuari) {
        usuarisQueHanConsultat.add(usuari);
    }
}
