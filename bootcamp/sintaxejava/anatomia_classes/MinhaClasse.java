package edu.lucas.um.bootcamp.sintaxejava.anatomia;

public class MinhaClasse {

    public static void main (String[] args){

        String primeiroNome = "Lucas";
        String segundoNome = "Gabriel";
        String nomeCompleto = juntarNome(primeiroNome,segundoNome);

        System.out.println("Olá turma, sejam bem vindos!!!\n");

        System.out.println(nomeCompleto);

    }

    public static String juntarNome(String primeiroNome, String segundoNome){
        return "Saida do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
