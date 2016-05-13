/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodista.ricardofiorani.dapsind12exercicio;

/**
 * @author Ricardo Fiorani
 */
public class Conta {

    private double saldo;
    private String tipo;

    public Conta(double valorInicial) {
        this.saldo = valorInicial;
    }

    public Conta(double valorInicial, String tipo) {
        this.saldo = valorInicial;
        this.tipo = tipo;
    }

    public boolean depositar(double valor) {
        if (valor > 1000 && this.tipo == "Corrente") {
            return false;
        }
        this.saldo = this.saldo + valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        } else {
            return true;
        }
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if ((this.tipo == "Corrente") && (contaDestino.verTipoConta() == "Poupanca")) {
            if (this.sacar(valor)) {
                if (contaDestino.depositar(valor)) {
                    return true;
                } else {
                    this.depositar(valor);
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public double verSaldo() {
        return this.saldo;
    }

    public String verTipoConta() {
        return this.tipo;
    }
}
