package edu.lucas.um.bootcamp.estrutura_de_dados.lista_duplamente_encadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDuplamente = new ListaDuplamenteEncadeada<>();

        minhaListaDuplamente.add("c1");
        minhaListaDuplamente.add("c2");
        minhaListaDuplamente.add("c3");
        minhaListaDuplamente.add("c4");
        minhaListaDuplamente.add("c5");
        minhaListaDuplamente.add("c6");
        minhaListaDuplamente.add("c7");

        System.out.println(minhaListaDuplamente);

        System.out.println("\n----------------\n");

        minhaListaDuplamente.remove(3);
        minhaListaDuplamente.add(3,"99");
        System.out.println(minhaListaDuplamente);
        System.out.println(minhaListaDuplamente.get(3));

    }
}
