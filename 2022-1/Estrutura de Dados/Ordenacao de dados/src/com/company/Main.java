package com.company;

public class Main {

    public static void main(String[] args) {
        int [] vetor = new int[10000];
        long tempInicio, tempFinal;
        Result result;


        for(int i =0; i<vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }


        System.out.println("\nSelection Sort");
        tempInicio = System.currentTimeMillis();
        result = SelectionSort.sort(vetor.clone());
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo: "+(tempFinal-tempInicio) + "ms");
        System.out.println("Trocas: " + result.getTrocas());


        System.out.println("\nInsertion Sort");
        tempInicio = System.currentTimeMillis();
        result = InsertionSort.sort(vetor.clone());
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo: "+(tempFinal-tempInicio) + "ms");
        System.out.println("Trocas: " + result.getTrocas());


        System.out.println("\nBuble Sort");
        tempInicio = System.currentTimeMillis();
        result = BubbleSort.sort(vetor.clone());
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo: "+(tempFinal-tempInicio) + "ms");
        System.out.println("Trocas: " + result.getTrocas());


        System.out.println("\nQuick Sort");
        tempInicio = System.currentTimeMillis();
        result = QuickSort.sort(vetor.clone(), 0,vetor.length);
        tempFinal = System.currentTimeMillis();
        System.out.println("Tempo: "+(tempFinal-tempInicio) + "ms");
        System.out.println("Trocas: " + result.getTrocas());







    }
}







//Pesquisar três métodos de ordenação de dados.
//Produzir um programa que seja possível ordenar um vetor com 10 mil elementos com no
//mínimo 3 algoritmos distintos. O programa deve ordenar e mostrar o tempo que levou para realizar a ordenação
//o número de comparações e o número de trocas. Pode ser feito em apenas um programa.
//Postar 02/05 Em "Ordenação de Dados"


