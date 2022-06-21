package Model;

/**
 *
 * @author Yasiru Ravishan
 */
public class PublishJob {
    public String jobtitle;
    public  String jobtype;
    public String jobrole;
    public String jobTech;
    public String jobtele;
    public String Publisher_id;
    
    public PublishJob(String jobtitle,String jobtype,String jobrole,String jobTech,String jobtele, String Publisher_id){
        this.jobtitle = jobtitle;
        this.jobtype = jobtype;
        this.jobrole = jobrole;
        this.jobTech = jobTech;
        this.jobtele = jobtele;
        this.Publisher_id = Publisher_id;
        
    }
    
}
