package com.estruturadados.vetores;

public class Lista<T> {

    private T[] elements;
    private int size;

    public Lista(int capacity){
        this.elements = (T[])new Object[capacity];
        this.size = 0;
    }

    public void adiciona(T element){
        aumentaCapacidade();
        if (this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
        }
    }

    public int getSize() {
        return this.size;
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int position, T element){
        aumentaCapacidade();
        validPosition(position);
        for (int vetorPosition = size-1; vetorPosition>= position; vetorPosition--){
            elements[vetorPosition+1] = elements[vetorPosition];
        }
        this.elements[position] = element;
        this.size++;

        return false;
    }

    private void aumentaCapacidade(){
        if(size == elements.length){
            T[] newElements = (T[])new Object[elements.length * 2];
            for(int i = 0; i < size; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    // A B C D E F
    //vetor[1] = vetor[2]
    //vetor[3] = vetor[4]
    // A C D E F
    public void deleta(int position){
        validPosition(position);
        for (int i = position; i < size-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        size--;
    }

    public T busca(int position){
        if (!(position >= 0 && position < size)){
            throw new IllegalArgumentException("Posição INVALIDA!");
        }
        return this.elements[position];

    }

    private void validPosition(int position){
        if (!(position >= 0 && position < size)){
            throw new IllegalArgumentException("Posição INVALIDA!");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size-1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        if (this.size > 0){
            s.append(this.elements[this.size-1]);
            s.append("]");
        }

        return s.toString();
    }

    public void search(){
        for (int i = 0; i <= this.size-1; i++) {
            if (this.elements[i] != null){
                System.out.println(this.elements[i]);
            }
        }
        if(this.size > 0){
            System.out.println(this.elements[this.size-1]);
        }
    }

    public int busca(Object element){
        for (int position = 0 ; position < this.size; position++){
            if (this.elements[position].equals(element)){
                return position;
            }
        }
        return -1;
    }
}


