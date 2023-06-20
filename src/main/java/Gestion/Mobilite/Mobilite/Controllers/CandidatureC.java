package Gestion.Mobilite.Mobilite.Controllers;

import Gestion.Mobilite.Mobilite.Model.Entity.CandidatureE;
import Gestion.Mobilite.Mobilite.Model.Entity.PosteE;
import Gestion.Mobilite.Mobilite.Services.CandidatureS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Candidature")
public class CandidatureC {
    @Autowired
    public CandidatureS c ;

 @PostMapping("/AddC")
    public ResponseEntity<CandidatureE> addCandidature(@RequestBody CandidatureE C){
        return  new ResponseEntity<>(this.c.addCandidature(C), HttpStatus.OK) ;
    }
    @PutMapping("/UpdateC")
    public ResponseEntity<CandidatureE> UpddateC(@RequestBody CandidatureE C){
        return  new ResponseEntity<>(this.c.UpddateCandidature(C), HttpStatus.OK) ;
    }

    @DeleteMapping("/DeleteC")

    public  ResponseEntity<?>  DeleteC(@RequestParam Long id){
        this.c.DeleteC(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/GetAll")
    public ResponseEntity<List<CandidatureE>>  getALL(@RequestParam Long id){
        return  new ResponseEntity<>(this.c.getALL(id),HttpStatus.OK);
    }
    @GetMapping("/getpst")
    public ResponseEntity<List<PosteE>> getpostes(){
     return  new ResponseEntity<>(this.c.getpostes(),HttpStatus.OK);
    }

}
