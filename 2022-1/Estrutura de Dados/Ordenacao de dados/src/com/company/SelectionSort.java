package com.company;

public class SelectionSort {
    public static Result sort(int[] vetor){
        int trocas = 0;

        int posicaoMenor, aux;
        for(int i=0; i<vetor.length; i++){
            posicaoMenor = i;
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
            trocas++;

        }
        return new Result(vetor, trocas);
    }
}
