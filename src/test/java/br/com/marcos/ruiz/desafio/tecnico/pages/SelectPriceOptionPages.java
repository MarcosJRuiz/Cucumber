package br.com.marcos.ruiz.desafio.tecnico.pages;

import br.com.marcos.ruiz.desafio.tecnico.utils.Browser;
import org.openqa.selenium.By;

public class SelectPriceOptionPages extends Browser {

    public static void clicaSelectOption(String option) {
            clicar(By.xpath("//label[input[@value='" + option + "']]"));
    }

    public static void clicaBtnNext(){
        clicar(By.id("nextsendquote"));
    }

}
