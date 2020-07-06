package Data;


public class TypeDechet {
    private Integer noTypeDechet;
    private String nomTypeDechet;
    private Integer nivDanger;

    public TypeDechet(Integer noTypeDechet, String nomTypeDechet, Integer nivDanger) {
        this.noTypeDechet = noTypeDechet;
        this.nomTypeDechet = nomTypeDechet;
        this.nivDanger = nivDanger;
    }

    public Integer getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(Integer noTypeDechet) {
        this.noTypeDechet = noTypeDechet;
    }

    public String getNomTypeDechet() {
        return nomTypeDechet;
    }

    public void setNomTypeDechet(String nomTypeDechet) {
        this.nomTypeDechet = nomTypeDechet;
    }

    public Integer getNivDanger() {
        return nivDanger;
    }

    public void setNivDanger(Integer nivDanger) {
        this.nivDanger = nivDanger;
    }
}

