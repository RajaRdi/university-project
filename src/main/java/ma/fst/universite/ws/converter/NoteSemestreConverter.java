package ma.fst.universite.ws.converter;

import ma.fst.universite.bean.NoteSemestre;
import ma.fst.universite.ws.dto.NoteSemestreDto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
    @Component
    public class NoteSemestreConverter {
        public NoteSemestre toBean(NoteSemestreDto dto){
            NoteSemestre bean = new NoteSemestre();
            bean.setId(dto.getId());
            bean.setCode(dto.getCode());
            bean.setNote(dto.getNote());
            bean.setValidationSemestre(dto.isValidationSemestre());
            bean.setAnnee(dto.getAnnee());
            bean.setSemestre(dto.getSemestre());
            bean.setFiliere(dto.getFiliere());
            bean.setEtudiant(dto.getEtudiant());
            return bean;
        }
        public List<NoteSemestre> toBean(List<NoteSemestreDto> dtos){
            return dtos.stream().map(e->toBean(e)).collect(Collectors.toList());
        }
        public NoteSemestreDto toDto(NoteSemestre bean){
            NoteSemestreDto dto = new NoteSemestreDto();
            dto.setId(bean.getId());
            dto.setCode(bean.getCode());
            dto.setNote(bean.getNote());
            dto.setValidationSemestre(bean.isValidationSemestre());
            dto.setAnnee(bean.getAnnee());
            dto.setSemestre(bean.getSemestre());
            dto.setFiliere(bean.getFiliere());
            dto.setEtudiant(bean.getEtudiant());
            return dto;
        }
        public List<NoteSemestreDto> toDto(List<NoteSemestre> beans){
            return beans.stream().map(this::toDto).collect(Collectors.toList());
        }
    }

