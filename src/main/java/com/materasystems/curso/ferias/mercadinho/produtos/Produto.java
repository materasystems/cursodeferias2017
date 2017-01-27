package com.materasystems.curso.ferias.mercadinho.produtos;

public abstract class Produto {

	private final int codigo;
	
	public Produto(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public abstract double getPreco();
	public abstract String getDescricao();
	
}
