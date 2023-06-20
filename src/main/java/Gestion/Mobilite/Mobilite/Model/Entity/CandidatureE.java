package Gestion.Mobilite.Mobilite.Model.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CandidatureE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Integer numero ;
    private String nomC ;
    private String prenomC ;
    private Integer ageC ;
    private String telephoneC;
    private String emailC ;
    private String posteA ;
    private String user;
    private String  raisonM;
    private String etat ;
    @ManyToOne
    @JoinColumn(name = "Poste_id", referencedColumnName = "id" )
    private PosteE poste;
}
