package br.com.marcos.ruiz.desafio.tecnico.steps;

import br.com.marcos.ruiz.desafio.tecnico.utils.DriverFactory;
import br.com.marcos.ruiz.desafio.tecnico.utils.Utils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import java.io.FileInputStream;

import static org.junit.Assert.assertEquals;

public class DesafioTecnicoSteps {

    @Quando("Entrar no site {string}")
    public void entrarNoSite(String url) {
        Utils.init();
        DriverFactory.getDriver(url,false);
    }

    @E("Preencher o formulário, aba {string} e pressione next")
    public void preencherOFormulárioAbaEnterVehicleDataEPressioneNext(String aba) {
        switch (aba) {
            case "Somar":


                break;
            case "Subtrair":

                break;
            case "Multiplicar":


                break;
            case "Dividir":

                break;
        }
    }

    @E("Preencher o formulário, aba {string} e pressione Send")
    public void preencherOFormulárioAbaEPressioneSend(String aba) {

    }

    @Então("Verificar a mensagem {string} na tela")
    public void verificarAMensagemNaTela(String mensagem) {
    }
}
