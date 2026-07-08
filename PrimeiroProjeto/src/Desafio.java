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

            if (opcao == 1) {
                System.out.println("o Saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("QUal o valor que valor do Pix");
                double valor = ler.nextDouble();
                if (valor > saldo) {
                    System.out.println("Sem Saldo");
                } else {
                    saldo -= valor;
                    System.out.println("Pix Realizado com sucesso!");

                }
            } else if (opcao == 3) {
                System.out.println("Valor Recebido:");
                double valor = ler.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo atualizado com sucesso!");
            } else if (opcao != 4) {
                System.out.println("Opção Invalida1");
            }

        }

    }
}

//coisa para fazer, Nome da pessoa para quem quer fazer o pix e fazer um mine comprovante, extrato de tranferencia 