package Gestion.Mobilite.Mobilite.Controllers;

import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Services.UserS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserC {

    @Autowired
    public UserS user ;




    @PostMapping("/addUser")
    public ResponseEntity<UserE> addUser(@RequestBody UserE u){
        return  new ResponseEntity<>(this.user.addUser(u), HttpStatus.OK);

    }
    @PutMapping("/UpdateUser")
    public ResponseEntity<UserE>  UppdateUser(@RequestBody UserE u){
        return  new ResponseEntity<>(this.user.UppdateUser(u), HttpStatus.OK);

    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> DeleteUser(@RequestParam Long id){
        this.user.DeleteUser(id) ;
        return  new ResponseEntity<>( HttpStatus.OK);

    }
    @GetMapping("/GetAllUsers")
    public ResponseEntity<List<UserE>>  GetUsers(){
        return  new ResponseEntity<>(this.user.GetUsers(), HttpStatus.OK);
    }
    @GetMapping("getit")
    public ResponseEntity<List<UserE>>  GetUit(){
        return  new ResponseEntity<>(this.user.GetUsers(), HttpStatus.OK);
    }
}
