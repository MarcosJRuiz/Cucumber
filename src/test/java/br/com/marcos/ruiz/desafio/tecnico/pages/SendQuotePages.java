package br.com.marcos.ruiz.desafio.tecnico.pages;

import br.com.marcos.ruiz.desafio.tecnico.utils.Browser;
import org.openqa.selenium.By;

public class SendQuotePages extends Browser {

    public static void setEmail(String value){
        digitar(By.id("email"),value);
    }

    public static void setUsername(String value){
        digitar(By.id("username"),value);
    }

    public static void setPassword(String value){
        digitar(By.id("password"),value);
    }

    public static void setConfirmPassword(String value){
        digitar(By.id("confirmpassword"),value);
    }

    public static void clicaBtnSend(){
        clicar(By.id("sendemail"));
    }

    public static boolean textoMensagemFinal(String mensagem){
            By xpath = By.xpath("//h2[.='" + mensagem + "']");
            aguardarElementoExistir(xpath);
            return elementoExiste(xpath);
    }


}
