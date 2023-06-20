package Gestion.Mobilite.Mobilite.Model.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserE implements UserDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;
        private String imageUrl ;
        private String nomU;
        private String prenomU;
        private String age;
        private String cin ;
        private String telephone ;
        private String dateNaissance ;
        private  String email ;
        private  String login ;
        private String password ;
        private String type ;
        private String fonction ;
        private  String posteActuelle ;
        private String dateNomination ;
        private String localiteActuelle;
        private String situationFamilial ;
        private  Integer nbrEnfants ;
        private  String diplomes ;




    public UserE(String imageUrl, String nomU, String prenomU, String cin, String telephone, String dateNaissance, String email, String login, String password, String type, String fonction, String posteActuelle, String dateNomination, String localiteActuelle, String situationFamilial, Integer nbrEnfants, String diplomes) {
        this.imageUrl = imageUrl;
        this.nomU = nomU;
        this.prenomU = prenomU;
        this.cin = cin;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.login = login;
        this.password = password;
        this.type = type;
        this.fonction = fonction;
        this.posteActuelle = posteActuelle;
        this.dateNomination = dateNomination;
        this.localiteActuelle = localiteActuelle;
        this.situationFamilial = situationFamilial;
        this.nbrEnfants = nbrEnfants;
        this.diplomes = diplomes;


    }










    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(type);
        return Collections.singleton(authority);
    }

    @Override
    public String getUsername() {
        return login;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
