import java.util.List;

public class RemoveCustumer {

    public void clientRemove(List<ListofName> whitelist) {
        try {
            System.out.println("Remove client " + whitelist.get(0));
            whitelist.remove(0);
            System.out.println(whitelist.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
