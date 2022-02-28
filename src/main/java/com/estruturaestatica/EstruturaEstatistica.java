package com.estruturaestatica;


public class EstruturaEstatistica<T> {

    protected T[] elements;
    protected int tamanho;

    public EstruturaEstatistica(int capacidade) {
        this.elements = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatistica(){
        this(10);
    }

    protected boolean adiciona(T element){
        aumentaCapacidade();
        if (this.tamanho < this.elements.length){
            this.elements[this.tamanho] = element;
            this.tamanho++;
        }
        return true;
    }
    protected boolean adiciona(int position, T element){
        aumentaCapacidade();
        validPosition(position);
        for (int vetorPosition = tamanho -1; vetorPosition>= position; vetorPosition--){
            elements[vetorPosition+1] = elements[vetorPosition];
        }
        this.elements[position] = element;
        this.tamanho++;

        return false;
    }

    private void aumentaCapacidade(){
        if(tamanho == elements.length){
            T[] newElements = (T[])new Object[elements.length * 2];
            for(int i = 0; i < tamanho; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    private void validPosition(int position){
        if (!(position >= 0 && position < tamanho)){
            throw new IllegalArgumentException("Posição INVALIDA!");
        }
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public T desempilhar(){
        if (isEmpty()){
            return null;
        }
        T elemento = elements[tamanho-1];
        tamanho--;
        return elemento;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho -1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        if (this.tamanho > 0){
            s.append(this.elements[this.tamanho -1]);
            s.append("]");
        }

        return s.toString();
    }

}
