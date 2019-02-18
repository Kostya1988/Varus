import java.util.List;

public class BlackList {

    public boolean selectionMethod(List<ListofName> whitelist, String Email) {
        boolean isCheck = false;
        for (ListofName listofName : whitelist) {
            if (listofName.getEmail().equalsIgnoreCase(Email)) {
                System.out.println("Этот человек находится в белом списке");
                isCheck = true;
            }
        }
        return isCheck;
    }
}


