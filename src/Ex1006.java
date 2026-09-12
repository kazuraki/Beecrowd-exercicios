package src;

import java.util.Scanner;

public class Ex1006 {
    public void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();
    }
}
