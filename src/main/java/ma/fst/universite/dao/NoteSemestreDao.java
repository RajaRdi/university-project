package ma.fst.universite.dao;

import ma.fst.universite.bean.NoteSemestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteSemestreDao extends JpaRepository<NoteSemestre, Long> {
    NoteSemestre findByCode(String code);
    List<NoteSemestre> findByEtudiantCodeApogee(String codeApogee);
    List<NoteSemestre> findByFiliereCode(String code);
    List<NoteSemestre> findBySemestreCode(String code);
    int deleteByCode(String code);
    int deleteByEtudiantCodeApogee(String codeApogee);
    int deleteByFiliereCode(String code);
    int deleteBySemestreCode(String code);

}
