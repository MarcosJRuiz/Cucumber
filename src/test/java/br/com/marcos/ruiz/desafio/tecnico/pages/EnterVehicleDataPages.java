package br.com.marcos.ruiz.desafio.tecnico.pages;

import br.com.marcos.ruiz.desafio.tecnico.utils.Browser;
import org.openqa.selenium.By;

public class EnterVehicleDataPages extends Browser {

    public static void setMake(String option){
        selectText(By.id("make"),option);
    }

    public static void setModel(String option){
        selectText(By.id("model"),option);
    }

    public static void setCylinderCapacity(String value){
        digitar(By.id("cylindercapacity"),value);
    }

    public static void setEnginePerformance(String value){
        digitar(By.id("engineperformance"),value);
    }

    public static void setDateOfManufacture(String value){
        String[] adata = value.split("/");
        clicar(By.id("opendateofmanufacturecalender"));
        clicar(By.xpath("//a[@class=\"ui-datepicker-prev ui-corner-all\"]"));
        clicar(By.xpath("//a[ .='"+ adata[0] +"']"));
    }

    public static void setNumberOfSeats(String option){
        selectText(By.id("numberofseats"),option);
    }

    public static void setNumberOfSeatsMotorcycle(String option){
        selectText(By.id("numberofseatsmotorcycle"),option);
    }

    public static void setFuelType(String option){
        selectText(By.id("fuel"),option);
    }

    public static void setPayload(String value){
        digitar(By.id("payload"),value);
    }

    public static void setTotalWeight(String value){
        digitar(By.id("totalweight"),value);
    }

    public static void setListPrice(String value){
        digitar(By.id("listprice"),value);
    }

    public static void setAnnualMileage(String value){
        digitar(By.id("annualmileage"),value);
    }

    public static void clicaBtnNext(){
        clicar(By.id("nextenterinsurantdata"));
    }

}
