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

    public Collection<Skill> getSkill() {
        return skill;
    }

    public void setSkill(Collection<Skill> skill) {
        this.skill = skill;
    }

}
