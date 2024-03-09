package ma.fst.universite.ws.dto;

import ma.fst.universite.bean.Faculte;

public class FiliereDto {
    private Long id;
    private String code;
    private  String nom;
    private Faculte faculte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
    }
}


