package application;

import entities.Empresa;

public class ProgramaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.Insert();
        empresa.Print();

        Empresa empresa2 = new Empresa("UCB.", "123 Tagua St", "Brasilia", "DF", "12345", "(123) 456-7890");
        empresa2.Print();
    }
}
