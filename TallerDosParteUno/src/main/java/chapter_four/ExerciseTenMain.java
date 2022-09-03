package chapter_four;

import java.util.Scanner;

public class ExerciseTenMain {
    /*
    definición de variables dadas por el enunciado:
    * inscriptionNumber = Número de inscripción
    * names = nombres
    * patrimony = Patrimonio
    * socialStratum = estrato social
    * tuitionFee = pago de matricula
    */
    private int  patrimony, tuitionFee;
    private String names, inscriptionNumber;
    private Short socialStratum;

    //variables para ingresar valores por teclado incluyendo lectura de espacios

    public static final Scanner scannerExcerciseNumbers = new Scanner(System.in);
    public static final Scanner scannerExerciseNames = new Scanner(System.in).useDelimiter("\n");

    // Constructor de la clase
    public ExerciseTenMain(String inscriptionNumber, int patrimony, String names, Short socialStratum) {
        this.inscriptionNumber = inscriptionNumber;
        this.patrimony = patrimony;
        this.names = names;
        this.socialStratum = socialStratum;
        this.tuitionFee = 50000;
    }

    //Getter de la clase
    public String getInscriptionNumber() {
        return inscriptionNumber;
    }

    public int getPatrimony() {
        return patrimony;
    }

    public String getNames() {
        return names;
    }

    public Short getSocialStratum() {
        return socialStratum;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    //Calculador de la matricula real
    public void calculateRealTuitionFee() {
        if ((getPatrimony() > 2000000) && (getSocialStratum() > 3)) {
            this.tuitionFee = this.tuitionFee + (int) (0.03 * this.patrimony);
        }
    }


    public static void main(String[] args) {
        int  patrimony;
        String names, inscriptionNumber;
        Short socialStratum;
        System.out.println("Ingrese el valor de el numero de inscripción:");
        inscriptionNumber = scannerExcerciseNumbers.next();
        System.out.println("Ingrese los nombres del estudiante:");
        names = scannerExerciseNames.next();
        System.out.println("Ingrese el patrimonio del estudiante:");
        patrimony = scannerExcerciseNumbers.nextInt();
        System.out.println("Ingrese el estrato socio-economico del estudiante:");
        socialStratum = scannerExcerciseNumbers.nextShort();

        ExerciseTenMain studentTuitionCalculator = new ExerciseTenMain(inscriptionNumber, patrimony, names, socialStratum);
        studentTuitionCalculator.calculateRealTuitionFee();

        System.out.println("El estudiante con numero de inscripcion: " + studentTuitionCalculator.getInscriptionNumber());
        System.out.println("Y nombre: " + studentTuitionCalculator.getNames());
        System.out.println("Debe pagar: " + studentTuitionCalculator.getTuitionFee());
    }
}
