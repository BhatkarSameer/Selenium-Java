package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class everythingExcel {

    public static void main(String[] args) {

        Properties prop = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream (System.getProperty ("user.dir")+"\\src\\test\\config\\object.properties");
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace ();
        }

        System.out.println (prop.getProperty("name"));
        System.out.println (prop.getProperty("age"));
        System.out.println (prop.getProperty("course"));
        System.out.println (prop.getProperty("occupation"));
        System.out.println (prop.getProperty("salary"));

    }

}