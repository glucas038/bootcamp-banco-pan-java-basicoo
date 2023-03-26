package edu.lucas.um.bootcamp.estrutura_de_dados.equals_hashcode;

import java.util.Objects;

public class Carro {

    String marca;
    String cor;

    public Carro(String marca) {
        this.marca = marca;
        this.cor = null;
    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
