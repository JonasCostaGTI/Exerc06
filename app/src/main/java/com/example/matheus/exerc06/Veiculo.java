package com.example.matheus.exerc06;

/**
 * Created by jonascosta on 07/04/16.
 */
public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String enderecoVistoria;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEnderecoVistoria() {
        return enderecoVistoria;
    }

    public void setEnderecoVistoria(String enderecoVistoria) {
        this.enderecoVistoria = enderecoVistoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veiculo veiculo = (Veiculo) o;

        if (placa != null ? !placa.equals(veiculo.placa) : veiculo.placa != null) return false;
        if (marca != null ? !marca.equals(veiculo.marca) : veiculo.marca != null) return false;
        if (modelo != null ? !modelo.equals(veiculo.modelo) : veiculo.modelo != null) return false;
        return !(enderecoVistoria != null ? !enderecoVistoria.equals(veiculo.enderecoVistoria) : veiculo.enderecoVistoria != null);

    }

    @Override
    public int hashCode() {
        int result = placa != null ? placa.hashCode() : 0;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (enderecoVistoria != null ? enderecoVistoria.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", enderecoVistoria='" + enderecoVistoria + '\'' +
                '}';
    }
}
