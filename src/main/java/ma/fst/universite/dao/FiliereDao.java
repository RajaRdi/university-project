package ma.fst.universite.dao;

import ma.fst.universite.bean.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FiliereDao extends JpaRepository<Filiere, Long> {
    Filiere findByCode(String code);
    int deleteByCode(String code);

}
