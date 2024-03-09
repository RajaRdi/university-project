package ma.fst.universite.service.impl;

import ma.fst.universite.bean.NoteModule;
import ma.fst.universite.dao.NoteModuleDao;
import ma.fst.universite.service.facade.NoteModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteModuleServiceImpl implements NoteModuleService {
    @Autowired
    private NoteModuleDao noteModuleDao;
    @Override
    public List<NoteModule> findByModuleCode(String code) {
        return noteModuleDao.findByModuleCode(code);
    }

    @Override
    public List<NoteModule> findByModuleLibelle(String libelle) {
        return noteModuleDao.findByModuleLibelle(libelle);
    }

    @Override
    public List<NoteModule> findAll() {
        return noteModuleDao.findAll();
    }

    @Override
    public List<NoteModule> findByValidationModule(boolean validationModule) {
        return noteModuleDao.findByValidationModule(validationModule);
    }

    @Override
    public NoteModule findByCode(String code) {
        return noteModuleDao.findByCode(code);
    }

    @Override
    public List<NoteModule> findByNoteGreaterThan(double minNote) {
        return noteModuleDao.findByNoteGreaterThan(minNote);
    }

    @Override
    public List<NoteModule> findByNoteLessThan(double maxNote) {
        return noteModuleDao.findByNoteLessThan(maxNote);
    }

    @Override
    public List<NoteModule> findByNoteBetween(double minNote, double maxNote) {
        return noteModuleDao.findByNoteBetween(minNote,maxNote);
    }

    @Override
    public List<NoteModule> findByNoteSemestreCode(String Code){
        return noteModuleDao.findByNoteSemestreCode(Code);
    }

    @Override
    public List<NoteModule> findByModuleCodeAndValidationModule(String moduleCode, boolean validationModule) {
        return noteModuleDao.findByModuleCodeAndValidationModule(moduleCode,validationModule);
    }
}



