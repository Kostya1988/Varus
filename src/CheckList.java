import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CheckList {

    public static List<ListofName> getLogic(Properties prop) {
        try (Connection connect = ConnectDataBase.getConnectDb(prop);
             Statement st = connect.createStatement()) {
            String query = "SELECT * FROM whitelist";
            ResultSet rs = st.executeQuery(query);
            List<ListofName> whitelist = new ArrayList<>();
            while (rs.next()) {
                ListofName listofName = new ListofName();

                listofName.setName(rs.getString("first_name"));
                listofName.setLastName(rs.getString("last_name"));
                listofName.setEmail(rs.getString("email"));
                whitelist.add(listofName);
            }
            System.out.println("list " + whitelist.toString());
            return whitelist;
        } catch (IllegalAccessException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }


}


