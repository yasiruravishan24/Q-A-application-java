package Model;

import java.util.Date;

/**
 *
 * @author Yasiru Ravishan
 */
public class Questions {

    public String queTitle;
    public String techTags;
    public String question;
    public Date submitDate;
    public String Publisher_id;

    public  Questions(String queTitle, String techtags, String question, Date submitDate, String Publisher_id) {
        this.queTitle = queTitle;
        this.techTags = techtags;
        this.question = question;
        this.submitDate = submitDate;
        this.Publisher_id = Publisher_id;

    }

}
