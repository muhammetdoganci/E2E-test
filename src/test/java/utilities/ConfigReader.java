package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static { // her methoddan önce çalışır
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);// fis'in okuduğu bilgileri properties'e yükledi
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
        /*
        test methodundan yolladigimiz string key degerini alip
        Properties class'indan getProperty() methodunu kullanarak
        bu key'e ait value'yi bize getirir
         */

        return properties.getProperty(key);
    }



}
