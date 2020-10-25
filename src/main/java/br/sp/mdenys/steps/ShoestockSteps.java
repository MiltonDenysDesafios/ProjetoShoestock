package br.sp.mdenys.steps;

import br.sp.mdenys.core.DriverFactory;
import br.sp.mdenys.pages.ShoestockPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ShoestockSteps {

	@Given("eu acesso a pagina principal")
	public static void acessaPaginaPrincipal(DataTable data) {
		ShoestockPage.acessaPagina(data);
	}

	@And("preencho o campo de busca")
	public static void preencheCampoBUsca() {
		ShoestockPage.buscaProduto();
	}

	@And("clico no icone de busca")
	public static void clicaIconeBusca() {
		ShoestockPage.clicaIconeBuscar();

	}

	@And("clico no primeiro sapato da lista")
	public static void clicaPrimeiroSapato() {
		ShoestockPage.clicaPrimeiroSapato();

	}

	@And("seleciono o tamanho do sapato")
	public static void selecionarTamanhoSapato() {
		ShoestockPage.selecionaTamanhoSapato();

	}

	@And("clico no botao comprar")
	public static void clicaBotaoComprar() {
		ShoestockPage.clicaBotaoComprar();

	}

	@And("valido se o produto escolhido esta correto")
	public static void validarProdutoEscolhido() {
		ShoestockPage.validarProdutoCarrinho();

	}

	@And("finalizo a aplicacao")
	public static void finalizar() {
		DriverFactory.killDriver();

	}

}
