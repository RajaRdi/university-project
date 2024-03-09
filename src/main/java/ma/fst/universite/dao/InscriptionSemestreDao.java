package ma.fst.universite.dao;

import ma.fst.universite.bean.InscriptionSemestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionSemestreDao extends JpaRepository<InscriptionSemestre, Long> {
    InscriptionSemestre findByCode(String code);
    int deleteByCode(String code);

    
}
