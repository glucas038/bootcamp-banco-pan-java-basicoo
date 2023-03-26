package edu.lucas.um.bootcamp.entendendo_metodos.exercicios;

public class Calculadora {

    private float numero1;
    private float numero2;

    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public float somar (float numero1, float numero2){
        return numero1 + numero2;
    }

    public float subtrair (float numero1, float numero2){
        return numero1 - numero2;
    }

    public float multiplicar (float numero1, float numero2){
        return numero1 * numero2;
    }

    public float dividir (float numero1, float numero2){
        if (numero2 == 0){
            System.out.println("Não divide por 0");
            return 0;
        }
        return numero1 / numero2;
    }

}
