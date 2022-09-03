package chapter_four;

import java.util.Scanner;

public class ExerciseTwentyFourMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Peso esfera A");
        double peso1= sc.nextDouble();
        System.out.println("Peso esfera B");
        double peso2= sc.nextDouble();
        System.out.println("Peso esfera C");
        double peso3= sc.nextDouble();

        if(peso1>peso2 && peso1>peso3){
            System.out.println("La esfera mas pesada es la A");
        } else if (peso2>peso1 && peso2>peso3) {
            System.out.println("La esfera mas pesada es la B");

        }else {
            System.out.println("La esfera mas pesasda es la C");
        }

    }
}
