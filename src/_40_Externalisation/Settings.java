package _40_Externalisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Settings extends Properties {
    private static Settings singleton;
    static final String URL_FILE = "configFile.properties";
    private Settings(){}
    public static Settings get(){
        try {
            if(singleton==null) {
                singleton = new Settings();
                FileInputStream ip= new FileInputStream(URL_FILE);
                singleton.load(ip);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
