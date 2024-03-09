package ma.fst.universite.service.facade;

import ma.fst.universite.bean.NoteModule;

import java.util.List;

public interface NoteModuleService {

    List<NoteModule> findByModuleCode(String code);

    List<NoteModule> findByModuleLibelle(String libelle);

    List<NoteModule> findAll();

    List<NoteModule> findByValidationModule(boolean validationModule);

    NoteModule findByCode(String code);

    List<NoteModule> findByNoteGreaterThan(double minNote);

    List<NoteModule> findByNoteLessThan(double maxNote);

    List<NoteModule> findByNoteBetween(double minNote, double maxNote);

    List<NoteModule> findByNoteSemestreCode(String Code);

    List<NoteModule> findByModuleCodeAndValidationModule(String moduleCode, boolean validationModule);
}
