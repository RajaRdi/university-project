package ma.fst.universite.dao;

import ma.fst.universite.bean.InscriptionModule;
import ma.fst.universite.bean.InscriptionSemestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionModuleDao extends JpaRepository<InscriptionModule, Long> {
    InscriptionModule findByCode(String code);
    int deleteByCode(String code);

}
