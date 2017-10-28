package br.com.cwi.automation_training.pages.Treinamento;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap {

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	

	public void buscarProduto(String produto) {	
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo Produto: " + produto);
	}
	
	public void ClicaContato(String ContatoUs) {	
		botaoContato.click();
		logPrint("Abre pagina de contato");
	}
	
	public void PreencheContato() {	
		id_contact.sendKeys("Customer service");
		email.sendKeys("leirahs@gmail.com");
		message.sendKeys("Teste de mensagem para saber se funcionou");
		logPrint("Preencheu os campos obrigatorios");
	}
	
	public void SendMessage(String EnviaMensagem) {	
		sendMessage.click();
		logPrint("Grava Mensagem");
	}
	
	public void ConfirmaEnvio(String msg) {	
		confirmaMensagem.getText().equals(msg);
		logPrint("Confirma envio da Mensagem");
	}
	
	public void AbreCadastro(String Singus) {	
		botaoSingus.click();
		logPrint("Abre pagina de Cadastro");
	}
}