package ma.fst.universite.service.facade;

import ma.fst.universite.bean.Semestre;

import java.util.List;

public interface SemestreService {
    Semestre findByCode(String code);

    int deleteByCode(String code);

    List<Semestre> findAll();

    Semestre save(Semestre semestre);
}
