package testedesoftware.pageObject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {
	
	
	@FindBy(id ="btn-adicionar")
	public WebElement buttonCriar;
	
	@FindBy(id ="codigo")
	public WebElement inputCodigo;
	
	@FindBy(id ="nome")
	public WebElement inputNome;
	
	@FindBy(id ="quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id ="valor")
	public WebElement inputValor;
	
	
	@FindBy(css = "button.close")
	public WebElement buttonSair;
	
	@FindBy(id ="btn-salvar")
	public WebElement buttonSalvar;
	
	
	
	@FindBy(css="div.modal-content span#mensagem")
	public WebElement spanMensagem;
	
	@FindBy(css="div.modal-content h4.modal-title")
	public WebElement nomeModal;
	
	@FindBy(xpath = "//th[text()='Quantidade']")
	public WebElement nomeQuantidade;
	
	

	public ProdutoPO(WebDriver driver) {
		super(driver);
	}
	
	public String obterMensagem() {
		return this.spanMensagem.getText();
		
	}
	
	public String obterNomeModal() {
		return this.nomeModal.getText();
		
	}
	
	public String obterNomePaginaPrincipal() {
		return this.nomeQuantidade.getText();
		
	}
	
	public void executarAcaoDeCadastrar(String codigo, String nome,String quantidade, String valor) {
		buttonCriar.click();
		buttonCriar.click();
		escrever(inputCodigo,codigo);
		escrever(inputNome,nome);
		escrever(inputQuantidade,quantidade);
		escrever(inputValor,valor);
		buttonSalvar.click();
	}
	
	
	private void escrever(WebElement input, String texto) {
		input.clear();
		input.sendKeys(texto + Keys.TAB);
		
	}
	
	public void executarAcaoDeAbrirModal() {
		buttonCriar.click();
		buttonCriar.click();
	
	}
	
	
	public void executarAcaoDeFecharModal() {
		buttonCriar.click();
		buttonCriar.click();
		buttonSair.click();
		
	
	}
	
}
