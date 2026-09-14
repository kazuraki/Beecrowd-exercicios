package src;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();

        double consumo = distancia/combustivel;

        System.out.printf(Locale.US, "%.3f km/l%n", consumo);

        sc.close();
    }
}
