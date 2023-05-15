package application;

import entities.Restaurante;

public class ProgramaRestaurante {
    public static void main(String[] args) {
        Restaurante restaurante1 = new Restaurante("Restaurante A", "Rua X, 123", "São Paulo", "SP", "01234-567", "(11) 99999-9999", "Pizza", 25.0);
        restaurante1.print();

        Restaurante restaurante2 = new Restaurante();
        restaurante2.insert();
        restaurante2.print();
    }
}
