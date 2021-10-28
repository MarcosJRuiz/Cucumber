package br.com.marcos.ruiz.desafio.tecnico.utils;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Classe que contem os metodos de interação com o Navegador
 * 
 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
 */
public class Browser {
	private static final WebDriver driver = DriverFactory.getDriverBrowser();
	private static final WebDriverWait wait = new WebDriverWait(driver, 30);

	/**
	 * Inseir o tempo de expera em segundos.
	 * 
	 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void aguardar(int segundos) {
		try {
			Thread.sleep(segundos * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Limpa o seletor.
	 * 
	 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void limpar(By seletor) {
		wait.until(ExpectedConditions.elementToBeClickable(seletor)).clear();
	}

	/**
	 * Digita o valor informado no seletor indicado.
	 * 
	 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void digitar(By seletor, String valor) {
		limpar(seletor);
		wait.until(ExpectedConditions.elementToBeClickable(seletor)).sendKeys(valor);
		System.out.println("Digitado valor ".concat(valor).concat(" no campo ").concat(seletor.toString()));
	}
	/**
	 * Clica no elemento indicado.
	 * 
	 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void clicar(By seletor) {
		wait.until(ExpectedConditions.elementToBeClickable(seletor)).click();
		System.out.println("realizado click no elemento: ".concat(seletor.toString()));
	}

	/**
	 * Seleciona a opção no seletor por Texto
	 *@author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void selectText(By seletor, String texto) {
		validaElementoNaTela(seletor);
		Select combo = new Select(driver.findElement(seletor));
		combo.selectByVisibleText(texto);
		System.out.println("Selecionado o texto: ".concat(texto).concat(" no combo ").concat(seletor.toString()));
	}

	/**
	 * Valida se elemento esta visivel na tela. Caso não elemento não conter na tela é lancada uma exeção
	 * 
	 *  @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void validaElementoNaTela(By seletor) {
		wait.until(ExpectedConditions.presenceOfElementLocated(seletor));
	}

	/**
	 * Aguardar até 30 segundos para conter o elemento na tela.
	 *
	 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 */
	public static void aguardarElementoExistir(By seletor) {
		aguardar(1);
		for (int i = 0; i < 9; i++) {
			if (elementoExiste(seletor)){
				aguardar(2);
				return; }
			System.out.printf("Aguardando existencia na tela do elemento %s - %d%n ", seletor, i);
		}
	}

	/**
	 * Valida se o Elemento existe.
	 *
	 * @author <a href="mailto:marcosruiz.jt@gmail.com">Marcos Ruiz</a>
	 *
	 * @return booleano
	 */
	public static boolean elementoExiste(By seletor) {
		return driver.findElements(seletor).size() > 0;
	}

}
