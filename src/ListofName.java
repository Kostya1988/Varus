import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListofName {


        

    


    private String name;
    private String lastName;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
         public String toString(){
        return  "\n whitelist { "+ "firstName= " + name +
                " lastName= " + lastName  +
                " email= " + email  +
                '}';

        }
    }


