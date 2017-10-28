#language: pt
#encoding: iso-8859-1
Funcionalidade: Compra

  @treinamento
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "http://automationpractice.com"
    E pesquiso pelo produto "Dress"
  ##  Quando clico no botão "Add to cart"
  ##  Entao deve apresentar a mensagem "Product successfully added to your shopping cart"
   
  @treinamentoContato
  Cenario: Testa Contato
    Dado que estou na homepage do site "http://automationpractice.com"
    E clico no menu "Contact us"
    E preencho os "campos"
    Quando clico no botao "Send"
    Entao deve apresentar a mensagem "Your message has been successfully sent to our team."
    
  @treinamentoCadastro
  Cenario: Testa Contato
    Dado que estou na homepage do site "http://automationpractice.com"
    E clico para logar "Sing us"
##    E preencho o "Email adress"
##    E clico no botao "Create an account"
##    E preencho os "campos obrigatorios"
##    Quando clico no botao "Register"
##    Entao deve apresentar a tela de "MY ACCOUNT"