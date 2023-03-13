package edu.lucas.um.bootcamp.entendendo_metodos.exercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.printf("%.2f\n",calculadora.somar(25,36));
        System.out.printf("%.2f\n", calculadora.subtrair(25,36));
        System.out.printf("%.2f\n",calculadora.multiplicar(25,36));
        System.out.printf("%.2f\n",calculadora.dividir(25,36));
        System.out.printf("%.2f\n",calculadora.dividir(25,0));

        System.out.print("Digite a hora atual: ");
        //int hora = leitor.nextInt();

        System.out.print("Digite os minutos atuais: ");
        //int min = leitor.nextInt();

        //System.out.println(new Saudacao(hora,min).saudar());

        System.out.println("\n---------------\n");

        Emprestimo e1 = new Emprestimo(5);

        System.out.println(e1.calcular(5000,12));


    }
}
