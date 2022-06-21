package Model;

import java.util.Date;

/**
 *
 * @author Yasiru Ravishan
 */
public class Answer {
    public String QueID;
    public String AnswerPub;
    public Date AnsPubDate;
    public String AnswPubID;
    public String QuesPubId;
    
    public Answer(String QueID,String AnswerPub,Date AnsPubDate,String AnswPubID ,String QuesPubId){
        
        this.QueID = QueID;
        this.AnswerPub = AnswerPub;
        this.AnsPubDate = AnsPubDate;
        this.AnswPubID = AnswPubID;
        this.QuesPubId = QuesPubId;
       
    }
}
