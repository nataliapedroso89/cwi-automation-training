package br.com.cwi.automation_training.pages.Treinamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {

		protected WebElement search_query_top;
		protected WebElement id_contact;
		protected WebElement email;
		protected WebElement message;
		protected Webelement email_create;
		
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	protected WebElement botaoContato;
    
	@FindBy(xpath="//*[@id=\"submitMessage\"]/span")
	protected WebElement sendMessage;
		
	@FindBy(xpath="//*[@id=\"center_column\"]/p")
	protected WebElement confirmaMensagem;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	protected WebElement botaoSingus;
}