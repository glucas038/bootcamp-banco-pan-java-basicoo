package edu.lucas.um.bootcamp.estrutura_de_dados.projeto_no;

public class Main {
    public static void main(String[] args) {

        NoGenerics noGenerics1 = new NoGenerics("Conteudo No1");

        NoGenerics noGenerics2 = new NoGenerics("Conteudo No2");
        noGenerics1.setProximoNo(noGenerics2);

        NoGenerics noGenerics3 = new NoGenerics("Conteudo No3");
        noGenerics2.setProximoNo(noGenerics3);

        NoGenerics noGenerics4 = new NoGenerics("Conteudo No4");
        noGenerics3.setProximoNo(noGenerics4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(noGenerics1);
        System.out.println(noGenerics1.getProximoNo());
        System.out.println(noGenerics2);

        System.out.println("-----------------------");

        System.out.println(noGenerics1);
        System.out.println(noGenerics1.getProximoNo());
        System.out.println(noGenerics1.getProximoNo().getProximoNo());
        System.out.println(noGenerics1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(noGenerics1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        System.out.println("-----------------------");

        noGenerics2.setConteudo("Conteudo novo no2");
        System.out.println(noGenerics1.getProximoNo());
        System.out.println(noGenerics2);
        noGenerics1.getProximoNo().setConteudo("Novo conteudo será");
        System.out.println(noGenerics2);
        System.out.println(noGenerics1);


    }
}
