package entities;

public class ProdutoFisico extends Produto{
    private double peso;
    private String dimensoes;

    public ProdutoFisico(int codigo, String nome, double preco, double peso, String dimensoes) {
        super(codigo, nome, preco);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "peso=" + peso +
                ", dimensoes='" + dimensoes + '\'' +
                '}';
    }
}
