package ma.fst.universite.dao;

import ma.fst.universite.bean.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDao extends JpaRepository<Ville, Long> {
    Ville findByCode(String code);
    int deleteByCode(String code);

}
