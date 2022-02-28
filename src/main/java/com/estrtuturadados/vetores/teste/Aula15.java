package com.estrtuturadados.vetores.teste;

import com.estruturadados.vetores.Pilha;

public class Aula15 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.isEmpty());
        pilha.empilha(1);
        System.out.println(pilha.isEmpty());
        System.out.println(pilha);
    }
}
