
@tag
Feature: Abertura de conta
  

  @tag1
  Scenario: Fluxo do formulario de abertura de conta pessoa Fisica
  Given que o usuario acesse a url "https://www.original.com.br/"
  And selecione o botao abrir nova conta
  And selecionar o botao abra sua conta no PICPAY
  And selecionar o botao Abrir conta no PicPay
  When o usuario preencher o formulario
  And selecionar o checkbox
  And selecionar o botao envir
  Then valido o texto Baixe o app e finalize seu cadastro