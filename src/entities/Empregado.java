package entities;

public class Empregado extends Pessoa{
    private int codSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codSetor = codSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }
}
