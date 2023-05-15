package entities;

import java.util.Scanner;

public class Veiculo extends Motor{
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        super();
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        super.insert(); // chama a função InsertData da classe Motor
        System.out.print("Peso em quilos: ");
        this.peso = sc.nextInt();
        System.out.print("Velocidade máxima em Km/h: ");
        this.velocMax = sc.nextInt();
        System.out.print("Preço em R$: ");
        this.preco = sc.nextFloat();
    }

    public void print() {
        super.print(); // chama a função Print da classe Motor
        System.out.println("Peso em quilos: " + this.peso);
        System.out.println("Velocidade máxima em Km/h: " + this.velocMax);
        System.out.println("Preço em R$: " + this.preco);
    }
}
