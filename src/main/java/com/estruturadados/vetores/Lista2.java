package com.estruturadados.vetores;

import com.estruturaestatica.EstruturaEstatistica;

public class Lista2<T> extends EstruturaEstatistica<T> {

    public Lista2(){
        super();
    }

    public Lista2(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(T element){
        return super.adiciona(element);
    }

    public boolean adiciona(int position, T element){
        return super.adiciona(position, element);
    }
}
