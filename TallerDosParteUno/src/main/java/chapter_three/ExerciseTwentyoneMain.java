package chapter_three;

import java.util.Scanner;

public class ExerciseTwentyoneMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor del lado 1: ");
        double l1 = sc.nextDouble();
        System.out.println("Digite el valor del lado 2: ");
        double l2 = sc.nextDouble();
        System.out.println("Digite el valor del lado 3: ");
        double l3 = sc.nextDouble();

        double peri = l1 + l2 + l3;

        double semiperi = peri / 2;

        double are;

        if (l1 == l2 && l1 == l3) {
            are = Math.sqrt(3) / 4 * Math.pow(l1, 2);
        } else if (l1 != l2 && l1 != l3) {
            are = (l2 * l3) / 2;
        } else {
            are = (l2 * Math.sqrt(Math.pow(3, 2) - (Math.pow(2, 2) / 4))) / 2;


        }
        System.out.println("El perimetro es: "+ peri);
        System.out.println("el semiperimetro es: "+ semiperi);
        System.out.println("el area es "+ are);
    }
}
