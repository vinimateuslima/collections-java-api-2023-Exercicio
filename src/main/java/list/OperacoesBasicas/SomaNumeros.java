package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumero;

    public SomaNumeros() {
        this.listaNumero = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        listaNumero.add(numero);
    }

    public int calcularSoma() {
        int resultado = 0;
        for (int  n : listaNumero) {
            resultado += n;
        }
        return resultado;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        for (int  n : listaNumero) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaNumero.get(0);
        for (int  n : listaNumero) {
            if (n < menorNumero) {
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return listaNumero;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        System.out.println("O resultado de todas as somas é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());

    }
}
