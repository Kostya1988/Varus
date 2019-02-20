import java.util.List;

public class BlackList {

    public boolean selectionMethod(List<ListofName> whitelist, String Email) {
        boolean isCheck = false;
        for (ListofName listofName : whitelist) {
            if (listofName.getEmail().equalsIgnoreCase(Email)) {
                System.out.println("This person is on the white list");
                isCheck = true;
            }
        }
        return isCheck;
    }
}


