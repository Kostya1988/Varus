import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class Main {


    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(fileIn);
            BlackList blackList = new BlackList();
            blackList.selectionMethod(CheckList.getLogic(prop), "1111");
            RemoveCustumer removeCustumer = new RemoveCustumer();
            removeCustumer.clientRemove(CheckList.getLogic(prop));
            ChangeCustomer changeCustomer=new ChangeCustomer();
            changeCustomer.customerRep(CheckList.getLogic(prop));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}