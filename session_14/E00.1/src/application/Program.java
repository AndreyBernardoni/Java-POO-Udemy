package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char conf = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (conf == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("Payment data: ");
        for (Employee e : employees){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}