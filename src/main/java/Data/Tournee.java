package Data;

import java.util.Date;
import java.util.UUID;

public class Tournee {

    private UUID noTournee;
    private Date dateTournee;
    private UUID noImmatCamion;
    private UUID noEmploye;

    public Tournee(UUID noTournee, Date dateTournee, UUID noImmatCamion, UUID noEmploye) {
        this.noTournee = noTournee;
        this.dateTournee = dateTournee;
        this.noImmatCamion = noImmatCamion;
        this.noEmploye = noEmploye;
    }

    public Tournee() {

    }

    public UUID getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(UUID noTournee) {
        this.noTournee = noTournee;
    }

    public Date getDateTournee() {
        return dateTournee;
    }

    public void setDateTournee(Date dateTournee) {
        this.dateTournee = dateTournee;
    }

    public UUID getNoImmatCamion() {
        return noImmatCamion;
    }

    public void setNoImmatCamion(UUID noImmatCamion) {
        this.noImmatCamion = noImmatCamion;
    }

    public UUID getNoEmploye() {
        return noEmploye;
    }

    public void setNoEmploye(UUID noEmploye) {
        this.noEmploye = noEmploye;
    }
}
