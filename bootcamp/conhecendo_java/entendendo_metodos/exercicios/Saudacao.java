package edu.lucas.um.bootcamp.entendendo_metodos.exercicios;

import java.util.Date;

public class Saudacao {
    private int hora;
    private int min;

    public Saudacao(int hora, int min) {
        this.hora = hora;
        this.min = min;
    }

    public String saudar(){
        if (hora >= 12 && hora < 18){
            return "Boa Tarde";
        } else if (hora >= 18 && hora <= 24 || hora >= 0 || hora < 6) {
            return "Boa Noite";
        } else if (hora >= 6 && hora < 12) {
            return "Bom dia";
        }else {
            return "Não existe esse horario";
        }
    }
}
