import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cadastromagaiver {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Cadastro de Pessoas:");
System.out.println("Digite o nome:");
String nome = s.nextLine();
System.out.println("Digite o sobrenome:");
String sobrenome = s.nextLine();
System.out.println("Digite o sexo:");
String sexo = s.nextLine();

salvarCadastro(nome, sobrenome, sexo);

System.out.println("Cadastro salvo com sucesso!");
}

public static void salvarCadastro(String nome, String sobrenome, String sexo) {

    try {
        FileWriter fileWriter = new FileWriter("cadastroDecliente.txt",true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Nome: " + nome);
        printWriter.println("Sobrenome: " + sobrenome);
        printWriter.println("Sexo: " + sexo);
        printWriter.println();
      
        printWriter.close();
    } catch (IOException e) {
        System.out.println("Erro ao salvar o cadastro: " + e.getMessage());
    }
}
}
