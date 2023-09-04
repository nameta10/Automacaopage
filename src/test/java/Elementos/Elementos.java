package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta.open > a");
	private By btnAbrasuacontaPICPAY = By.id("bt1");
	private By btnabrircomPicpay = By.cssSelector(
			"#__next > div > main > div.sc-lf7zbt-0.edxNUm > div > div.sc-rsc2zo-0.wAYGU > button > div > div");
	private By camponome = By.id("nome");
	private By campoCPF = By.id("CPF");
	private By campoEmail = By.id("E-mail");
	private By campoCelular = By.id("Celular");
	private By checkbox = By.id("terms");
	private By btnenviar = By.cssSelector("#radix-0 > div.sc-1xfxss8-0.gUOFli > button.sc-12j2mds-1.xkEwc > div > div");
	private By textobaixeapp = By
			.cssSelector("#radix-0 > div.sc-a6570t-0.izirIZ.sc-8gwwnp-0.fMIaEN > span.sc-1nn9vzw-0.QPfLm");
	

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnAbrasuacontaPICPAY() {
		return btnAbrasuacontaPICPAY;
	}

	public By getBtnabrircomPicpay() {
		return btnabrircomPicpay;
	}

	public By getCamponome() {
		return camponome;
	}

	public By getCampoCPF() {
		return campoCPF;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCelular() {
		return campoCelular;
	}

	public By getCheckbox() {
		return checkbox;
	}

	public By getTextobaixeapp() {
		return textobaixeapp;
	}

	public By getBtnenviar() {
		return btnenviar;
	}

	public void setBtnenviar(By btnenviar) {
		this.btnenviar = btnenviar;
	}
}
