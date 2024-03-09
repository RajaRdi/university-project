package ma.fst.universite.dao;

import ma.fst.universite.bean.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleDao extends JpaRepository<Module, Long> {
    Module findByCode(String code);
    int deleteByCode(String code);

}
