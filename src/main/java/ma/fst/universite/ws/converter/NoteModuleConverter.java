package ma.fst.universite.ws.converter;

import ma.fst.universite.bean.NoteModule;
import ma.fst.universite.ws.dto.NoteModuleDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class NoteModuleConverter {
    public NoteModule toBean(NoteModuleDto dto){
        NoteModule bean=new NoteModule();
        bean.setId(dto.getId());
        bean.setCode(dto.getCode());
        bean.setNote(dto.getNote());
        bean.setModule(dto.getModule());
        bean.setNoteSemestre(dto.getNoteSemestre());
        bean.setValidationModule(dto.isValidationModule());
        bean.setNoteApresRatt(dto.getNoteApresRatt());
        bean.setNoteAvantRatt(dto.getNoteAvantRatt());
        return bean;
    }
    public NoteModuleDto toDto(NoteModule bean){
        NoteModuleDto dto=new NoteModuleDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        dto.setNote(bean.getNote());
        dto.setModule(bean.getModule());
        dto.setNoteSemestre(bean.getNoteSemestre());
        dto.setValidationModule(bean.isValidationModule());
        dto.setNoteApresRatt(bean.getNoteApresRatt());
        dto.setNoteAvantRatt(bean.getNoteAvantRatt());
        return dto;
    }

    public List<NoteModule> tobean(List<NoteModuleDto> dtos){
        List<NoteModule> beans=new ArrayList<>();
        for (NoteModuleDto dto : dtos){
            beans.add(toBean(dto));
        }
        return beans;
    }
    public List<NoteModuleDto> todto(List<NoteModule> beans){
        List<NoteModuleDto> dtos=new ArrayList<>();
        for (NoteModule bean : beans){
            dtos.add(toDto(bean));
        }
        return dtos;
    }
}
