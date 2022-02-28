package com.estrtuturadados.vetores.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("D");
        arrayList.add(1,"B");
        boolean exist = arrayList.contains("A");
        if (exist) {
            System.out.println("Existe no Array!");
        }else {
            System.out.println("Não existe no Array!");
        }

        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList.get(1));

        System.out.println(arrayList.size());

    }
}
