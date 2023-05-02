package entities;

public class ProdutoEletronico extends ProdutoFisico{

    private int tensao;
    private double potencia;
    private String marca;

    public ProdutoEletronico(int codigo, String nome, double preco, double peso, String dimensoes, int tensao, double potencia, String marca) {
        super(codigo, nome, preco, peso, dimensoes);
        this.tensao = tensao;
        this.potencia = potencia;
        this.marca = marca;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "tensao=" + tensao +
                ", potencia=" + potencia +
                ", marca='" + marca + '\'' +
                '}';
    }
}
