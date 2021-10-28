package br.com.marcos.ruiz.desafio.tecnico.pages;

import br.com.marcos.ruiz.desafio.tecnico.utils.Browser;
import org.openqa.selenium.By;

public class EnterProductDataPages extends Browser {

    public static void setStartDate(String value){
        String[] adata = value.split("/");
        clicar(By.id("openstartdatecalender"));
        clicar(By.xpath("//a[ .='"+ adata[0] +"']"));
        digitar(By.id("startdate"),adata[1]+"/"+adata[0]+"/"+adata[2] );
    }

    public static void setInsuranceSum(String option){
        selectText(By.id("insurancesum"),option);
    }

    public static void setMeritRating(String option){
        selectText(By.id("meritrating"),option);
    }

    public static void setDamageInsurance(String option){
        selectText(By.id("damageinsurance"),option);
    }

    public static void clicaOptionalProducts(String... option) {
        for (String op : option){
            clicar(By.xpath("//label[input[@id='" + op + "']]"));
        }
    }

    public static void setCourtesyCar(String option){
        selectText(By.id("courtesycar"),option);
    }

    public static void clicaBtnNext(){
        clicar(By.id("nextselectpriceoption"));
    }

}
