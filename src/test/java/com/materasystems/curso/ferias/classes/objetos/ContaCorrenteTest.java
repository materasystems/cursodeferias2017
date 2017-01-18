package com.materasystems.curso.ferias.classes.objetos;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by eso on 18/01/17.
 */
public class ContaCorrenteTest {

    public static final int COD_SUCESSO = 0;
    public static final int COD_ERRO_SAQUE_OU_DEPOSITO_NEGATIVO = -1;
    public static final int COD_ERRO_SAQUE_SALDO_INSUFICIENTE = -2;
    public static final int COD_CONTA_INATIVA = -3;

//    @Test
//    public void consultaSaldo() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1500.0;
//
//        Assert.assertEquals(1500.0, conta1.consultaSaldo(), 0);
//    }
//
//    @Test
//    public void consultaSaldoContaEspecial() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.especial = true;
//        conta1.saldo = 1500.0;
//        conta1.limite = 1000.0;
//
//        Assert.assertEquals(2500.0, conta1.consultaSaldo(), 0);
//    }
//
//    @Test
//    public void realizaDeposito() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000.0;
//
//        int statusOperacao = conta1.realizaDeposito(500.0);
//        Assert.assertEquals(COD_SUCESSO, statusOperacao);
//        Assert.assertEquals(1500.0, conta1.consultaSaldo(), 0);
//    }
//
//    @Test
//    public void realizaDepositoValorNegativo() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000.0;
//
//        int statusOperacao = conta1.realizaDeposito(-500.0);
//        Assert.assertEquals(COD_ERRO_SAQUE_OU_DEPOSITO_NEGATIVO, statusOperacao);
//        Assert.assertEquals(1000.0, conta1.consultaSaldo(), 0);
//    }
//
//    @Test
//    public void realizaSaqueContaComumPossuiSaldo() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//
//        int statusOperacao = conta1.realizaSaque(1000.0);
//        Assert.assertEquals(COD_SUCESSO, statusOperacao);
//        Assert.assertEquals(0.0, conta1.consultaSaldo(), 0);
//
//    }
//
//    @Test
//    public void realizaSaqueContaComumNaoPossuiSaldo() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//
//        int statusOperacao = conta1.realizaSaque(2000.0);
//        Assert.assertEquals(COD_ERRO_SAQUE_SALDO_INSUFICIENTE, statusOperacao);
//        Assert.assertEquals(1000.0, conta1.consultaSaldo(), 0);
//
//    }
//
//    @Test
//    public void realizaSaqueContaEspecialPossuiSaldoLimite() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//        conta1.especial = true;
//        conta1.limite = 500;
//
//        int statusOperacao = conta1.realizaSaque(1200.0);
//        Assert.assertEquals(COD_SUCESSO, statusOperacao);
//        Assert.assertEquals(300.0, conta1.consultaSaldo(), 0);
//
//    }
//
//    @Test
//    public void realizaSaqueContaEspecialNaoPossuiSaldoLimite() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//        conta1.especial = true;
//        conta1.limite = 500;
//
//        int statusOperacao = conta1.realizaSaque(1600.0);
//        Assert.assertEquals(COD_ERRO_SAQUE_SALDO_INSUFICIENTE, statusOperacao);
//        Assert.assertEquals(1500.0, conta1.consultaSaldo(), 0);
//    }
//
//    @Test
//    public void realizaSaqueContaEspecialSaqueNegativo() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//        conta1.especial = true;
//        conta1.limite = 500;
//
//        int statusOperacao = conta1.realizaSaque(-1600.0);
//        Assert.assertEquals(COD_ERRO_SAQUE_OU_DEPOSITO_NEGATIVO, statusOperacao);
//        Assert.assertEquals(1500.0, conta1.consultaSaldo(), 0);
//    }
//
//    @Test
//    public void contaComumNaoEstaUsandoLimite() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//
//        Assert.assertFalse(conta1.usandoLimite());
//
//    }
//
//    @Test
//    public void contaEspecialEstaUsandoLimite() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//        conta1.limite = 1000;
//        conta1.especial = true;
//
//        Assert.assertFalse(conta1.usandoLimite());
//
//        conta1.realizaSaque(1500.0);
//        Assert.assertTrue(conta1.usandoLimite());
//    }
//
//    @Test
//    public void contaEspecialNaoEstaUsandoLimite() {
//
//        ContaCorrente conta1 = new ContaCorrente();
//        conta1.saldo = 1000;
//        conta1.limite = 1000;
//        conta1.especial = true;
//
//        Assert.assertFalse(conta1.usandoLimite());
//
//        conta1.realizaSaque(1000.0);
//        Assert.assertFalse(conta1.usandoLimite());
//    }


}
