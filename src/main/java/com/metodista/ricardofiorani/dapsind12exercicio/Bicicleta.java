/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodista.ricardofiorani.dapsind12exercicio;

/**
 *
 * @author Ricardo Fiorani
 */
public class Bicicleta {

    public Roda rodaDianteira;
    private Roda rodaTraseira;

    public void andar() {
        this.rodaDianteira.girar();
        this.rodaTraseira.girar();
    }

    public void frear() {
        this.rodaDianteira.parar();
        this.rodaTraseira.parar();
    }

    public void Bicicleta() {
        this.rodaDianteira = new Roda();
        this.rodaTraseira = new Roda();
    }
}
