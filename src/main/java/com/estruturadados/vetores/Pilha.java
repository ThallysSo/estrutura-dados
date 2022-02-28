package com.estruturadados.vetores;

import com.estruturaestatica.EstruturaEstatistica;

public class Pilha<T> extends EstruturaEstatistica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T desempilhar() {
        return super.desempilhar();
    }

    public T topo() {
        if (isEmpty()) {
            return null;
        }
        return elements[tamanho - 1];
    }

}
