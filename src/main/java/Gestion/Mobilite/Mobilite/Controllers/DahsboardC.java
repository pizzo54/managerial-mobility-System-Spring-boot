package Gestion.Mobilite.Mobilite.Controllers;

import Gestion.Mobilite.Mobilite.Services.DahsboardS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Request")
public class DahsboardC {
@Autowired
    public DahsboardS d ;
@GetMapping("/user")
    public long usernumber(){
        return  this.d.usernumber();
    }
    @GetMapping("/poste")
    public Long  postenumber(){
        return  this.d.postenumber();
    }
    @GetMapping("/candidature")
    public Long  candidaturenumber(){
        return  this.d.candidaturenumber();
    }
    @GetMapping("/nomination")
    public long nominationumber(){
        return  this.d.nominationumber();
    }



}
