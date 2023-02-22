package edu.lucas.um.bootcamp.logica_condicional.controle_de_fluxo;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeMinimaDirecao = 18;
        String podeOuNao = "";

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade >= idadeMinimaDirecao)
            podeOuNao = "Pode dirigir ";
        else
            podeOuNao = "Não pode dirigir ";

        System.out.println(podeOuNao + "pelo If.");

        podeOuNao = idade>=idadeMinimaDirecao ? "Pode dirigir " : "Não pode dirigir ";
        System.out.println(podeOuNao + "pelo operador ternario.");

        System.out.println("Escolha um numero de 0 a 3: ");
        int menu = scanner.nextInt();
        String escolha = "";
        switch (menu){
            case 0:
                escolha = "Escolheu a opção 0";
            break;

            case 1:
                escolha = "Escolheu a opção 1";
            break;

            case 2:
                escolha = "Escolheu a opção 2";
            break;

            case 3:
                escolha = "Escolheu a opção 3";
            break;

            default:
                escolha = "Numero incorreto";
            break;
        }

        System.out.println(escolha);
    }
}
