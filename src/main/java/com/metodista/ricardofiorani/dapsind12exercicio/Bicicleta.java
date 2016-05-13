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

    private Roda rodaDianteira;
    private Roda rodaTraseira;

    public void andar() {
        this.getRodaDianteira().girar();
        this.getRodaTraseira().girar();
    }

    public void frear() {
        this.getRodaDianteira().parar();
        this.getRodaTraseira().parar();
    }

    public void Bicicleta() {
        this.rodaDianteira = new Roda();
        this.rodaTraseira = new Roda();
    }

    public Roda getRodaDianteira() {
        return rodaDianteira;
    }

    public Roda getRodaTraseira() {
        return rodaTraseira;
    }

}
