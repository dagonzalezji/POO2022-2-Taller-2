package chapter_four;

import java.util.Scanner;

public class ExerciseSevenMain {
    private static int numberA;
    private static int numberB;
    public static final Scanner scannerExercise = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("++++++++++++Ingrese el numero A++++++++++");
        numberA = scannerExercise.nextInt();
        System.out.println("++++++++++++Ingrese el numero B++++++++++");
        numberB = scannerExercise.nextInt();

        if(numberA > numberB){
            System.out.println("A ES MAYOR QUE B");
        } else if (numberA == numberB){
            System.out.println("A ES IGUAL A B");
        } else {
            System.out.println("A ES MENOR QUE B");
        }

    }
}
