package main.java.list.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int condigoConvite;

    public Convidado(String nome, int condigoConvite) {
        this.nome = nome;
        this.condigoConvite = condigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCondigoConvite() {
        return condigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCondigoConvite() == convidado.getCondigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCondigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", condigoConvite=" + condigoConvite +
                '}';
    }

}
