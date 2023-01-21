package testes;

import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import executa.Executa;
import metodos.Metodos;

public class Testes {
	
	Elementos elemento = new Elementos();
	Metodos metodo = new Metodos();

	
	@Before
	public void acessarSite() {
		Executa.abrirNavegador(true);

	}
	
	@Test
	public void Login() throws InterruptedException{
	    metodo.escrever(elemento.email,"valeriacarrion2015@hotmail.com");
		Thread.sleep(1000);
		metodo.escrever(elemento.senha,"C@rri2019");
		Thread.sleep(2000);
		metodo.clicar(elemento.btnEntrar);
		System.out.println("Teste executado com sucesso");
		
   
}
	@Test
	public void esqueciSenha() throws InterruptedException{
	metodo.clicar(elemento.btnesquecisenha);	
	Thread.sleep(2000);
	metodo.escrever(elemento.Email,"valeriacarrion2015@hotmail.com");
	Thread.sleep(1000);
	metodo.clicar(elemento.btnEnviar);
	
	System.out.println("Teste executado com sucesso");
	
	
	
	
	
	
}
}