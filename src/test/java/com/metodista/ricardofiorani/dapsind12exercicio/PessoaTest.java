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
public class PessoaTest {

    /**
     * Test of dizerInformacao method, of class Pessoa.
     */
    @Test
    public void testDizerInformacao_String() {
        System.out.println("Dizer nome");
        String nome = "Ricardo";
        Pessoa instance = new Pessoa();
        String expResult = "Meu nome é " + nome;
        String result = instance.dizerInformacao(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of dizerInformacao method, of class Pessoa.
     */
    @Test
    public void testDizerInformacao_int() {
        System.out.println("Dizer idade");
        int idade = 27;
        Pessoa instance = new Pessoa();
        String expResult = "Minha idade é " + idade;
        String result = instance.dizerInformacao(idade);
        assertEquals(expResult, result);
    }

    /**
     * Test of dizerInformacao method, of class Pessoa.
     */
    @Test
    public void testDizerInformacao_double_double() {
        System.out.println("Dizer peso e altura");
        double peso = 92.0;
        double altura = 175.0;
        Pessoa instance = new Pessoa();
        String expResult = "Meu peso é " + peso + " e minha altura é " + altura;
        String result = instance.dizerInformacao(peso, altura);
        assertEquals(expResult, result);
    }

}
