package fr.gamedev.question.data;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author djer1
 *
 */
@Entity
public class Preference {
    //TODO grp1 by DJE : JavaDoc : la JavaDoc de la classe se trouve juste avant la classe (là ou il y a deja le @author). Ici c'est pour documenter l'attribut id.
    //TODO grp1 by DJE : JavaDoc : il n'est pas très utile d'indiquer le nom de la classe, on le voit dans le code et JavaDoc le récupère autmatiquement. Qu'est-ce que cette classe ? A quoi sert-elle ? 
    /**
     * Class Preference.
     */
    @GeneratedValue(generator = "seq_gen_preference")
    @GenericGenerator(name = "seq_gen_preference", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_preference"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })
    @Id
    private long id;
    /**
     * Code.
     */
    private String code;
    /**
     * Preference.
     */
    private String nom;
    /**
     * Join Class Skill.
     */
    @ManyToMany
    //TODO grp1 by DJE : ORM :l'annotation @JoinTable est optionnelles et il faut eviter de l'utiliser. Cela créer des liens avec la BDD directement, ce que justement l'ORM essaie d'éviter. Cette annotation sert surtout lorsque l'on ajoute l'ORM après coups et que les règles par defaut n'ont pas été appliquées.
    @JoinTable(name = "PREF_SKILL", joinColumns = @JoinColumn(name = "PREF_ID"),
            inverseJoinColumns = @JoinColumn(name = "SKILL_ID"))
    private Collection<Skill> skill;

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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param theCode the code to set
     */
    public void setCode(final String theCode) {
        this.code = theCode;
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

    //TODO grp1 by DJE : JavaDoc : indique la JavaDoc. Deplus lorsque CheckStyle détecte une méthode nom compatible avec "designForExtension" il l'ignore s'il y a une JavaDoc (supposant que la JavaDoc indique comment correctement étendre)

    public Collection<Skill> getSkill() {
        return skill;
    }

    //TODO grp1 by DJE : JavaDoc : indique la JavaDoc. Deplus lorsque CheckStyle détecte une méthode nom compatible avec "designForExtension" il l'ignore s'il y a une JavaDoc (supposant que la JavaDoc indique comment correctement étendre)
    public void setSkill(Collection<Skill> skill) {
        this.skill = skill;
    }

}
