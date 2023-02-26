package edu.lucas.um.bootcamp.estrutura_de_dados.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = novoNo;
        this.refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No rePoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return rePoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
//        if (this.refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return this.refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){

        String stringRetorno = "---------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }

        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
