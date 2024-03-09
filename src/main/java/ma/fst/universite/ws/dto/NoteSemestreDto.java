package ma.fst.universite.ws.dto;

import ma.fst.universite.bean.Etudiant;
import ma.fst.universite.bean.Filiere;
import ma.fst.universite.bean.Semestre;

public class NoteSemestreDto {
    private Long id;
    private String code;
    private double note;
    private boolean validationSemestre;
    private int annee;
    private Semestre semestre;
    private Filiere filiere;
    private Etudiant etudiant;

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

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public boolean isValidationSemestre() {
        return validationSemestre;
    }

    public void setValidationSemestre(boolean validationSemestre) {
        this.validationSemestre = validationSemestre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}


