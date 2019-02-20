import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RemoveCustumer {

    void clientRemove(List<ListofName> whitelist, String name) {
        try {
            for (Iterator<ListofName> iterator = whitelist.iterator(); iterator.hasNext();) {
            ListofName listofName = iterator.next();
                if (listofName.getName().equalsIgnoreCase(name)) {
            iterator.remove();
                    System.out.println(whitelist.toString());
             }
         }
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

       

