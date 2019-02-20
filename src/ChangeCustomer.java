import java.util.ArrayList;
import java.util.List;

public class ChangeCustomer {
    static void customerRep(List<ListofName> whitelist, String LastName) {
        try {
            for (ListofName listofName : whitelist) {
                if (listofName.getLastName().equalsIgnoreCase(LastName)) {
                    listofName.setLastName("Petrova");
                    listofName.setEmail("000000");
                    listofName.setName("Vita");
                    System.out.println("Change user" + whitelist.toString());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
