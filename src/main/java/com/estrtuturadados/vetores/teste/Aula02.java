package com.estrtuturadados.vetores.teste;

import com.estruturadados.vetores.Vetor;

public class Aula02 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(4);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        vetor.deleta(1);
        System.out.println(vetor.adiciona(1, "A"));
        System.out.println(vetor);
        System.out.println(vetor.busca("E"));

        System.out.println("Remover o elemento :E");
        int pos = vetor.busca("A");
        if (pos > -1){
            vetor.deleta(pos);
        } else {
            System.out.println("Elemento não existe no Vetor");
        }
        System.out.println(vetor);

    }
}
