package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //attributes

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public void calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item i : itemList) {
           valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println("O valor total do carrinho é " + valorTotal);
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Sabonete", 1.50, 1);
        carrinhoDeCompras.adicionarItem("Fósforo", 2.00, 2);
        carrinhoDeCompras.adicionarItem("Barbeador", 2.50, 1);
        carrinhoDeCompras.adicionarItem("Desodorante", 0.50, 3);
        carrinhoDeCompras.adicionarItem("Perfume", 10.00, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("Sabonete");
        carrinhoDeCompras.calcularValorTotal();
    }
}