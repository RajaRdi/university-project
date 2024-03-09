package ma.fst.universite.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;

    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
