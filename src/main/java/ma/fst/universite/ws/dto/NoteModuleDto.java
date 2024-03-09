package ma.fst.universite.ws.dto;
import ma.fst.universite.bean.Module;
import ma.fst.universite.bean.NoteSemestre;

public class NoteModuleDto {
    private Long id;
    private String code;
    private double note;
    private double noteAvantRatt;
    private double noteApresRatt;
    private boolean validationModule;
    private NoteSemestre noteSemestre;
    private Module module;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getNoteAvantRatt() {
        return noteAvantRatt;
    }

    public void setNoteAvantRatt(double noteAvantRatt) {
        this.noteAvantRatt = noteAvantRatt;
    }

    public double getNoteApresRatt() {
        return noteApresRatt;
    }

    public void setNoteApresRatt(double noteApresRatt) {
        this.noteApresRatt = noteApresRatt;
    }

    public boolean isValidationModule() {
        return validationModule;
    }

    public void setValidationModule(boolean validationModule) {
        this.validationModule = validationModule;
    }

    public NoteSemestre getNoteSemestre() {
        return noteSemestre;
    }

    public void setNoteSemestre(NoteSemestre noteSemestre) {
        this.noteSemestre = noteSemestre;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
