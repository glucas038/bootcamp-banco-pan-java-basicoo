package edu.lucas.um.bootcamp.entendendo_metodos.exercicios;

public class Emprestimo {
    private double taxa;
    private double tempo;
    private double capital;
    private double montante;

    public Emprestimo(double taxa) {
        this.taxa = taxa/100;
        this.tempo = 0;
        this.montante = 0;
        this.capital = 0;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa/100;
    }

    public double getMontante() {
        return montante;
    }

    public double calcular(double capital, double tempo){

        this.montante = capital * Math.round(Math.pow(1+taxa,24));
        return montante;
    }
}
