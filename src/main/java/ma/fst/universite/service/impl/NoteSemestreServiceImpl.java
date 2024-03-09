package ma.fst.universite.service.impl;
import ma.fst.universite.bean.NoteSemestre;
import ma.fst.universite.bean.Semestre;
import ma.fst.universite.dao.NoteSemestreDao;
import ma.fst.universite.service.facade.NoteModuleService;
import ma.fst.universite.service.facade.NoteSemestreService;
import ma.fst.universite.service.facade.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NoteSemestreServiceImpl implements NoteSemestreService {
    @Autowired
    private NoteSemestreDao noteSemestreDao;


    @Override
    public List<NoteSemestre> findAll() {
        return noteSemestreDao.findAll();
    }
    @Override
    public NoteSemestre findByCode(String code) {
        return noteSemestreDao.findByCode(code);
    }
    @Override
    public List<NoteSemestre> findByEtudiantCodeApogee(String codeApogee) {
        return noteSemestreDao.findByEtudiantCodeApogee(codeApogee);
    }
    @Override
    public int deleteByCode(String code) {
        return noteSemestreDao.deleteByCode(code);
    }
    @Override
    public int deleteByEtudiantCodeApogee(String codeApogee) {
        return noteSemestreDao.deleteByEtudiantCodeApogee(codeApogee);
    }
   /* @Override
    public boolean validationSemestre(NoteSemestre noteSemestre){
        double noteSemestre= noteSemestre.getNote();
        if(noteModuleService.findByValidationModule(boolean validationModule)){
            return validate=true;
        } else {
            return false;
        }
    }*/
    @Override
    public NoteSemestre save(NoteSemestre noteSemestre){
        return noteSemestreDao.save(noteSemestre);
    }
}
/*  public boolean validationSemestre(NoteSemestre) {
        if (noteSemestre.getNote() < 10) {
            return valide = false;
        } else if (noteSemestre.getNote() >= 10) {
            return valide = true;
        }
        noteSemestreDao.save(noteSemestre);
        return valide;
    }*/

