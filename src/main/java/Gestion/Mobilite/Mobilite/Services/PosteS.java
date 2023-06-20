package Gestion.Mobilite.Mobilite.Services;

import Gestion.Mobilite.Mobilite.Model.Entity.PosteE;
import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Model.Repository.PosteR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteS {

    @Autowired
    public PosteR P ;

    public PosteE addPoste(PosteE p){
        return this.P.save(p) ;

    }
    public List<PosteE> GetAllPostes( ){
        return this.P.findAll() ;

    }

    public PosteE Uppdateposte(PosteE updatedposte) {

        PosteE existingposte = P.findById(updatedposte.getId()).orElse(null);

        if (existingposte != null) {

            updatedposte.copyPosteProperties(existingposte);


            return P.save(updatedposte);
        }

        return null;
    }
    public void DeleteP(Long id){
         this.P.deleteById(id); ;

    }

}
