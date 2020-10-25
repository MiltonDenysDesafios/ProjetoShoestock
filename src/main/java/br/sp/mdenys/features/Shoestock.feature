#Author: milton denys
@tag
Feature: Shoestock

  @validar_produtos_carrinho
  Scenario: Validar os produtos incluídos no carrinho na tela de pagamento
    Given eu acesso a pagina principal
    And preencho o campo de busca
    And clico no icone de busca
    And clico no primeiro sapato da lista
    And seleciono o tamanho do sapato
    When clico no botao comprar
    Then valido se o produto escolhido esta correto
