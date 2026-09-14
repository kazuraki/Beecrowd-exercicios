package src;

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int qntP1 = sc.nextInt();
        double valorP1 = sc.nextDouble();

        int peca2 = sc.nextInt();
        int qntP2 = sc.nextInt();
        double valorP2 = sc.nextDouble();

        double total = (qntP1 * valorP1 ) + (qntP2 * valorP2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , total);
        sc.close();

    }
}
