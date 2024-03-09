package ma.fst.universite.dao;

import ma.fst.universite.bean.NoteSemestre;
import ma.fst.universite.bean.SemestreModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemestreModuleDao extends JpaRepository<SemestreModule, Long> {
    SemestreModule findByCode(String code);
    int deleteByCode(String code);


}
