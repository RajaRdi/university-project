package ma.fst.universite.dao;

import ma.fst.universite.bean.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteDao extends JpaRepository<Universite, Long> {
    Universite findByCode(String code);
    int deleteByCode(String code);

}
