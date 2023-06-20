package Gestion.Mobilite.Mobilite.Model.Repository;

import Gestion.Mobilite.Mobilite.Model.Entity.CandidatureE;
import Gestion.Mobilite.Mobilite.Model.Entity.UserE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CandidatureR extends JpaRepository<CandidatureE,Long> {
    Optional<List<CandidatureE>> findByNomC(String Username);

}
