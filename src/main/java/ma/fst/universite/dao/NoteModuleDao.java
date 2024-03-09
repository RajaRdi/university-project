package ma.fst.universite.dao;
import ma.fst.universite.bean.NoteModule;
import ma.fst.universite.bean.NoteSemestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NoteModuleDao extends JpaRepository<NoteModule, Long> {

    NoteModule findByCode(String code);

    List<NoteModule> findByNoteSemestreCode(String code);
     List<NoteModule> findByModuleCode(String code);
    List<NoteModule> findByModuleLibelle(String libelle);

    int deleteByCode(String code);

    // int deleteByNoteSemestreCode(String code);
    //int deleteByModuleCode(String code);

    List<NoteModule> findByValidationModule(boolean validationModule);

    List<NoteModule> findByNoteGreaterThan(double minNote);

    List<NoteModule> findByNoteLessThan(double maxNote);

    List<NoteModule> findByNoteBetween(double minNote, double maxNote);

    List<NoteModule> findByModuleCodeAndValidationModule(String moduleCode, boolean validationModule);

}

