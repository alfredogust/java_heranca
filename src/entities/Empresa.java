package entities;

import java.util.Scanner;

public class Empresa {
    /*Crie uma classe chamada Empresa capaz de armazenar os dados de uma empresa (Nome, Endereço, Cidade, Estado, CEP e Fone).
      Inclua um construtor sem argumentos e um que receba os dados como argumentos e os inicialize.
      Escreva duas funções, uma para fazer a interface com o usuário da entrada de dados, Insert(), e outra para imprimir os dados, Print(). */

    public String nome;
    public String endereco;
    public String cidade;
    public String estado;
    public String cep;
    public String fone;

    public Empresa() {

    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void Insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados da empresa: ");
        System.out.print("Nome: ");
        this.nome = sc.nextLine();
        System.out.print("Endereco: ");
        this.endereco = sc.nextLine();
        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.print("Estado: ");
        this.estado = sc.nextLine();
        System.out.print("CEP: ");
        this.cep = sc.nextLine();
        System.out.print("Telefone: ");
        this.fone = sc.nextLine();
    }

    public void Print() {
        System.out.println("Dados da empresa:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
        System.out.println("Telefone: " + this.fone);
    }

}
