package src;

import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nFuncionario = sc.nextInt();
        int horas = sc.nextInt();
        double valor = sc.nextDouble();

        double total = (valor * horas);

        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", total);

        sc.close();

    }
}
