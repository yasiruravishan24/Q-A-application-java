package Model;

import java.util.*;

/**
 *
 * @author Yasiru Ravishan
 */
public class UserInput {

    public String Fname;
    public String Sname;
    public Date dob;
    public String email;
    public String Password;
    public String username;

    public UserInput(String Fname, String Sname, Date dob, String email, String Username, String password) {
        this.Fname = Fname;
        this.Sname = Sname;
        this.dob = dob;
        this.email = email;
        this.username = Username;
        this.Password = password;

    }
}
