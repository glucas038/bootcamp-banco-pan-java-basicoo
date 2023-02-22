package edu.lucas.um.bootcamp.repeticao_array.exercicios_repeticao;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.print("Nome: ");
            nome = leia.next();
            if(nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = leia.nextInt();

        }

        System.out.println("Pulou para aqui, FIM");
    }

}
