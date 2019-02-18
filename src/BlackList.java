import java.util.List;

public class BlackList {

    ListofName QQ(List<ListofName> whitelist, String name) {
        for (ListofName lf : whitelist) {
            if( lf.getEmail().equalsIgnoreCase(name) ){
                System.out.println("Этот человек находится в белом списке");
            } else {
                System.out.println("Этому пользователю вход запрещен");
            }
            return lf;
        }
        return null;
    }

   
}



