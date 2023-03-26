package edu.lucas.um.bootcamp.estrutura_de_dados.projeto_no;

public class NoGenerics<T> {

    private T conteudo;
    private NoGenerics<T> proximoNoGenerics;

    public NoGenerics(T conteudo) {
        this.proximoNoGenerics = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {return conteudo;}

    public void setConteudo(T conteudo) {this.conteudo = conteudo;}

    public NoGenerics<T> getProximoNo() {return proximoNoGenerics;}

    public void setProximoNo(NoGenerics<T> proximoNoGenerics) {this.proximoNoGenerics = proximoNoGenerics;}

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
