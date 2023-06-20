package Gestion.Mobilite.Mobilite.Controllers;

import Gestion.Mobilite.Mobilite.Model.Entity.CandidatureE;
import Gestion.Mobilite.Mobilite.Model.Entity.Nomination;
import Gestion.Mobilite.Mobilite.Model.Entity.PosteE;
import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Services.NominationS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Nomination")
public class NominationC {
    @Autowired
    public NominationS c ;

    @PostMapping("/AddN")
    public ResponseEntity<Nomination> addNomination(@RequestBody Nomination C){
        return  new ResponseEntity<>(this.c.addNomination(C), HttpStatus.OK) ;
    }

    @DeleteMapping("/DeleteN")

    public  ResponseEntity<?>  DeleteNomination(@RequestParam Long id){
        this.c.DeleteNomination(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/GetAllN")
    public ResponseEntity<List<Nomination>>  getALL(){
        return  new ResponseEntity<>(this.c.GetAllNomination(),HttpStatus.OK);
    }

    @PutMapping("/UpdateN")
    public ResponseEntity<Nomination>  UppdateN(@RequestBody Nomination u){
        return  new ResponseEntity<>(this.c.UpdateNomination(u), HttpStatus.OK);

    }
    @GetMapping("/GetAllC")
    public ResponseEntity<List<CandidatureE>> getcandidature(){
        return  new ResponseEntity<>(this.c.getcandidature(),HttpStatus.OK )  ;

    }
    @GetMapping("/GetAllP")
    public ResponseEntity<List<PosteE> > getposte(){
        return  new ResponseEntity<>( this.c.getposte(),HttpStatus.OK )  ;

    }
    @GetMapping("/GetAllU")
    public ResponseEntity<List<UserE> > getUser(){
        return  new ResponseEntity<>( this.c.getUser() ,HttpStatus.OK )  ;
    }


}
