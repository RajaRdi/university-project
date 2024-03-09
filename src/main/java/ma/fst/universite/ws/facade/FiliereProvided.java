package ma.fst.universite.ws.facade;

import ma.fst.universite.bean.Filiere;
import ma.fst.universite.service.facade.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filiere/")
public class FiliereProvided {
    @Autowired
    private FiliereService filiereService;
    @GetMapping("code/{code}")
    public Filiere findByCode(@PathVariable String code) {
        return filiereService.findByCode(code);
    }
    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return filiereService.deleteByCode(code);
    }

    @GetMapping()
    public List<Filiere> findAll() {
        return filiereService.findAll();
    }
    @PostMapping()
    public Filiere save(@RequestBody Filiere filiere) {
        return filiereService.save(filiere);
    }
}
