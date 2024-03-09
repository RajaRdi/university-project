package ma.fst.universite.dao;

import ma.fst.universite.bean.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {
    Etudiant findByCodeApogee(String codeApogee);
    int deleteByCodeApogee(String codeApogee);


    List<Etudiant> findByFiliereCode(String code);
}
