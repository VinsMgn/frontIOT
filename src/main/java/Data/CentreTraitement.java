package Data;

import java.util.UUID;

public class CentreTraitement {

    private Integer noCentre;
    private String nomCentre;
    private Integer noRueCentre;
    private String rueCentre;
    private Integer codePostalCentre;
    private String cityCentre;

    public CentreTraitement(Integer noCentre, String nomCentre, Integer noRueCentre, String rueCentre, Integer codePostalCentre, String cityCentre) {
        this.noCentre = noCentre;
        this.nomCentre = nomCentre;
        this.noRueCentre = noRueCentre;
        this.rueCentre = rueCentre;
        this.codePostalCentre = codePostalCentre;
        this.cityCentre = cityCentre;
    }

    public CentreTraitement() {

    }

    public Integer getNoCentre() {
        return noCentre;
    }

    public void setNoCentre(Integer noCentre) {
        this.noCentre = noCentre;
    }

    public String getNomCentre() {
        return nomCentre;
    }

    public void setNomCentre(String nomCentre) {
        this.nomCentre = nomCentre;
    }

    public Integer getNoRueCentre() {
        return noRueCentre;
    }

    public void setNoRueCentre(Integer noRueCentre) {
        this.noRueCentre = noRueCentre;
    }

    public String getRueCentre() {
        return rueCentre;
    }

    public void setRueCentre(String rueCentre) {
        this.rueCentre = rueCentre;
    }

    public Integer getCodePostalCentre() {
        return codePostalCentre;
    }

    public void setCodePostalCentre(Integer codePostalCentre) {
        this.codePostalCentre = codePostalCentre;
    }

    public String getCityCentre() {
        return cityCentre;
    }

    public void setCityCentre(String cityCentre) {
        this.cityCentre = cityCentre;
    }
}
