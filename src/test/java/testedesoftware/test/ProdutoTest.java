package testedesoftware.test;

import testedesoftware.pageObject.ProdutoPO;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoTest extends BaseTest {
	
	private static ProdutoPO produtoPage;
	
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	

	
	@Test
	public void  TC006_naoDeveCadastrarNoSistemaComDataVazio() {
		produtoPage.executarAcaoDeCadastrar("1","produto1","3","40");
		
		String mensagem = produtoPage.obterMensagem();
		
		assertEquals(mensagem,"Todos os campos são obrigatórios para o cadastro!");
			
		
	}
	


}
