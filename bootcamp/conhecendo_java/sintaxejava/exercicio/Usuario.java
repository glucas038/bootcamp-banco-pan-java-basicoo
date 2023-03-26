package edu.lucas.um.bootcamp.sintaxejava.exercicio;

public class Usuario {
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();
        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

        smartTv.diminiurVolume();
        smartTv.diminiurVolume();
        smartTv.diminiurVolume();
        smartTv.diminiurVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status - Volume Atual? " + smartTv.volume);

        smartTv.selecionarCanal(17);
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo Status - Canal Atual? " + smartTv.canal);
    }
}
