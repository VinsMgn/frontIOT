package Data;

import java.util.Date;
import java.util.UUID;

public class Demande {
    private UUID noDemande;
    private Date dateDemande;
    private Date dateEnlevement;
    private boolean isWeb;
    private UUID siretEntreprise;
    private UUID noTournee;

    public Demande(UUID noDemande, Date dateDemande, Date dateEnlevement, boolean isWeb, UUID siretEntreprise, UUID noTournee) {
        this.noDemande = noDemande;
        this.dateDemande = dateDemande;
        this.dateEnlevement = dateEnlevement;
        this.isWeb = isWeb;
        this.siretEntreprise = siretEntreprise;
        this.noTournee = noTournee;
    }

    public Demande() {

    }

    public UUID getNoDemande() {
        return noDemande;
    }

    public void setNoDemande(UUID noDemande) {
        this.noDemande = noDemande;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Date getDateEnlevement() {
        return dateEnlevement;
    }

    public void setDateEnlevement(Date dateEnlevement) {
        this.dateEnlevement = dateEnlevement;
    }

    public boolean isWeb() {
        return isWeb;
    }

    public void setWeb(boolean web) {
        isWeb = web;
    }

    public UUID getSiretEntreprise() {
        return siretEntreprise;
    }

    public void setSiretEntreprise(UUID siretEntreprise) {
        this.siretEntreprise = siretEntreprise;
    }

    public UUID getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(UUID noTournee) {
        this.noTournee = noTournee;
    }
}
