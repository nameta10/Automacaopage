package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
		m.executarNavegador(url, "Abrindo Navegador");
		
	    
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
		m.pausa(3000, "pausa para carregar o botao abrir conta");
		m.Click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");
	    
	}

	@Given("^selecionar o botao abra sua conta no PICPAY$")
	public void selecionar_o_botao_abra_sua_conta_no_PICPAY() throws Throwable {
		m.Click(e.getBtnAbrasuacontaPICPAY(), "Selecionando o botão de abrir conta no PICPAY");
	   
	}

	@Given("^selecionar o botao Abrir conta no PicPay$")
	public void selecionar_o_botao_Abrir_conta_no_PicPay() throws Throwable {
		m.Click(e.getBtnabrircomPicpay(), "clicando novamente em abrir conta com o PicPay");
	   
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
		m.preencher(e.getCamponome(), "Cláudio Iago Miguel Nogueira", "Preenchendo o campo nome");
		m.preencher(e.getCampoCPF(),"65842395789" , "Preenchendo o campo CPF");
		m.preencher(e.getCampoEmail(),"claudioiagonogueira@disparco.com.br" , "Preenchendo o campo Email");
		m.preencher(e.getCampoCelular(), "21981247151", "Preenchendo o campo Celular");
	}

	@When("^selecionar o checkbox$")
	public void selecionar_o_checkbox() throws Throwable {
		m.Click(e.getCheckbox(), "Selecionando Checkbox");
	   
	}

	@When("^selecionar o botao envir$")
	public void selecionar_o_botao_envir() throws Throwable {
		m.Click(e.getBtnenviar(), "Selecionando botão enviar");
	   
	}

	@Then("^valido o texto Baixe o app e finalize seu cadastro$")
	public void valido_o_texto_Baixe_o_app_e_finalize_seu_cadastro() throws Throwable {
	   
	}



}