package Gestion.Mobilite.Mobilite.Services;

import Gestion.Mobilite.Mobilite.Model.Repository.UserR;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetails implements UserDetailsService {
    private final static  String usernotfound ="User with Username %s not found";
    @Autowired
    private UserR USER ;
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String l) throws UsernameNotFoundException {
        return USER.findByLogin(l).orElseThrow(() -> new UsernameNotFoundException(String.format(usernotfound,l)));
    }
}
