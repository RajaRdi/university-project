package ma.fst.universite.service.impl;

import ma.fst.universite.bean.Semestre;
import ma.fst.universite.dao.SemestreDao;
import ma.fst.universite.service.facade.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemestreServiceimpl implements SemestreService {
    @Autowired
    private SemestreDao semestreDao;
    @Override
    public Semestre findByCode(String code) {
        return semestreDao.findByCode(code);
    }
    @Override
    public int deleteByCode(String code) {
        return semestreDao.deleteByCode(code);
    }
    @Override
    public List<Semestre> findAll() {
        return semestreDao.findAll();
    }
    @Override
    public Semestre save(Semestre semestre) {
        return semestreDao.save(semestre);
    }
}
