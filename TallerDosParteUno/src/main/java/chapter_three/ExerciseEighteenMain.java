package chapter_three;


import java.util.Scanner;
public class ExerciseEighteenMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el codigo del empleado");
        String codigo= sc.nextLine();
        System.out.println("Digite el nombre del empleado");
        String nombre= sc.nextLine();
        System.out.println("Digite el numero de horas trabajadas este mes");
        float horas = sc.nextFloat();
        System.out.println("Digite el valor de la hora trabajada");
        float horas_valor = sc.nextFloat();
        System.out.println("Digite el valor de la retencion");
        float retencion = sc.nextFloat();

        float salario_bruto=horas*horas_valor;
        float salario_neto=salario_bruto-(salario_bruto*(retencion/100));

        System.out.println("Codigo: "+codigo);
        System.out.println("Nombres: "+nombre);
        System.out.println("Su salario bruto es: "+salario_bruto);
        System.out.println("Su salario neto es: "+salario_neto);

    }
}
