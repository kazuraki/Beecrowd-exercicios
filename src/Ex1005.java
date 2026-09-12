package src;

import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();

        double media = (A * 3.5 + B * 7.5)/11;

        System.out.println("MEDIA = %.5f%n" + media);

        sc.close();
    }
}
