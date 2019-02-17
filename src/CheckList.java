import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CheckList {
    public static void getLogic(Properties prop) {
        try (Connection connect = ConnectDataBase.getConnectDb(prop);
             Statement st = connect.createStatement()) {
            String query = "SELECT * FROM whitelist";
            ResultSet rs = st.executeQuery(query);
            List<ListofName> blacklist = new ArrayList<>();
            while (rs.next()) {
                ListofName listofName = new ListofName();

                listofName.setName(rs.getString("first_name"));
                listofName.setLastName(rs.getString("last_name"));
                listofName.setEmail(rs.getString("email"));
                blacklist.add(listofName);
            }
            System.out.println("list " + blacklist.toString());
        } catch (IllegalAccessException | SQLException ex) {
            ex.printStackTrace();
        }
    }

}



