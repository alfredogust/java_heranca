package entities;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
    private String cor;
    private String modelo;

    public CarroPasseio() {
        super();
    }

    public CarroPasseio(int numCilindro, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        super.insert();
        System.out.print("Cor: ");
        this.cor = sc.nextLine();
        System.out.print("Modelo: ");
        this.modelo = sc.nextLine();
    }

    public void print() {
        super.print();
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
    }
}
