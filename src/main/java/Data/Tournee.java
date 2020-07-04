package Data;

import java.util.Date;
import java.util.UUID;

public class Tournee {

    private Integer noTournee;
    private Date dateTournee;
    private String noImmatCamion;
    private String nomEmploye;

    public Tournee(Integer noTournee, Date dateTournee, String noImmatCamion, String nomEmploye) {
        this.noTournee = noTournee;
        this.dateTournee = dateTournee;
        this.noImmatCamion = noImmatCamion;
        this.nomEmploye = nomEmploye;
    }

    public Tournee() {

    }

    public Integer getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(Integer noTournee) {
        this.noTournee = noTournee;
    }

    public Date getDateTournee() {
        return dateTournee;
    }

    public void setDateTournee(Date dateTournee) {
        this.dateTournee = dateTournee;
    }

    public String getNoImmatCamion() {
        return noImmatCamion;
    }

    public void setNoImmatCamion(String noImmatCamion) {
        this.noImmatCamion = noImmatCamion;
    }

    public String getNoEmploye() {
        return nomEmploye;
    }

    public void setNoEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }
}
