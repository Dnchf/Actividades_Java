import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("Valor correto");
        } else {
            System.out.println("Valor incorreto");
        }

        entrada.close();
    }
}
