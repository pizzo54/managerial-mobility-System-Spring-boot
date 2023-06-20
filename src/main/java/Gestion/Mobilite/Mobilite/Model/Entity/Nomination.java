package Gestion.Mobilite.Mobilite.Model.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Nomination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private String resultat ;
    @OneToOne
    @JoinColumn(name = "utilisateur_id",referencedColumnName = "id")
    private UserE utilisateur;


    @OneToOne
    @JoinColumn(name = "candidature_id",referencedColumnName = "id")
    private CandidatureE candidature;





}
