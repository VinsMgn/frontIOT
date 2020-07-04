package Data;

import java.util.UUID;

public class TypeDechet {
    private UUID noTypeDechet;
    private String nomTypeDechet;
    private Integer nivDanger;

    public TypeDechet(UUID noTypeDechet, String nomTypeDechet, Integer nivDanger) {
        this.noTypeDechet = noTypeDechet;
        this.nomTypeDechet = nomTypeDechet;
        this.nivDanger = nivDanger;
    }

    public UUID getNoTypeDechet() {
        return noTypeDechet;
    }

    public void setNoTypeDechet(UUID noTypeDechet) {
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

