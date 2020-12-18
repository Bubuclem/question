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
public class Skill {
    /**
     * Class Skill.
     */
    @GeneratedValue(generator = "seq_gen_skill")
    @GenericGenerator(name = "seq_gen_skill", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_skill"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })
    @Id
    private long id;
    /**
     * Nom.
     */
    private String nom;
    /**
     * Join Class Categorie.
     */
    @ManyToMany
    @JoinTable(name = "SKILL_CAT", joinColumns = @JoinColumn(name = "SKILL_ID"),
            inverseJoinColumns = @JoinColumn(name = "CAT_ID"))
    private Collection<Categorie> categorie;

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

    public Collection<Categorie> getCategorie() {
        return categorie;
    }

    public void setCategorie(Collection<Categorie> categorie) {
        this.categorie = categorie;
    }
}
