package Data;

import java.util.Date;
import java.util.UUID;

public class Camion {

    private UUID noImmat;
    private Date dateAchat;
    private String modele;
    private String marque;

    public Camion(UUID noImmat, Date dateAchat, String modele, String marque) {
        this.noImmat = noImmat;
        this.dateAchat = dateAchat;
        this.modele = modele;
        this.marque = marque;
    }

    public UUID getNoImmat() {
        return noImmat;
    }

    public void setNoImmat(UUID noImmat) {
        this.noImmat = noImmat;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
