package application;

import entities.Motor;

import java.util.Scanner;

public class ProgramaMotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motor motor1 = new Motor();
        System.out.println("Insira os dados do primeiro motor:");
        motor1.insert();
        System.out.println("Dados do primeiro motor:");
        motor1.print();

        System.out.println("\nInsira os dados do segundo motor:");
        System.out.print("Número de cilindros: ");
        int numCilindros = sc.nextInt();
        System.out.print("Potência: ");
        int potencia = sc.nextInt();
        Motor motor2 = new Motor(numCilindros, potencia);
        System.out.println("Dados do segundo motor:");
        motor2.print();
    }
}
