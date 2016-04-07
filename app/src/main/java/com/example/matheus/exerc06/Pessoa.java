package com.example.matheus.exerc06;

import android.widget.TextView;

/**
 * Created by jonascosta on 07/04/16.
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private Veiculo veiculo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (nome != null ? !nome.equals(pessoa.nome) : pessoa.nome != null) return false;
        if (cpf != null ? !cpf.equals(pessoa.cpf) : pessoa.cpf != null) return false;
        return !(veiculo != null ? !veiculo.equals(pessoa.veiculo) : pessoa.veiculo != null);

    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (veiculo != null ? veiculo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", veiculo=" + veiculo +
                '}';
    }
}
