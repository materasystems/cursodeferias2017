package com.materasystems.curso.ferias.mercadinho;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.materasystems.curso.ferias.mercadinho.produtos.Produto;


public class Carrinho {

	private class ProdutoQuantidade {
		
		private Produto produto;
		private int quantidade;
		
		private ProdutoQuantidade(Produto produto, int quantidade) {
			this.produto = produto;
			this.quantidade = quantidade;
		}
	}
	
	private final Map<Integer, ProdutoQuantidade> codigoQuantidade = new HashMap<>();
	
	public void adicionar(Produto produto) {
		
		ProdutoQuantidade produtoQuantidade = 
				codigoQuantidade.getOrDefault(produto.getCodigo(), new ProdutoQuantidade(produto, 0));
		
		produtoQuantidade.quantidade++;
		codigoQuantidade.put(produto.getCodigo(), produtoQuantidade);
	}

	public void listar() {

		if (codigoQuantidade.isEmpty()) {
			System.out.println("Seu carrinho de compras está vazio");
			return;
		}
		
		System.out.println("Produtos no Carrinho: ");
		for (Entry<Integer, ProdutoQuantidade> entrada : codigoQuantidade.entrySet()) {
			ProdutoQuantidade produtoQuantidade = entrada.getValue();
			int quantidade = produtoQuantidade.quantidade;
			System.out.println("|  " + Mercadinho.CODIGO_DESCRICAO_MAP.get(entrada.getKey()) + " = " + quantidade);
		}
		
		System.out.println("------------------------");
		System.out.println();
	}

	public double total() {
		double total = 0.0;
		for (ProdutoQuantidade entrada : codigoQuantidade.values()) {
			total = total + (entrada.produto.getPreco() * entrada.quantidade);
		}
		return total;
	}

}
