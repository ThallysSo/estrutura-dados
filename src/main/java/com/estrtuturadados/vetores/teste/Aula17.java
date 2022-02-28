package com.estrtuturadados.vetores.teste;

import com.estruturadados.vetores.Pilha;

public class Aula17 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println(pilha);

        pilha.empilha(3);

        System.out.println(pilha);
        pilha.desempilhar();

        System.out.println(pilha);
    }
}
