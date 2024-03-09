package ma.fst.universite.dao;

import ma.fst.universite.bean.Faculte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaculteDao extends JpaRepository<Faculte, Long> {
    Faculte findByCode(String code);
    int deleteByCode(String code);

}
