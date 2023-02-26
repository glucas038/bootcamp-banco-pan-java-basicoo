package edu.lucas.um.bootcamp.estrutura_de_dados.listas_encadeadas;

public class ListaEncadeada<T> {

    No<T> refenciaEntrada;

    public ListaEncadeada() {
        this.refenciaEntrada = null;
    }

    public void add(T conteudo) {

        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            refenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refenciaEntrada;

        for (int i = 0; i < this.size() - 1; i++) {

            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){

        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);

        No<T> noAuxiliar = refenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }


        return noRetorno;
    }

    public T remocve(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            refenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo (index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size() {

        int tamanhoLista = 0;
        No<T> referenciaAux = refenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index +
                    ".Essa lista só vai até o index " + ultimoIndice + ".");
        }
    }

    public boolean isEmpty() {
        return this.refenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refenciaEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
