package Data;


public class Fonction {
    private Integer noFonction;
    private String nomFonction;

    public Integer getNoFonction() {
        return noFonction;
    }

    public void setNoFonction(Integer noFonction) {
        this.noFonction = noFonction;
    }

    public String getNomFonction() {
        return nomFonction;
    }

    public void setNomFonction(String nomFonction) {
        this.nomFonction = nomFonction;
    }

    public Fonction(Integer noFonction, String nomFonction) {
        this.noFonction = noFonction;
        this.nomFonction = nomFonction;
    }
}
