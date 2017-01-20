/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.objetos;

import java.util.Objects;

/**
 *
 * @author rochapaulo
 * @since 2017
 *
 */
public class Carro {

    private static final String PROPRIETARIO_DEFAULT = "Desconhecido";

    private final Marca marca;
    private final int velocidadeMaxima;
    private String proprietario;

    public Carro(Marca marca, int velocidadeMaxima) {

        if (velocidadeMaxima < 0) {
            throw new IllegalArgumentException("Velocidade máxima não pode ser negativa");
        }

        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.proprietario = PROPRIETARIO_DEFAULT;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {

        if (proprietario == null) {
            throw new NullPointerException("Proprietario não pode ser nulo");
        }
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Carro=[marca=" + marca + ", velocidadeMaxima=" + velocidadeMaxima + ", proprietario=" + proprietario + "]";
    }

    @Override
    public boolean equals(Object object) {
        // TODO
        return super.equals(object);
    }

}
