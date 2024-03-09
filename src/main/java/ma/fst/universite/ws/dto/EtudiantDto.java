package ma.fst.universite.ws.dto;
import ma.fst.universite.bean.Faculte;
import ma.fst.universite.bean.Filiere;
import ma.fst.universite.bean.Semestre;

import java.time.LocalDateTime;

public class EtudiantDto {

    private Long id;
    private String codeApogee;
    private String nom;
    private LocalDateTime dateNaissance;

    private Faculte faculte;
    private Semestre semestre;
    private Filiere filiere;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeApogee() {
        return codeApogee;
    }

    public void setCodeApogee(String codeApogee) {
        this.codeApogee = codeApogee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDateTime dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
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
}
