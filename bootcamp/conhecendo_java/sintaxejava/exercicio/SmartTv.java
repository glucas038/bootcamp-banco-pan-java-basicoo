package edu.lucas.um.bootcamp.sintaxejava.exercicio;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void diminiurVolume(){
        this.volume--;
    }

    public void subirCanal(){
        this.canal++;
    }

    public void diminuirCanal(){
        this.canal--;
    }

    public void selecionarCanal(int novoCanal){
        this.canal = novoCanal;
    }
}
