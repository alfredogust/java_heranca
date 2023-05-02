package application;

import entities.Animal;
import entities.Cachorro;
import entities.Peixe;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tigre", 650);
        Animal animal2 = new Animal("Camelo", 600);

        System.out.println("Nome do animal 1: " + animal1.getNome());
        System.out.println("Peso do animal 1: " + animal1.getPeso() + " kg");
        //System.out.println(animal1.toString());

        System.out.println("Nome do animal 2: " + animal2.getNome());
        System.out.println("Peso do animal 2: " + animal2.getPeso() + " kg");
        //System.out.println(animal2.toString());

        animal1.setNome("Elefante");
        animal1.setPeso(1000);
        System.out.println();

        Cachorro cachorro1 = new Cachorro("Rex", 10.5, "Pastor Alemão");
        Cachorro cachorro2 = new Cachorro("Totó", 5.2, "Vira-lata");

        System.out.println(cachorro1);
        System.out.println(cachorro2);
        System.out.println();

        Peixe peixe = new Peixe("Tubarão Branco", 1500.0, "Oceano");

        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Peso: " + peixe.getPeso());
        System.out.println("Tipo de Habitat: " + peixe.getTipoHabitat());
        //System.out.println(peixe.toString());

        System.out.println("Nome do animal 1 modificado: " + animal1.getNome());
        System.out.println("Peso do animal 1 modificado: " + animal1.getPeso() + " kg");
        //System.out.println(animal1.toString());
    }
}
