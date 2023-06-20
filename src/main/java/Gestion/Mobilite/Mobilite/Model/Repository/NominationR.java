package Gestion.Mobilite.Mobilite.Model.Repository;

import Gestion.Mobilite.Mobilite.Model.Entity.Nomination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NominationR extends JpaRepository<Nomination, Long> {
}
