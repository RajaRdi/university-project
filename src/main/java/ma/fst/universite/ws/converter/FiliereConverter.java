package ma.fst.universite.ws.converter;

import ma.fst.universite.bean.Filiere;
import ma.fst.universite.ws.dto.FiliereDto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class FiliereConverter {
        public Filiere toBean(FiliereDto dto){
            Filiere bean = new Filiere();
            bean.setId(dto.getId());
            bean.setCode(dto.getCode());
            bean.setNom(dto.getNom());
            bean.setFaculte(dto.getFaculte());
            return bean;
        }
        public List<Filiere> toBean(List<FiliereDto> dtos){
            return dtos.stream().map(e->toBean(e)).collect(Collectors.toList());
        }
        public FiliereDto toDto(Filiere bean){
            FiliereDto dto = new FiliereDto();
            dto.setId(bean.getId());
            dto.setCode(bean.getCode());
            dto.setNom(bean.getNom());
            dto.setFaculte(bean.getFaculte());
            return dto;
        }
        public List<FiliereDto> toDto(List<Filiere> beans){
            return beans.stream().map(this::toDto).collect(Collectors.toList());

        }
    }


