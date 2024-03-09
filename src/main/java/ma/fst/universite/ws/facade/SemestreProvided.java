package ma.fst.universite.ws.facade;

import ma.fst.universite.bean.Semestre;
import ma.fst.universite.service.facade.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/semestre/")

public class SemestreProvided {
    @Autowired
    private SemestreService semestreService;
    @GetMapping("code/{code}")
    public Semestre findByCode(@PathVariable String code) {
        return semestreService.findByCode(code);
    }
    @DeleteMapping("code/{code}")
    public int deleteByCode(String code) {
        return semestreService.deleteByCode(code);
    }
    @GetMapping()
    public List<Semestre> findAll() {
        return semestreService.findAll();
    }
    @PostMapping()
    public Semestre save(@RequestBody Semestre semestre) {
        return semestreService.save(semestre);
    }
}
