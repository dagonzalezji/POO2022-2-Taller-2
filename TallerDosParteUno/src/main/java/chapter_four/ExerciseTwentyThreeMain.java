package chapter_four;

import java.util.Scanner;

public class ExerciseTwentyThreeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de A");
        double a = sc.nextDouble();
        System.out.println("Valor de B");
        double b = sc.nextDouble();
        System.out.println("Valor de C");
        double c = sc.nextDouble();
        if (a !=0){
            double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/2*a;
            double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/2*a;
            System.out.println("solucion 1: "+x1);
            System.out.println("solucion 2: "+x2);
        }
        else {
            System.out.println("la unica solucion es: "+(-c/b));
        }
    }
}
