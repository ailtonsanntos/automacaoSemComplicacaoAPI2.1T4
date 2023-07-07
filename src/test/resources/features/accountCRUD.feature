#language:pt
  @CRUD
  Funcionalidade: Account CRUD

    @cadastroConta
    Cenario: Cadastro nova conta
      Dado que a página new account esteja sendo exibida
      Quando os campos de cadastro estiverem preenchidos com
      |username|chronosTon|
      |email   |chronosailton@email.com.br|
      |password|Senha123                  |
      |country |Brazil                    |
      Então deve ser possivel logar no sistema apos o cadastro



    @loginCRUD
    Cenario: Realizar login crud
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        | login    | chronosTon    |
        | password | Senha123 |
        | remember | false |
      Quando for realizado o clique no botao sign in
      Entao deve ser possivel logar no sistema

    @alterarCRUD
    Cenario: Realizar a alteracao do crud
      Dado que esteja logado no sistema com
      | login| chronosTon |
      | password | Senha123 |
      | remember | false |
      Dado que esteja na pagina de alteracao de conta
      Quando altero os valores dos seguintes campos
      | firstName | ChronosTon |
      | lastName  | Teste   |
      Quando for realizado o clique em salvar
      Entao a alteracao foi exibida na pagina myAccount

      @exclusaoCRUD
      Cenario: Deletar usuario
        Dado que esteja logado no sistema com
          | login| chronosTon |
          | password | Senha123 |
          | remember | false |
        Dado que esteja na pagina myAccount
        Quando for efetuado a acao do clique delete e em yes
        Entao o usuario deve ser deletado
