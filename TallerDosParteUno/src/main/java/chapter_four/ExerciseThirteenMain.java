package chapter_four;

import java.util.Scanner;

public class ExerciseThirteenMain {
    public static final Scanner scannerExercise = new Scanner(System.in);

    public static void main(String[] args) {
        int totalPurchaseValue, valueToPay;
        String ballColor;

        System.out.println("Ingrese el valor de la compra:");
        totalPurchaseValue = scannerExercise.nextInt();
        System.out.println("Ingrese el color de la bola:");
        ballColor = scannerExercise.next();

        switch (ballColor){
            case "BLANCO":
                valueToPay = totalPurchaseValue;
                System.out.println("El cliente debe pagar:$ " + valueToPay);
                break;
            case "VERDE":
                valueToPay = totalPurchaseValue - (int)(0.1*totalPurchaseValue);
                System.out.println("El cliente debe pagar:$ " + valueToPay);
                break;
            case "AMARILLO":
                valueToPay = totalPurchaseValue - (int)(0.25*totalPurchaseValue);
                System.out.println("El cliente debe pagar:$ " + valueToPay);
                break;
            case "AZUL":
                valueToPay = totalPurchaseValue - (int)(0.50*totalPurchaseValue);
                System.out.println("El cliente debe pagar:$ " + valueToPay);
                break;
            case "ROJA":
                valueToPay = totalPurchaseValue - (totalPurchaseValue);
                System.out.println("El cliente debe pagar:$ " + valueToPay);
                break;
            default:
                System.out.println("Opcion desconocida, intente otra");
                break;
        }


    }
}
