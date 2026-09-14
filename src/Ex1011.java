package src;


import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        double total = (4.0/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", total);

    }
}
