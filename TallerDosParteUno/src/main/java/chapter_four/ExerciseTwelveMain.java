package chapter_four;

import java.util.Scanner;

public class ExerciseTwelveMain {
    public static final Scanner scannerExcerciseNumbers = new Scanner(System.in);
    public static final Scanner scannerExerciseNames = new Scanner(System.in).useDelimiter("\n");



    public static void main(String[] args) {
        String workerName;
        int totalWorkedHours, hourValue, extraHours, extraHourPlus8, salary;
        System.out.println("Ingrese el nombre del trabajador:");
        workerName = scannerExerciseNames.next();
        System.out.println("Ingrese el numero de horas trabajadas de la persona:");
        totalWorkedHours = scannerExcerciseNumbers.nextInt();
        System.out.println("Ingrese el valor por hora trabajada");
        hourValue = scannerExcerciseNumbers.nextInt();

        if (totalWorkedHours > 40){
            extraHours = totalWorkedHours - 40;
            if(extraHours > 8){
                extraHourPlus8 = extraHours - 8;
                salary = (40*hourValue) + (16*hourValue) + (extraHourPlus8*hourValue*3);
            } else {
                salary = (40*hourValue) + (2*extraHours*hourValue);
            }
        } else {
            salary = totalWorkedHours*hourValue;
        }

        System.out.println("El trabajador: " + workerName);
        System.out.println("Devengo: " + salary);


    }




}
