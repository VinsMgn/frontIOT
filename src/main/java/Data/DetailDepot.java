package Data;

import java.util.UUID;

public class DetailDepot {

    private Integer quantiteDeposee;
    private UUID noTournee;
    private UUID noTypeDechet;
    private UUID noCentre;

    public DetailDepot(Integer quantiteDeposee, UUID noTournee, UUID noTypeDechet, UUID noCentre) {
        this.quantiteDeposee = quantiteDeposee;
        this.noTournee = noTournee;
        this.noTypeDechet = noTypeDechet;
        this.noCentre = noCentre;
    }

    public DetailDepot() {

    }

    public Integer getQuantiteDeposee() {
        return quantiteDeposee;
    }

    public void setQuantiteDeposee(Integer quantiteDeposee) {
        this.quantiteDeposee = quantiteDeposee;
    }

    public UUID getNoTournee() {
        return noTournee;
    }

    public void setNoTournee(UUID noTournee) {
        this.noTournee = noTournee;
    }

    public UUID getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(UUID noTypeDechet) {
        this.noTypeDechet = noTypeDechet;
    }

    public UUID getNoCentre() {
        return noCentre;
    }

    public void setNoCentre(UUID noCentre) {
        this.noCentre = noCentre;
    }
}
