package chapter_four;

import java.util.Scanner;

public class ExerciseTwentyTwoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del empleado: ");
        String nombre= sc.nextLine();
        System.out.println("salirio por hora: ");
        double valor_hora= sc.nextDouble();
        System.out.println("horas trabajadas: ");
        double horas= sc.nextDouble();
        double salario=valor_hora*horas;
        if (salario>450000){
            System.out.printf("Nombre: "+nombre);
            System.out.println(" ");
            System.out.println("salario mensual: "+salario);
        }

    }
}
