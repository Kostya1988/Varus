import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class Main {


    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(fileIn);
            CheckList.getLogic(prop);
            BlackList ww = new BlackList();
            ww.QQ(CheckList.getLogic(prop), "1111");


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}