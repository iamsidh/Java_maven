package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {


    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();

        String pcpath = System.getProperty("user.dir");
        
        //System.out.println(pcpath);

        FileInputStream fis = new FileInputStream(pcpath+"/src/main/java/config/objects.properties");
        //C:\Users\Sidh\eclipse-workspace\Java_Maven\src\main\java\config\Prop.java

        prop.load(fis);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("salary"));
        
        prop.clear();
        
        FileInputStream fs = new FileInputStream(pcpath+"/src/main/java/config/token.txt");
        
        prop.load(fs);
        
        System.out.println(prop.getProperty("token"));
        
  





    }
}
