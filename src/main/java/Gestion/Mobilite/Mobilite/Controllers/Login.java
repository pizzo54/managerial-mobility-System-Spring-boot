package Gestion.Mobilite.Mobilite.Controllers;


import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Model.Repository.UserR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class Login {
    @Autowired
    private  UserR userRepository;
    @GetMapping
   public UserE log (@RequestParam String l){
          UserE u = userRepository.findByLogin(l).get();
          return u ;

   }
}
