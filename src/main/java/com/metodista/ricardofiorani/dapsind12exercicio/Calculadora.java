package com.metodista.ricardofiorani.dapsind12exercicio;

/**
 *
 * 1. Crie uma classe chamada Calculadora. Esta classe deve possuir os seguintes métodos: * public double operacao(double num1, double num2); Retorna a soma dos
 * dois números.
 *
 * public double operacao(int num1, double num2); Retorna a subtração dos dois números. * public double operacao(double num1, int num2); Retorna o produto dos
 * dois números. * public double operacao(int num1, int num2); Retorna o resultado da divisão dos dois números. * public double operacao(int num1, short num2);
 * Retorna o resto da divisão dos dois números. * Elabore um roteiro de teste para a sua calculadora e observe os resultados. (Tarefa: POO_PS_IND-12_Exec1).
 *
 *
 * @author Ricardo
 */
public class Calculadora {

    // Retorna a soma dos dois números.
    public double operacao(double num1, double num2) {
        return num1 + num2;
    }

    // Retorna a subtração dos dois números.  *
    public double operacao(int num1, double num2) {
        return num1 - num2;
    }

    // Retorna o produto dos dois números.  *
    public double operacao(double num1, int num2) {
        return num1 * num2;
    }

    // Retorna o resultado da divisão dos dois números.  *
    public double operacao(int num1, int num2) {
        return num1 / num2;
    }

    // Retorna o resto da divisão dos dois números.  *
    public double operacao(int num1, short num2) {
        return num1 % num2;
    }

    
}
