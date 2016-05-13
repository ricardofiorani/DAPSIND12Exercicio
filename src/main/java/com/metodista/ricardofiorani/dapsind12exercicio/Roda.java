package com.metodista.ricardofiorani.dapsind12exercicio;

/**
 *
 * @author Ricardo Fiorani
 */
public class Roda {

    private boolean emAndamento;

    public void girar() {
        this.emAndamento = true;
    }

    public void parar() {
        this.emAndamento = false;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }
    
}
