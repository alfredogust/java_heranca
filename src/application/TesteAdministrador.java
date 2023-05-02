package application;

import entities.Administrador;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Claudemiro", "Rua Burro, 1156", "99999999999", 55, 3500.0, 15.0, 250.0);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do setor: " + administrador.getCodSetor());
        System.out.println("Salário base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto());
        System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário líquido: " + administrador.calcularSalario());
    }
}
