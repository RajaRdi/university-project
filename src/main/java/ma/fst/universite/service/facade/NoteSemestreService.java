package ma.fst.universite.service.facade;

import ma.fst.universite.bean.NoteSemestre;

import java.util.List;

public interface NoteSemestreService {

    List<NoteSemestre> findAll();

    NoteSemestre findByCode(String code);

    List<NoteSemestre> findByEtudiantCodeApogee(String codeApogee);


    int deleteByCode(String code);

    int deleteByEtudiantCodeApogee(String codeApogee);

    //boolean validationSemestre();

    NoteSemestre save(NoteSemestre noteSemestre);
}
