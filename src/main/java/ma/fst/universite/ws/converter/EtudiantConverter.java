package ma.fst.universite.ws.converter;

import ma.fst.universite.bean.Filiere;
import ma.fst.universite.bean.Etudiant;
import ma.fst.universite.ws.dto.EtudiantDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EtudiantConverter {
        public Etudiant toBean(EtudiantDto dto){
            Etudiant bean = new Etudiant();
            BeanUtils.copyProperties(bean, dto);
            return bean;
        }
        public EtudiantDto toDto(Etudiant bean){
            EtudiantDto dto = new EtudiantDto();
            BeanUtils.copyProperties(dto, bean);
            return dto;
        }
        public List<Etudiant> toBean(List<EtudiantDto> dtos){
            return dtos.stream().map(this::toBean).collect(Collectors.toList());

        }
        public List<EtudiantDto> toDto(List<Etudiant> beans) {
            return beans.stream().map(e->toDto(e)).collect(Collectors.toList());
        }



    }