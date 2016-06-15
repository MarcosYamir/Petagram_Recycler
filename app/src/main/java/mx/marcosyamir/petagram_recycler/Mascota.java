package mx.marcosyamir.petagram_recycler;

/**
 * Created by UPFIM-SIMyVC2 on 15/06/2016.
 */
public class Mascota {
    private int Perro;
    private String NombrePerro;
    private int ConteoLikes;

    public Mascota(int perro, String nombrePerro, int conteoLikes) {
        Perro = perro;
        NombrePerro = nombrePerro;
        ConteoLikes = conteoLikes;
    }

    public int getConteoLikes() {
        return ConteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        ConteoLikes = conteoLikes;
    }

    public String getNombrePerro() {
        return NombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        NombrePerro = nombrePerro;
    }

    public int getPerro() {
        return Perro;
    }

    public void setPerro(int perro) {
        Perro = perro;
    }


}
