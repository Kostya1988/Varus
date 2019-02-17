import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectDataBase {

    public static Connection getConnectDb(Properties prop) throws IllegalAccessException {
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + prop.getProperty("database") + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false", prop.getProperty("login"), prop.getProperty("password"));
        } catch(Exception ex){
            ex.printStackTrace();
            throw new IllegalAccessException("Error connect");
        }
    }
}