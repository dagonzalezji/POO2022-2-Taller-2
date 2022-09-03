package chapter_four;

import java.util.Scanner;

public class ExerciseElevenMain {
    public static final Scanner scannerExercise = new Scanner(System.in);
    public static int mayor;



    public static void main(String[] args) {
        System.out.println("Ingrese el numero 1");
        int number1 = scannerExercise.nextInt();
        mayor = number1;
        System.out.println("Ingrese el numero 2");
        int number2 = scannerExercise.nextInt();
        if(number2 > mayor){
            mayor = number2;
        }
        System.out.println("Ingrese el numero 3");
        int number3 = scannerExercise.nextInt();
        if(number3 > mayor){
            mayor = number3;
        }
        System.out.println("El mayor entre: " + number1 + ", " +  number2 + ", " + number3 + ", es: " + mayor);

    }
}
