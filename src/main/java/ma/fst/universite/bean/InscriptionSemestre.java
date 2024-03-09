package ma.fst.universite.bean;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class InscriptionSemestre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private int annee;
    private LocalDateTime dateInscription;
    @OneToMany
    private List<InscriptionModule> inscriptionModules;

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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public LocalDateTime getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDateTime dateInscription) {
        this.dateInscription = dateInscription;
    }

    public List<InscriptionModule> getInscriptionModules() {
        return inscriptionModules;
    }

    public void setInscriptionModules(List<InscriptionModule> inscriptionModules) {
        this.inscriptionModules = inscriptionModules;
    }
}
