package chapter_four;

import java.util.HashMap;
import java.util.Scanner;

public class ExerciseFifteenMain {
    public static final Scanner scannerExercise = new Scanner(System.in);

    public static void main(String[] args) {
        int weightBallA, weightBallB, weightBallC, weightBallD;
        System.out.println("Ingrese el peso de la esfera A:");
        weightBallA = scannerExercise.nextInt();
        System.out.println("Ingrese el peso de la esfera B:");
        weightBallB = scannerExercise.nextInt();
        System.out.println("Ingrese el peso de la esfera C:");
        weightBallC = scannerExercise.nextInt();
        System.out.println("Ingrese el peso de la esfera D:");
        weightBallD = scannerExercise.nextInt();

        if((weightBallA == weightBallB) && (weightBallA==weightBallC)){
            System.out.println("La esfera D es la diferente");
            if(weightBallD > weightBallA){
                System.out.println("Y es la de mayor peso");
            } else {
                System.out.println("Y es la de menor peso");
            }
        } else if((weightBallA == weightBallB) && (weightBallA==weightBallD)){
            System.out.println("La esfera C es la diferente");
            if(weightBallC > weightBallA){
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else if((weightBallA == weightBallC) && (weightBallA==weightBallD)){
            System.out.println("La esfera B es la diferente");
            if(weightBallB > weightBallA){
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else {
            System.out.println("La esfera A es la diferente");
            if(weightBallA > weightBallB){
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        }
    }
}
