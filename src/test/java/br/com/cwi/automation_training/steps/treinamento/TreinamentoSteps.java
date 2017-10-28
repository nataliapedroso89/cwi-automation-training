package br.com.cwi.automation_training.steps.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.cwi.automation_training.pages.Treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class TreinamentoSteps {	
	
	@Dado("que estou na homepage do site \"(.*)\"")
	public void acessarHomePage(String url) {
		TestRule.openApplicationChrome(url);
	}
	
	@E("pesquiso pelo produto \"(.*)\"")
	public void pesquisaProduto(String nomeProduto) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.buscarProduto(nomeProduto);
	}
	
	@E("clico no menu \"(.*)\"")
	public void Contato(String ContactUs) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.ClicaContato(ContactUs);
	}
		
	@E("preencho os \"(.*)\"")
	public void PreencheContato(String preencheContato) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.PreencheContato();
	}
	
	
	@Quando("clico no botao \"(.*)\"")
	public void SendMessage(String EnviaMensagem) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.SendMessage(EnviaMensagem);
	}
	
	@Entao("deve apresentar a mensagem \"(.*)\"")
	public void ConfirmaEnvio(String msg) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.ConfirmaEnvio(msg);
	}
	
	@E("clico para logar \"(.*)\"")
	public void Cadastro(String Singus) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.AbreCadastro(Singus);
	}
	
}
