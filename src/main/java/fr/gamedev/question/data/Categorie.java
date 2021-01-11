package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author djer1
 *
 */
@Entity
public class Categorie {
    //TODO grp1 by DJE : JavaDoc : la JavaDoc de la classe se trouve juste avant la classe (là ou il y a deja le @author). Ici c'est pour documenter l'attribut id.
    /**
     * Class Categorie.
     */
    @GeneratedValue(generator = "seq_gen_categorie")
    //TODO grp1 by DJE : Eclipse : importe (et utilise) le formatter dans le dossier "eclipseConf" ! 
    @GenericGenerator(name = "seq_gen_categorie", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_categorie"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })
    @Id
    private long id;
    //TODO grp1 by DJE : JavaDoc : Non ! C'est le nom de la catégorie !
    /**
     * Join Class Question.
     */
    private String nom;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param theId the id to set
     */
    public void setId(final long theId) {
        this.id = theId;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param theNom the nom to set
     */
    public void setNom(final String theNom) {
        this.nom = theNom;
    }

}
