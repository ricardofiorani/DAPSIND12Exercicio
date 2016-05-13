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
public class BicicletaTest {

    /**
     * Test of andar method, of class Bicicleta.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        Bicicleta instance = new Bicicleta();
        instance.andar();
        assertTrue(instance.getRodaDianteira().isEmAndamento());
        assertTrue(instance.getRodaTraseira().isEmAndamento());
    }

    /**
     * Test of frear method, of class Bicicleta.
     */
    @Test
    public void testFrear() {
        System.out.println("frear");
        Bicicleta instance = new Bicicleta();
        instance.andar();
        instance.frear();
        assertFalse(instance.getRodaDianteira().isEmAndamento());
        assertFalse(instance.getRodaTraseira().isEmAndamento());
    }

}