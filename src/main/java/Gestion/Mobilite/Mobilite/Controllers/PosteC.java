package Gestion.Mobilite.Mobilite.Controllers;

import Gestion.Mobilite.Mobilite.Model.Entity.PosteE;
import Gestion.Mobilite.Mobilite.Services.PosteS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Poste")
public class PosteC {

    @Autowired
    public PosteS S ;
    @PostMapping("/addPoste")
    public ResponseEntity<PosteE>  addPoste(@RequestBody PosteE p){
        return  new ResponseEntity<>(this.S.addPoste(p), HttpStatus.OK) ;

    }

    @GetMapping("getAllPostes")
    public  ResponseEntity <List<PosteE>> GetAllPostes( ){
        return  new ResponseEntity<>(this.S.GetAllPostes(), HttpStatus.OK) ;

    }
    @PutMapping("/UpdatePoste")
    public ResponseEntity<PosteE> UpdatePoste(@RequestBody PosteE p){
        return  new ResponseEntity<>(this.S.Uppdateposte(p), HttpStatus.OK) ;


    }
    @DeleteMapping("/DeletePoste")
    public ResponseEntity<?> DeleteP(@RequestParam Long id){
        this.S.DeleteP(id) ;
        return  new ResponseEntity<>(  HttpStatus.OK) ;


    }
}
