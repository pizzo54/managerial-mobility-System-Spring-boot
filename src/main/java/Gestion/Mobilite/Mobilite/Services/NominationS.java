package Gestion.Mobilite.Mobilite.Services;


import Gestion.Mobilite.Mobilite.Model.Entity.CandidatureE;
import Gestion.Mobilite.Mobilite.Model.Entity.Nomination;
import Gestion.Mobilite.Mobilite.Model.Entity.PosteE;
import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Model.Repository.CandidatureR;
import Gestion.Mobilite.Mobilite.Model.Repository.NominationR;
import Gestion.Mobilite.Mobilite.Model.Repository.PosteR;
import Gestion.Mobilite.Mobilite.Model.Repository.UserR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NominationS {

    @Autowired
    public NominationR P ;
    @Autowired
    public CandidatureR c ;
    @Autowired
    public PosteR p ;
    @Autowired
    public UserR  u ;

    public Nomination addNomination(Nomination p){
        return this.P.save(p) ;

    }
    public List<Nomination> GetAllNomination( ){
        return this.P.findAll() ;

    }

    public void DeleteNomination(Long id){
        this.P.deleteById(id); ;

    }
    public Nomination UpdateNomination(Nomination p){
       return this.P.save(p);

    }
    public List<CandidatureE> getcandidature(){
        return this.c.findAll() ;

    }
    public List<PosteE> getposte(){
        return this.p.findAll();

    }
    public List<UserE> getUser(){
 return this.u.findAll() ;
    }

}
