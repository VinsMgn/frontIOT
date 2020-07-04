package Data;

import java.util.UUID;

public class Fonction {
    private UUID noFonction;
    private String nomFonction;

    public UUID getNoFonction() {
        return noFonction;
    }

    public void setNoFonction(UUID noFonction) {
        this.noFonction = noFonction;
    }

    public String getNomFonction() {
        return nomFonction;
    }

    public void setNomFonction(String nomFonction) {
        this.nomFonction = nomFonction;
    }

    public Fonction(UUID noFonction, String nomFonction) {
        this.noFonction = noFonction;
        this.nomFonction = nomFonction;
    }
}
