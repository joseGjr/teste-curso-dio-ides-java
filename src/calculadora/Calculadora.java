package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("digitar primeiro valor");
        a = scan.nextInt();
        System.out.println("digitar segundo  valor");
        b = scan.nextInt();
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multplicar = multplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("somar" + somar);
        System.out.println("subtrair" + subtrair);
        System.out.println("multiplicar" + multplicar);
        System.out.println("dividir" + dividir);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
