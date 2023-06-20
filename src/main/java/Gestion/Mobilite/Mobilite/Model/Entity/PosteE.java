package Gestion.Mobilite.Mobilite.Model.Entity;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class PosteE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String logo ;
    private String intitule ;
    private String localite ;
    private String depandenceH ;
    private String dateVacance ;
    private String description ;
    private String conditions ;
    @JsonIgnore
    @OneToMany(mappedBy = "poste", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<CandidatureE> candidatures;
    public void copyPosteProperties(PosteE existingposte) {

        this.setCandidatures(existingposte.getCandidatures());
    }
}
