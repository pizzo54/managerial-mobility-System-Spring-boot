package Gestion.Mobilite.Mobilite.Services;

import Gestion.Mobilite.Mobilite.Model.Entity.CandidatureE;
import Gestion.Mobilite.Mobilite.Model.Entity.PosteE;
import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Model.Repository.CandidatureR;
import Gestion.Mobilite.Mobilite.Model.Repository.PosteR;
import Gestion.Mobilite.Mobilite.Model.Repository.UserR;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;
import java.util.List;

@Service
public class CandidatureS {

    @Autowired
    private CandidatureR candidat ;
    @Autowired
    private PosteR p ;
    @Autowired
    private UserR u ;

    public CandidatureE addCandidature(CandidatureE C){
        Random random = new Random();
        int randomNumber = random.nextInt();
         C.setNumero(randomNumber);
        
      return  candidat.save(C);
    }
    public void DeleteC(Long id){
          candidat.deleteById(id);
    }
    public List<CandidatureE> getALL(Long id){
        UserE uu = this.u.findById(id).get();
        System.out.println(uu);
        if(uu.getType().equals("Utilisateur")){
            return this.candidat.findByNomC(uu.getNomU()).get();
        }


        return candidat.findAll();
    }
   public CandidatureE UpddateCandidature(CandidatureE C) {
        return candidat.save(C) ;
   }

   public List<PosteE> getpostes(){
        List<PosteE> pp = this.p.findAll() ;
   return  pp ;
   }
}
