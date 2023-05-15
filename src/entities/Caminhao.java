package entities;

import java.util.Scanner;

public class Caminhao extends Veiculo {
    /*Crie uma classe Caminhao derivada das classes Motor e Veiculo. Inclua Toneladas (carga máxima), AlturaMax (int) e
    Comprimento (int). Inclua um construtor sem argumentos que inicialize os dados com zeros e um que inicialize com os
    valores recebidos como argumento.Acrescente duas funções, uma para a entrada de dados, InsertData(), e uma que imprima os dados,
     Print().*/

    private double toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao () {

    }
    public Caminhao(int numCilindro, int potencia, int peso, int velocMax, float preco, double toneladas, int alturaMax, int comprimento) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados do caminhão:");
        super.insert();
        System.out.print("Toneladas: ");
        this.toneladas = sc.nextDouble();
        System.out.print("Altura máxima: ");
        this.alturaMax = sc.nextInt();
        System.out.print("Comprimento: ");
        this.comprimento = sc.nextInt();
    }

    public void print() {
        System.out.println("Dados do caminhão:");
        super.print();
        System.out.println("Toneladas: " + this.toneladas);
        System.out.println("Altura máxima: " + this.alturaMax);
        System.out.println("Comprimento: " + this.comprimento);
    }
}
