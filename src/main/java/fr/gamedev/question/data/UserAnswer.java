/**
 *
 */
package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author djer1
 *
 */
@Entity
public class UserAnswer {
    //TODO grp1 by DJE : JavaDoc : la JavaDoc de la classe se trouve juste avant la classe (là ou il y a deja le @author). Ici c'est pour documenter l'attribut id.
    /**
     * Class UserAnswer.
     */
    @GeneratedValue(generator = "seq_gen_userAnswer")
    @GenericGenerator(name = "seq_gen_userAnswer", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_answerUser"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })
    @Id
    private long id;

    /**
     * Join Class User.
     */
    @ManyToOne
    private User user;
    /**
     * Join Class Answer.
     */
    @ManyToOne
    private Answer answer;
    /**
     * Points que rapporte la réponse.
     */
    private long points;

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
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param theUser the user to set
     */
    public void setUser(final User theUser) {
        this.user = theUser;
    }

    /**
     * @return the points
     */
    public long getPoints() {
        return points;
    }

    /**
     * @param thePoints the points to set
     */
    public void setPoints(final long thePoints) {
        this.points = thePoints;
    }

    /**
     * @return the answer
     */
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @param theAnswer the answer to set
     */
    public void setAnswer(final Answer theAnswer) {
        this.answer = theAnswer;
    }

}
