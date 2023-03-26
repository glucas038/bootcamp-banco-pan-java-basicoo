package edu.lucas.um.bootcamp.estrutura_de_dados.listas_encadeadas;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEndeada = new ListaEncadeada<>();

        minhaListaEndeada.add("teste1");
        minhaListaEndeada.add("teste2");
        minhaListaEndeada.add("teste3");
        minhaListaEndeada.add("teste4");

        System.out.println(minhaListaEndeada.get(0));
        System.out.println(minhaListaEndeada.get(1));
        System.out.println(minhaListaEndeada.get(2));
        System.out.println(minhaListaEndeada.get(3));

        System.out.println(minhaListaEndeada);

        System.out.println(minhaListaEndeada.remocve(3));

        System.out.println(minhaListaEndeada);

    }
}
