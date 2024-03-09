package ma.fst.universite.ws.facade;

import ma.fst.universite.bean.NoteModule;
import ma.fst.universite.service.facade.NoteModuleService;
import ma.fst.universite.ws.converter.NoteModuleConverter;
import ma.fst.universite.ws.dto.NoteModuleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "api/NoteModule/")
public class NoteModuleProvided {

    @Autowired
    private NoteModuleService note;
    @Autowired
    private NoteModuleConverter converter;

    @GetMapping("module/code/{code}")
    public List<NoteModuleDto> findByModuleCode(@PathVariable String code){
        List<NoteModule> Notes= note.findByModuleCode(code);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("module/libelle/{libelle}")
    public List<NoteModuleDto> findByModuleLibelle(@PathVariable String libelle) {
        List<NoteModule> Notes= note.findByModuleLibelle(libelle);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping()
    public List<NoteModuleDto> findAll() {
        List<NoteModule> Notes= note.findAll();
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("validation/{validationModule}")
    public List<NoteModuleDto> findByValidationModule(@PathVariable boolean validationModule) {
        List<NoteModule> Notes= note.findByValidationModule(validationModule);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("code/{code}")
    public NoteModuleDto findByCode(@PathVariable String code) {
        NoteModule Note= note.findByCode(code);
        NoteModuleDto dto=converter.toDto(Note);
        return dto;
    }

    @GetMapping("minNote/{minNote}")
    public List<NoteModuleDto> findByNoteGreaterThan(@PathVariable double minNote) {
        List<NoteModule> Notes= note.findByNoteGreaterThan(minNote);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("maxNote/{maxNote}")
    public List<NoteModuleDto> findByNoteLessThan(@PathVariable double maxNote) {
        List<NoteModule> Notes= note.findByNoteLessThan(maxNote);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("between/minNote/{minNote}/maxNote/{maxNote}")
    public List<NoteModuleDto> findByNoteBetween(@PathVariable double minNote,@PathVariable double maxNote) {
        List<NoteModule> Notes= note.findByNoteBetween(minNote, maxNote);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("NoteSemestreCode/{code}")
    public List<NoteModuleDto> findByNoteSemestreCode(@PathVariable String Code){

        List<NoteModule> Notes= note.findByNoteSemestreCode(Code);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }

    @GetMapping("moduleCode/{moduleCode}/validationModule/{validationModule}")
    public List<NoteModuleDto> findByModuleCodeAndValidationModule(@PathVariable String moduleCode,@PathVariable boolean validationModule) {
        List<NoteModule> Notes= note.findByModuleCodeAndValidationModule(moduleCode, validationModule);
        List<NoteModuleDto> dtos=converter.todto(Notes);
        return dtos;
    }


}