package ma.fst.universite.service.facade;
import ma.fst.universite.bean.Filiere;
import java.util.List;


public interface FiliereService {
    Filiere findByCode(String code);

    int deleteByCode(String code);


    List<Filiere> findAll();

    Filiere save(Filiere filiere);
}
