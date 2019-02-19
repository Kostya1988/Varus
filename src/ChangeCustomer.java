import java.util.ArrayList;
import java.util.List;

public class ChangeCustomer {
     static void customerRep(List<ListofName> whitelist) {
        try {
            System.out.println("Change user" + whitelist.get(0));
            whitelist.get(0).setLastName("Petrova");
            whitelist.get(0).setEmail("000000");
            whitelist.get(0).setName("Vita");
            System.out.println(" On user  " + whitelist.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
