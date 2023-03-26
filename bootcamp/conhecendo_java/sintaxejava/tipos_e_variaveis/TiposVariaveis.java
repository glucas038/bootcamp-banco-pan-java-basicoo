package edu.lucas.um.bootcamp.sintaxejava.tipos_e_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // estudar tipos primitivos
        // estudar a classe String que representa texto na aplicação

        System.out.println("Hello");

        final int NAO_PODE_MUDAR = 10;
        final String CONSTANTE = "Deve ser expresso em letra maiuscula diferente da variavel";
        final float PI = 3.14F;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto1 = (short) numeroNormal;

        System.out.println(numeroCurto1);
    }
}
