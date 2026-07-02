import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double meidaAvaliacao = 0;
        double nota =0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação do filme: ");
            nota=leitura.nextDouble();
            meidaAvaliacao +=nota;

        }
    System.out.println("Media de avaliações" + meidaAvaliacao/3);
    }
}