package chapter_four;

import java.util.Scanner;

public class ExerciseFourteenMain {

    public static final Scanner scannerExercise = new Scanner(System.in);

    public static void main(String[] args) {
        int totalSalesDepartment1, totalSalesDepartment2, totalSalesDepartment3;
        int meanSalary, totalSales;
        int salaryDepartment1, salaryDepartment2, salaryDepartment3;

        System.out.println("Ingrese las ventas totales del departamento 1:");
        totalSalesDepartment1 = scannerExercise.nextInt();
        System.out.println("Ingrese las ventas totales del departament 2:");
        totalSalesDepartment2 = scannerExercise.nextInt();
        System.out.println("Ingrese las ventas totales del departament 3:");
        totalSalesDepartment3 = scannerExercise.nextInt();
        System.out.println("Ingrese el salario promedio de los vendedores:");
        meanSalary = scannerExercise.nextInt();
        totalSales = totalSalesDepartment1 + totalSalesDepartment2 + totalSalesDepartment3;

        salaryDepartment1 = calculateSalary(totalSales,totalSalesDepartment1, meanSalary );
        salaryDepartment2 = calculateSalary(totalSales,totalSalesDepartment2, meanSalary );
        salaryDepartment3 = calculateSalary(totalSales,totalSalesDepartment3, meanSalary );

        System.out.println("Salario vendedores departamento 1: " + salaryDepartment1);
        System.out.println("Salario vendedores departamento 2: " + salaryDepartment2);
        System.out.println("Salario vendedores departamento 3: " + salaryDepartment3);

    }

    public static int calculateSalary(int totalSales, int departmentSales, int basicSalary){
        if(departmentSales > (int)(0.33*totalSales)){
            return ((int)(basicSalary + 0.2*basicSalary));
        } else {
            return basicSalary;
        }
    }
}
