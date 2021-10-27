package br.com.marcos.ruiz.desafio.tecnico.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Utils {
    private static Properties prop;
    private static final String FILE_PARAMETERS = "src/test/java/resources/dados.properties";

    public static void init() {
       try {
           prop = new Properties();
           prop.load(new FileInputStream(FILE_PARAMETERS));
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public static String getProp(final String key) {
        try {
            return (prop.getProperty(key).replaceAll("\"", "").replaceAll("'", ""));
        } catch (Exception e) {
            System.out.println("A propriedade [".concat(key).concat("] não foi declada no seu arquivo dados.propeties."));
            throw e;
        }
    }
}
