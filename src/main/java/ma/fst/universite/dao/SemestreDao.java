package ma.fst.universite.dao;

import ma.fst.universite.bean.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreDao extends JpaRepository<Semestre, Long> {
    Semestre findByCode(String code);
    int deleteByCode(String code);

}
