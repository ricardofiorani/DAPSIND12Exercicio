package com.metodista.ricardofiorani.dapsind12exercicio;

/**
 *
 * @author Ricardo Fiorani
 */
public class Pessoa {

    public String dizerInformacao(String nome) {
        return "Meu nome é " + nome;
    }

    public String dizerInformacao(int idade) {
        return "Minha idade é " + idade;
    }

    public String dizerInformacao(double peso, double altura) {
        return "Meu peso é " + peso + " e minha altura é " + altura;
    }

}
