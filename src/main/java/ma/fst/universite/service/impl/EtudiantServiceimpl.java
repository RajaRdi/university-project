package ma.fst.universite.service.impl;

import ma.fst.universite.bean.Etudiant;
import ma.fst.universite.dao.EtudiantDao;
import ma.fst.universite.service.facade.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceimpl implements EtudiantService {
    @Autowired
    private EtudiantDao etudiantDao;

    @Override
    public int createEtudiant(Etudiant etudiant) {
        if (etudiant.getId() == null) {
            return -1;
        } else{

            etudiantDao.save(etudiant);
            return 1;
        }

    }

    @Override
    public Etudiant findEtudiantByCodeAppoge(String codeAppoge) {
        return etudiantDao.findByCodeApogee(codeAppoge);
    }



    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantDao.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        Etudiant existEtudiant = findEtudiantByCodeAppoge(etudiant.getCodeApogee());
        if (existEtudiant == null) {
            throw new RuntimeException("Etudiant introuvable avec cet identifiant " + etudiant.getId());
        }
        existEtudiant.setNom(etudiant.getNom());
        existEtudiant.setDateNaissance(etudiant.getDateNaissance());
        return etudiantDao.save(existEtudiant);
    }

    @Override
    public void deleteEtudiant(String codeAppoge) {
        Etudiant etudiant = findEtudiantByCodeAppoge(codeAppoge);
        if (etudiant != null) {
            etudiantDao.delete(etudiant);
        } else {
            throw new RuntimeException("Etudiant introuvable avec cet identifiant " + codeAppoge);
        }
    }

    @Override
    public List<Etudiant> findEtudiantsByFiliereCode(String code) {

        return etudiantDao.findByFiliereCode(code);
    }


}
