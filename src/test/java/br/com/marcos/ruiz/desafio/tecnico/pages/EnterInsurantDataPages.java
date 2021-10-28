package br.com.marcos.ruiz.desafio.tecnico.pages;

import br.com.marcos.ruiz.desafio.tecnico.utils.Browser;
import org.openqa.selenium.By;

public class EnterInsurantDataPages extends Browser {

    public static void setFirstName(String value) {
        digitar(By.id("firstname"), value);
    }

    public static void setLastName(String value) {
        digitar(By.id("lastname"), value);
    }

    public static void setDateOfBirth(String value) {
        String[] adata = value.split("/");
        clicar(By.id("opendateofbirthcalender"));
        clicar(By.xpath("//a[ .='"+ adata[0] +"']"));
        digitar(By.id("birthdate"),adata[1]+"/"+adata[0]+"/"+adata[2] );
    }

    public static void setCountry(String option) {
        selectText(By.id("country"), option);
    }

    public static void setZipCcode(String value) {
        digitar(By.id("zipcode"), value);
    }

    public static void setOccupation(String option) {
        selectText(By.id("occupation"), option);
    }

    public static void clicaHobbies(String... option) {
        for (String op : option){
            clicar(By.xpath("//label[input[@id='" + op + "']]"));
        }
    }

    public static void clicaBtnNext(){
        clicar(By.id("nextenterproductdata"));
    }


}
