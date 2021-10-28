package br.com.marcos.ruiz.desafio.tecnico.steps;

import br.com.marcos.ruiz.desafio.tecnico.pages.*;
import br.com.marcos.ruiz.desafio.tecnico.utils.DriverFactory;
import br.com.marcos.ruiz.desafio.tecnico.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


public class DesafioTecnicoSteps {

    private Scenario nomeCenario;

    @Before()
    public void init(Scenario scenario) {
        nomeCenario = scenario;
    }

    @After()
    public static void fim(){
        DriverFactory.killDriver();
    }

    @Quando("Entrar no site {string}")
    public void entrarNoSite(String url) {
        Utils.init();
        DriverFactory.getDriver(url,true);
    }

    @E("Preencher o formulario, aba {string} e pressione next")
    public void preencherOFormularioAbaEnterVehicleDataEPressioneNext(String aba) {
        switch (aba) {
            case "Enter Vehicle Data":
                Utils.screenshot(nomeCenario,"Inicio_do_preenchimento");
                EnterVehicleDataPages.setMake("Audi");
                EnterVehicleDataPages.setModel("Motorcycle");
                EnterVehicleDataPages.setCylinderCapacity("100");
                EnterVehicleDataPages.setEnginePerformance("200");
                EnterVehicleDataPages.setDateOfManufacture("28/10/2020");
                EnterVehicleDataPages.setNumberOfSeats("3");
                EnterVehicleDataPages.setNumberOfSeatsMotorcycle("1");
                EnterVehicleDataPages.setFuelType("Gas");
                EnterVehicleDataPages.setPayload("123");
                EnterVehicleDataPages.setTotalWeight("654");
                EnterVehicleDataPages.setListPrice("3210");
                EnterVehicleDataPages.setAnnualMileage("120");
                Utils.screenshot(nomeCenario, "Tela_com_formulario_preenchido");
                EnterVehicleDataPages.clicaBtnNext();
                break;
            case "Enter Insurant Data":
                Utils.screenshot(nomeCenario,"Inicio_do_preenchimento");
                EnterInsurantDataPages.setFirstName("Primeiro");
                EnterInsurantDataPages.setLastName("Ultimo");
                EnterInsurantDataPages.setDateOfBirth("28/10/2000");
                EnterInsurantDataPages.setCountry("Brazil");
                EnterInsurantDataPages.setZipCcode("04678105");
                EnterInsurantDataPages.setOccupation("Public Official");
                EnterInsurantDataPages.clicaHobbies("speeding","skydiving");
                Utils.screenshot(nomeCenario, "Tela_com_formulario_preenchido");
                EnterInsurantDataPages.clicaBtnNext();
                break;
            case "Enter Product Data":
                Utils.screenshot(nomeCenario,"Inicio_do_preenchimento");
                EnterProductDataPages.setStartDate("28/10/2022");
                EnterProductDataPages.setInsuranceSum("10.000.000,00");
                EnterProductDataPages.setMeritRating("Malus 10");
                EnterProductDataPages.setDamageInsurance("No Coverage");
                EnterProductDataPages.clicaOptionalProducts("LegalDefenseInsurance");
                EnterProductDataPages.setCourtesyCar("Yes");
                Utils.screenshot(nomeCenario, "Tela_com_formulario_preenchido");
                EnterProductDataPages.clicaBtnNext();
                break;
            case "Select Price Option":
                Utils.screenshot(nomeCenario,"Inicio_do_preenchimento");
                SelectPriceOptionPages.clicaSelectOption("Gold");
                Utils.screenshot(nomeCenario, "Tela_com_a_opcao_selecionada");
                SelectPriceOptionPages.clicaBtnNext();
                break;
        }
    }

    @E("Preencher o formulario, aba {string} e pressione Send")
    public void preencherOFormularioAbaEPressioneSend(String aba) {
        if ("Send Quote".equals(aba)) {
            Utils.screenshot(nomeCenario, "Inicio_do_preenchimento");
            SendQuotePages.setEmail("meu.email@site.com.br");
            SendQuotePages.setUsername("meu.email");
            SendQuotePages.setPassword("M1nhas");
            SendQuotePages.setConfirmPassword("M1nhas");
            Utils.screenshot(nomeCenario, "Tela_com_formulario_preenchido");
            SendQuotePages.clicaBtnSend();
        } else {
            System.out.println("Aba " + aba + " de formulario nao emcontrado");
        }
    }

    @Entao("Verificar a mensagem {string} na tela")
    public void verificarAMensagemNaTela(String mensagem) {
        Assert.assertTrue(SendQuotePages.textoMensagemFinal(mensagem));
        System.out.println("Mensagem: ".concat(mensagem).concat(" Validado com Sucesso"));
        Utils.screenshot(nomeCenario, "Tela_com_mensagem_validada");
    }



}