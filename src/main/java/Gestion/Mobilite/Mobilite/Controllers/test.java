package Gestion.Mobilite.Mobilite.Controllers;

import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Services.UserS;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addUser")
public class test {

    @Autowired
    private UserS u ;
    @PostMapping
    public UserE add(@RequestBody UserE uu){
        return this.u.addUser(uu) ; }


}
