package application;

import entities.Operario;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("João", "Rua 1", "123456", 1, 2000.0, 10.0, 5000.0, 5.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do setor: " + operario.getCodSetor());
        System.out.println("Salário base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário: " + operario.calcularSalario());
    }
}
