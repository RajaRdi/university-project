package ma.fst.universite.ws.converter;
import ma.fst.universite.bean.Semestre;
import ma.fst.universite.ws.dto.SemestreDto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
    public class SemestreConverter {
        public Semestre toBean(SemestreDto dto){
            Semestre bean = new Semestre();
            bean.setId(dto.getId());
            bean.setCode(dto.getCode());
            return bean;
        }
        public List<Semestre> toBean(List<SemestreDto> dtos){
            return dtos.stream().map(e->toBean(e)).collect(Collectors.toList());
        }
        public SemestreDto toDto(Semestre bean){
            SemestreDto dto = new SemestreDto();
            dto.setId(bean.getId());
            dto.setCode(bean.getCode());
            return dto;
        }
        public List<SemestreDto> toDto(List<Semestre> beans){
            return beans.stream().map(this::toDto).collect(Collectors.toList());

        }
    }




