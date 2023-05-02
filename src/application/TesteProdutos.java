package application;

import entities.Produto;
import entities.ProdutoFisico;
import entities.ProdutoEletronico;
public class TesteProdutos {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Cadeira", 50.00);
        System.out.println(produto.toString());

        ProdutoFisico produtoFisico = new ProdutoFisico(2, "Mesa", 100.00, 10.0, "50x50x70");
        System.out.println(produtoFisico.toString());

        ProdutoEletronico eletronico = new ProdutoEletronico(3, "TV", 2000.00, 20.0, "100x70x10", 110, 100.0, "Sony");
        System.out.println(eletronico.toString());
    }
}
