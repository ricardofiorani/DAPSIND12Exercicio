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
public class CalculadoraTest {

    /**
     * Test of operacao method, of class Calculadora.
     */
    @Test
    public void testOperacao_double_double() {
        System.out.println("Operacao Soma");
        double num1 = 5.0;
        double num2 = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.operacao(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of operacao method, of class Calculadora.
     */
    @Test
    public void testOperacao_int_double() {
        System.out.println("Operacao subtracao");
        int num1 = 20;
        double num2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 18.0;
        double result = instance.operacao(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of operacao method, of class Calculadora.
     */
    @Test
    public void testOperacao_double_int() {
        System.out.println("Operacao multiplicacao");
        double num1 = 3.0;
        int num2 = 6;
        Calculadora instance = new Calculadora();
        double expResult = 18.0;
        double result = instance.operacao(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of operacao method, of class Calculadora.
     */
    @Test
    public void testOperacao_int_int() {
        System.out.println("Operacao divisao");
        int num1 = 20;
        int num2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.operacao(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of operacao method, of class Calculadora.
     */
    @Test
    public void testOperacao_int_short() {
        System.out.println("Operacao resto");
        int num1 = 15;
        short num2 = 16;
        Calculadora instance = new Calculadora();
        double expResult = 15.0;
        double result = instance.operacao(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

}
