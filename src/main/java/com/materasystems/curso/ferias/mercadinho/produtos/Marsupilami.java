package com.materasystems.curso.ferias.mercadinho.produtos;

import com.materasystems.curso.ferias.mercadinho.Mercadinho;


public class Marsupilami extends Produto {
	
	private final double preco = 500.0;
	private final String descricao = "Marsupilami";
	
	public Marsupilami() {
		super(Mercadinho.CODIGO_MARSUPILAMI);
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
		Marsupilami other = (Marsupilami) obj;
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
		return "Marsupilami [preco=" + preco + ", descricao=" + descricao + "]";
	}

}
