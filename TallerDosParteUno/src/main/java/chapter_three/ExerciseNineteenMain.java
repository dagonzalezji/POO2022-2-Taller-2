package chapter_three;

import java.util.Scanner;

public class ExerciseNineteenMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor del lado: ");
        double lado= sc.nextDouble();
        double perimetro= lado*3;
        double altura= Math.sqrt(3*lado)/2;
        double area= Math.sqrt(3)/4*Math.pow(lado,2);

        System.out.println("Perimetro: "+perimetro);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+area);
    }
}
