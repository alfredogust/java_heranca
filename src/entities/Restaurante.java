package entities;

import java.util.Scanner;

public class Restaurante extends Empresa {
    /*Use a classe Empresa como base para criar a classe Restaurante. Inclua o tipo de comida, o preço médio de um prato
    , duas funções construtoras, a interface de entrada de dados, InsertData(), e a função que imprima os dados, Print().
    Construa um programa para testar a classe Restaurante. */
    private String comida;
    private  double precoMedioPrato;

    public Restaurante () {
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, String comida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.comida = comida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPrecoMedioPrato() {
        return precoMedioPrato;
    }

    public void setPrecoMedioPrato(double precoMedioPrato) {
        this.precoMedioPrato = precoMedioPrato;
    }

    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados do restaurante:");
        System.out.print("Nome: ");
        this.nome = sc.nextLine();
        System.out.print("Endereço: ");
        this.endereco = sc.nextLine();
        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.print("Estado: ");
        this.estado = sc.nextLine();
        System.out.print("CEP: ");
        this.cep = sc.nextLine();
        System.out.print("Telefone: ");
        this.fone = sc.nextLine();
        System.out.print("Tipo de comida: ");
        this.comida = sc.nextLine();
        System.out.print("Preço médio por prato: ");
        this.precoMedioPrato = sc.nextDouble();
    }

    public void print() {
        System.out.println("Dados do restaurante:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
        System.out.println("Telefone: " + this.fone);
        System.out.println("Tipo de comida: " + this.comida);
        System.out.println("Preço médio por prato: " + this.precoMedioPrato);
    }
}
