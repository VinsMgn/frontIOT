package Data;

import java.util.UUID;

public class DetailDemande {
    private Integer quantiteEnleve;
    private String remarque;
    private UUID noDemande;
    private UUID noTypeDechet;

    public DetailDemande(Integer quantiteEnleve, String remarque, UUID noDemande, UUID noTypeDechet) {
        this.quantiteEnleve = quantiteEnleve;
        this.remarque = remarque;
        this.noDemande = noDemande;
        this.noTypeDechet = noTypeDechet;
    }

    public DetailDemande() {

    }

    public Integer getQuantiteEnleve() {
        return quantiteEnleve;
    }

    public void setQuantiteEnleve(Integer quantiteEnleve) {
        this.quantiteEnleve = quantiteEnleve;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public UUID getNoDemande() {
        return noDemande;
    }

    public void setNoDemande(UUID noDemande) {
        this.noDemande = noDemande;
    }

    public UUID getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(UUID noTypeDechet) {
        this.noTypeDechet = noTypeDechet;
    }
}
