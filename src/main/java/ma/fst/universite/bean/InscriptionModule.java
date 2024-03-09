package ma.fst.universite.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class InscriptionModule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @ManyToOne
    private InscriptionSemestre inscriptionSemestre;
    @ManyToOne
    private Module module;

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

    public InscriptionSemestre getInscriptionSemestre() {
        return inscriptionSemestre;
    }

    public void setInscriptionSemestre(InscriptionSemestre inscriptionSemestre) {
        this.inscriptionSemestre = inscriptionSemestre;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
