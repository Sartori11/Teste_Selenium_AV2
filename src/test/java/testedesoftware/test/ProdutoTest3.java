package testedesoftware.test;

import testedesoftware.pageObject.ProdutoPO;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoTest3 extends BaseTest {
	
	private static ProdutoPO produtoPage;
	
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	

	
	@Test
	public void  TC004_fecharModal() {
		produtoPage.executarAcaoDeFecharModal();
		
		String mensagem = produtoPage.obterNomePaginaPrincipal();
		
		assertEquals(mensagem,"Quantidade");
			
		
	}
	
	
	
	
	
	


}
