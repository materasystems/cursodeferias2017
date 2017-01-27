package com.materasystems.curso.ferias.mercadinho;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.materasystems.curso.ferias.mercadinho.produtos.CocaCola2L;
import com.materasystems.curso.ferias.mercadinho.produtos.Marsupilami;

public class Mercadinho {

	public static final int CODIGO_COCA_COLA_2L = 1;
	public static final int CODIGO_MARSUPILAMI = 2;
	
	static final int MOSTRAR_CARRINHO = 100;
	static final int FECHAR_CARRINHO = 200;
	
	static final Map<Integer, String> CODIGO_DESCRICAO_MAP = new HashMap<>();
	
	static {
		CODIGO_DESCRICAO_MAP.put(CODIGO_COCA_COLA_2L, "Coca Cola 2L");
		CODIGO_DESCRICAO_MAP.put(CODIGO_MARSUPILAMI, "Marsupilami");
	}
	
	
	public static void main(String[] args) {

		final Scanner scanner = new Scanner(System.in);
		final Carrinho carrinho = new Carrinho();
		
		int opcao;
		do {
			
			exibeMenu();
			opcao = scanner.nextInt();
			System.out.println();

			switch (opcao) {
				case CODIGO_COCA_COLA_2L: 
					carrinho.adicionar(new CocaCola2L());
					break;
				case CODIGO_MARSUPILAMI:
					carrinho.adicionar(new Marsupilami());
					break;
				case MOSTRAR_CARRINHO:
					carrinho.listar();
					break;
				case FECHAR_CARRINHO:
					break;
				default:
					System.out.println("Escolha uma Opção Válida");
			}
			

		} while (opcao != FECHAR_CARRINHO);
	
		scanner.close();
		
		System.out.println("Total: R$ " + carrinho.total());
	}
	
	private static void exibeMenu() {
		
		System.out.println("|------------------------|");
		System.out.println("|   Mercadinho da Vovó   |");
		System.out.println("|------------------------|");
		System.out.println("| 1 - CocaCola 2L        |");
		System.out.println("| 2 - Marsupilami        |");
		System.out.println("|------------------------|");
		System.out.println("| 100 - Mostrar Carrinho |");
		System.out.println("| 200 - Fechar Compra    |");
		System.out.println("|------------------------|");
		
	}
	
}
