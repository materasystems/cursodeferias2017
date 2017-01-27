package com.materasystems.curso.ferias.mercadinho.produtos;

import com.materasystems.curso.ferias.mercadinho.Mercadinho;

public class CocaCola2L extends Produto {

	private final double preco = 7.0;
	private final String descricao = "Coca Cola 2L";
	
	public CocaCola2L() {
		super(Mercadinho.CODIGO_COCA_COLA_2L);
	}
	
	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CocaCola2L other = (CocaCola2L) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (Double.doubleToLongBits(preco) != Double
				.doubleToLongBits(other.preco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CocaCola2L [preco=" + preco + ", descricao=" + descricao + "]";
	}

}
