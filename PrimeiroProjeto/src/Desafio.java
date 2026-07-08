
import java.util.Scanner;

public class Desafio {

    static void main(String[] args) {
        String nome = "Vinicius";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do Conta: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Fazer PIx
                3 - Receber valor
                4 - sair
                """;

        Scanner ler = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

        }

    }
}
