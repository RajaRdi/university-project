package ma.fst.universite.service.impl;

import ma.fst.universite.bean.Filiere;
import ma.fst.universite.dao.FiliereDao;
import ma.fst.universite.service.facade.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereServiceimpl implements FiliereService {
    @Autowired
    private FiliereDao filiereDao;
    @Override
    public Filiere findByCode(String code) {
        return filiereDao.findByCode(code);
    }
    @Override
    public int deleteByCode(String code) {
        return filiereDao.deleteByCode(code);
    }

    @Override
    public List<Filiere> findAll() {
        return filiereDao.findAll();
    }
    @Override
    public Filiere save(Filiere filiere) {
        return filiereDao.save(filiere);
    }
}
