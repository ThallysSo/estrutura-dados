package com.estrtuturadados.vetores.teste;

import com.estruturadados.vetores.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(5);
        vetor.adiciona("Thallys");
        vetor.adiciona("Ronald");
        System.out.println(vetor);
    }
}
