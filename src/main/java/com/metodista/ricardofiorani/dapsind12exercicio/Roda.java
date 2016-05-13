package com.metodista.ricardofiorani.dapsind12exercicio;

/**
 *
 * @author Ricardo Fiorani
 */
public class Roda {

    private boolean emMovimento;

    public void girar() {
        this.emMovimento = true;
    }

    public void parar() {
        this.emMovimento = false;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }
    
}
