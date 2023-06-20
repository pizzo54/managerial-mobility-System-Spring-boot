package Gestion.Mobilite.Mobilite.Services;

import Gestion.Mobilite.Mobilite.Model.Repository.CandidatureR;
import Gestion.Mobilite.Mobilite.Model.Repository.NominationR;
import Gestion.Mobilite.Mobilite.Model.Repository.PosteR;
import Gestion.Mobilite.Mobilite.Model.Repository.UserR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DahsboardS {

    @Autowired
    public UserR u ;
    @Autowired
    public PosteR p ;
    @Autowired
    public CandidatureR c ;
    @Autowired
    public NominationR n ;

    public long usernumber(){
        return  this.u.count();
    }
    public long postenumber(){
        return  this.p.count();
    }
    public long candidaturenumber(){
        return  this.c.count();
    }
    public long nominationumber(){
        return  this.n.count();
    }

}
