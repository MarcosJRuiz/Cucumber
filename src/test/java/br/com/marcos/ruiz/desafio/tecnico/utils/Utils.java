package br.com.marcos.ruiz.desafio.tecnico.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileInputStream;
import java.util.Properties;

public class Utils {
    private static Properties prop;
    private static final String FILE_PARAMETERS = "src/test/resources/cucumber.properties";

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
            System.out.println("A propriedade [".concat(key).concat("] nao foi declada no seu arquivo cucumber.propeties."));
            throw e;
        }
    }

    public static void screenshot(Scenario nomeCenario, String msg) {
        try {
            byte[] screenshot = ((TakesScreenshot)DriverFactory.getDriverBrowser()).getScreenshotAs(OutputType.BYTES);
            nomeCenario.attach(screenshot, "image/png",msg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
