package edu.lucas.um.bootcamp.estrutura_de_dados.projeto_no;

public class No {

    private String conteudo;
    private NoGenerics proximoNoGenerics;

    public No(String conteudo) {
        this.proximoNoGenerics = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {return conteudo;}

    public void setConteudo(String conteudo) {this.conteudo = conteudo;}

    public NoGenerics getProximoNo() {return proximoNoGenerics;}

    public void setProximoNo(NoGenerics proximoNoGenerics) {this.proximoNoGenerics = proximoNoGenerics;}

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
