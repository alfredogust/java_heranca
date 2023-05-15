package entities;

import java.util.Scanner;

public class Motor {
    public int numCilindro;
    public int potencia;

    public Motor () {

    }

    public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }

    public int getNumCilindro() {
        return numCilindro;
    }

    public void setNumCilindro(int numCilindro) {
        this.numCilindro = numCilindro;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados do motor:");
        System.out.print("Número de cilindros: ");
        this.numCilindro = sc.nextInt();
        System.out.print("Potência: ");
        this.potencia = sc.nextInt();
    }

    public void print() {
        System.out.println("Dados do motor:");
        System.out.println("Número de cilindros: " + this.numCilindro);
        System.out.println("Potência: " + this.potencia);
    }
}
