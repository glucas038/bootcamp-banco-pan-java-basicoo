package edu.lucas.um.bootcamp.sintaxejava.operadores;

public class Operadores {

    public static void main(String[] args) {
        //ternario

        int a = 5;
        int b = 3;
        int c = 4;
        boolean simNao;
        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        String nome = "Lucas";
        String sobrenome = new String("Lucas");

        System.out.println(nome.equals(sobrenome) ? "Verdade" : "Falso");

        if (a == b || nome.equals(sobrenome))
            System.out.println("Algo é verdadeiro");

        a = 3;

        if (a == b && c > a && nome.equals(sobrenome))
            System.out.println("São iguais e C maior que A");

    }

}
