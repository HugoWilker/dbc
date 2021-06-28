package br.com.udemy.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarEmail {
	
 private Email email;
 private Cadastro cadastro;




	
	@Dado("^que eu não possua email cadastrado$")
	public void que_eu_não_possua_email_cadastrado() throws Throwable {
	    throw new PendingException();
	    Email email = new Email();
	email.setEmail(dadosEmail);
	  email.getEmail();
	  
	   
	}

	@Quando("^Eu inserir minhas informações$")
	public void eu_inserir_minhas_informações() throws Throwable {
	    throw new PendingException();
	    Cadastro cadastro = new Cadastro();
	 
	    cadastro.nome;
	    cadastro.email;
	    
	}

	@Então("^uma mensagem de email cadastrado com sucesso será exibida$")
	public void uma_mensagem_de_email_cadastrado_com_sucesso_será_exibida() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    
	    cadastro.getEmail();
	}

}
