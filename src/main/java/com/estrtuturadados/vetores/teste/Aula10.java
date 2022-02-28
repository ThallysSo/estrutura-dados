package com.estrtuturadados.vetores.teste;

import com.estruturadados.vetores.Vetor;

public class Aula10 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        Contato c1 = new Contato("Contato 1", "12345-1234", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "54211-1234", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "12312-1234", "contato3@email.com");
        Contato c4 = new Contato("Contato 3", "12312-1234", "contato3@email.com");
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);


        System.out.println(vetor.busca(2));


        System.out.println("Tamanho = " + vetor.getSize());
        System.out.println(vetor);
    }
}
