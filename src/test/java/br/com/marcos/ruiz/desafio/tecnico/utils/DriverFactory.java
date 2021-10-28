package br.com.marcos.ruiz.desafio.tecnico.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Classe de inicialização de instancia do driver do Browser.
 *
 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
 */
public class DriverFactory {

    private static final long TIME_IMPLICIT = 5 ;
    private static final String DRIVER_CHROME = Utils.getProp("ch_driver");
    private static WebDriver driver;

    /**
     * Método para fechar o Driver.
     *
     * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
     */
    public static void killDriver() {
        driver.quit();
    }


    /**
     * Método de criação do Driver com suas capacidades.
     *
     * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
     */
    public static void getDriver(String url, boolean headless) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("—-disable-gpu");
        options.addArguments("--window-size=1200,1500");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        if (headless) options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", DRIVER_CHROME);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(TIME_IMPLICIT, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Driver Chrome instanciado com URL: " + url);
    }

    public static WebDriver getDriverBrowser() {
        return driver;
    }

}
