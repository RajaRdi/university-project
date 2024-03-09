package ma.fst.universite.ws.facade;

import ma.fst.universite.bean.NoteSemestre;
import ma.fst.universite.service.facade.NoteSemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/nsemestre/")

public class NoteSemestreProvided {
  @Autowired
  private NoteSemestreService noteSemestreService;
    @GetMapping()
    public List<NoteSemestre> findAll() {
        return noteSemestreService.findAll();
    }
    @GetMapping("code/{code}")
    public NoteSemestre findByCode(@PathVariable String code) {
        return noteSemestreService.findByCode(code);
    }
    @GetMapping("codeApogee/{codeApogee}")
    public List<NoteSemestre> findByEtudiantCodeApogee(@PathVariable String codeApogee) {
        return noteSemestreService.findByEtudiantCodeApogee(codeApogee);
    }
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return noteSemestreService.deleteByCode(code);
    }
    @DeleteMapping("codeApogee/{codeApogee}")
    public int deleteByEtudiantCodeApogee(@PathVariable String codeApogee) {
        return noteSemestreService.deleteByEtudiantCodeApogee(codeApogee);
    }
    @PostMapping()
    public NoteSemestre save(@RequestBody NoteSemestre noteSemestre) {
        return noteSemestreService.save(noteSemestre);
    }
}
