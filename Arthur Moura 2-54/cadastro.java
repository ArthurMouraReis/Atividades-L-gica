import java.util.Scanner;

public class cadastro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o seu sexo 'M' ou 'F': ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o seu CPF: ");
        String CPF= scanner.nextLine();

        System.out.print("Digite o seu endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o seu numero de telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o seu salario: ");
        Float salario = scanner.nextFloat();

        System.out.print("Digite o seu ano de nascimento: ");
        int ano = scanner.nextInt();

        int idade = 2024 - ano ;




        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: "+CPF);
        System.out.println("endereco: "+endereco);
        System.out.println("telefone: "+telefone);
        System.out.println("salario: "+salario);
        System.out.println("ano de nascimento: "+ano+" idade: "+idade);


        scanner.close();
    }
}