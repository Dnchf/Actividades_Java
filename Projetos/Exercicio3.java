import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da bolsa: ");
        double bolsa = entrada.nextDouble();

        System.out.print("Digite o tempo de estágio (em anos): ");
        double tempo = entrada.nextDouble();

        if (bolsa >= 750 && bolsa <= 950 && tempo >= 2) {
            System.out.println("Participará do treinamento");
        } else {
            System.out.println("Não participará");
        }

        entrada.close();
    }
}
