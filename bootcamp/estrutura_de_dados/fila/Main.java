package edu.lucas.um.bootcamp.estrutura_de_dados.fila;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();
        Fila<Integer> minhaFila1 = new Fila<>();

        minhaFila1.enqueue(1);
        minhaFila1.enqueue(2);

        System.out.println(minhaFila1);
        System.out.println(minhaFila1.first());
        System.out.println(minhaFila1);

        minhaFila1.enqueue(5);
        System.out.println(minhaFila1);

        System.out.println(minhaFila1.dequeue());
        System.out.println(minhaFila1);

        System.out.println("\n----------------\n");

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
