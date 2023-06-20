package Gestion.Mobilite.Mobilite.Model.Repository;

import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserR extends JpaRepository< UserE ,Long> {

     Optional<UserE> findByLogin(String Username);
}
