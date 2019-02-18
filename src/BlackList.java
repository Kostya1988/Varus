import java.util.List;

public class BlackList {

   public ListofName Selectionmethod(List<ListofName> whitelist, String Email) {
        for (ListofName listofName : whitelist) {
            if( listofName.getEmail().equalsIgnoreCase(Email) ){
                System.out.println("Этот человек находится в белом списке");
            } else {
                System.out.println("Этому пользователю вход запрещен");
            }
            return listofName;
        }
        return null;
    }

   
}



