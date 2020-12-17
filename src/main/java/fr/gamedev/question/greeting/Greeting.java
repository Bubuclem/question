/**
 *
 */
package fr.gamedev.question.greeting;

/**
 * @author djer1
 *
 */
public class Greeting {

    /** oui. */
    private final long id;
    /** . */
    private final String content;

    /**
     * @param theContent
     * @param theId
     */
    public Greeting(final long theId, final String theContent) {
        this.id = theId;
        this.content = theContent;
    }

    /** @return id. */
    public long getId() {
        return id;
    }

    /** @return content. */
    public String getContent() {
        return content;
    }

}
