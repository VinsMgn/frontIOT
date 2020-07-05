package Data;


public class Entreprise {

    private Integer siret;
    private String raisonSociale;
    private Integer noRue;
    private String rue;
    private Integer codePostal;
    private String city;
    private Integer telephone;
    private String contact;

    public Entreprise(){

    }

    public Entreprise(Integer  siret, String raisonSociale, Integer noRue, String rue, Integer codePostal, String city, Integer telephone, String contact) {
        this.siret = siret;
        this.raisonSociale = raisonSociale;
        this.noRue = noRue;
        this.rue = rue;
        this.codePostal = codePostal;
        this.city = city;
        this.telephone = telephone;
        this.contact = contact;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Integer getNoRue() {
        return noRue;
    }

    public void setNoRue(Integer noRue) {
        this.noRue = noRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer  getSiret() {
        return siret;
    }

    public void setSiret(Integer  siret) {
        this.siret = siret;
    }
}
