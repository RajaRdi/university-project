package ma.fst.universite.service.facade;
import ma.fst.universite.bean.Filiere;
import java.util.List;
import ma.fst.universite.bean.Etudiant;
//salam

    public interface EtudiantService {


        public int createEtudiant(Etudiant etudiant);


        public Etudiant findEtudiantByCodeAppoge(String codeAppoge);



        public List<Etudiant> findAllEtudiants();

        public Etudiant updateEtudiant(Etudiant etudiant);

        public   void deleteEtudiant(String codeAppoge);

        public   List<Etudiant> findEtudiantsByFiliereCode(String code);


    }
