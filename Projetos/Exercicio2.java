import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o turno de trabalho (N para noturno, outro para diurno): ");
        char turno = entrada.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horas = entrada.nextDouble();

        double salario;
        if (turno == 'N') {
            salario = horas * 45.0;
        } else {
            salario = horas * 37.5;
        }

        System.out.printf("O salário é: R$ %.2f%n", salario);

        entrada.close();
    }
}
