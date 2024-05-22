//Vitor lessa anacleto 2-54


programa {
  funcao inicio() {
   
    real telefone, cpf, salario, ano , idade
    cadeia nome, sobrenome, endereco
    caracter sexo, 

    escreva("Digite o seu nome: ")
    leia(nome)
    escreva("Digite o seu sobrenome: ")
    leia(sobrenome)
    escreva("Digite o seu sexo 'M' ou 'F': ")
    leia(sexo)
    escreva("Informe seu telefone:  ")
    leia(telefone)
    escreva("Informe seu cpf: ")
    leia(cpf)
    escreva("Informe seu salario: ")
    leia(salario)
    escreva("Informe seu endereço: ")
    leia(endereco)
    escreva("digite seu ano de nascimento: ")
    leia(ano)
    idade = 2024 - ano

    escreva ("\nNome: ",nome)
    escreva ("\nSobrenome: ",sobrenome)
    escreva ("\nSexo: ",sexo)
    escreva ("\nTelefone: ",telefone)
    escreva ("\nCPF: ",cpf)
    escreva ("\nSalario: ",salario)
    escreva ("\nEndereço: ",endereco)
    escreva("\nano De nascimento: ",ano," idade: ",idade)

  }
}