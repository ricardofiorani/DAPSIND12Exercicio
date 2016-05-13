/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodista.ricardofiorani.dapsind12exercicio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class RodaTest {

    /**
     * Test of girar method, of class Roda.
     */
    @Test
    public void testGirar() {
        System.out.println("girar");
        Roda instance = new Roda();
        instance.girar();
        assertTrue(instance.isEmAndamento());
    }

    /**
     * Test of parar method, of class Roda.
     */
    @Test
    public void testParar() {
        System.out.println("parar");
        Roda instance = new Roda();
        instance.parar();
        assertFalse(instance.isEmAndamento());
    }

}
