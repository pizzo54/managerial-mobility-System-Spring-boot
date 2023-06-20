package Gestion.Mobilite.Mobilite.Services;

import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import Gestion.Mobilite.Mobilite.Model.Repository.CandidatureR;
import Gestion.Mobilite.Mobilite.Model.Repository.UserR;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserS {
    @Autowired
    public UserR user ;
    @Autowired
    public CandidatureR c ;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;



    public UserE addUser(UserE u){
       String pass = bCryptPasswordEncoder.encode(u.getPassword());
       u.setPassword(pass);
       System.out.println(pass);

        return  this.user.save(u);

    }
    public UserE UppdateUser(UserE updatedUser) {



            return user.save(updatedUser);
        }



    public void DeleteUser(Long id){
          this.user.deleteById(id);

    }
    public List<UserE> GetUsers(){
        return  this.user.findAll();

    }
}
