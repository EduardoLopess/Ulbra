package com.company;

public class QuickSort {

    static int trocas = 0;

    public static Result sort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int p = ordenacao(vetor, esquerda, direita);
            sort(vetor, esquerda, p);
            sort(vetor, p + 1, direita);

        }
        return new Result(vetor, trocas);
    }

    static int ordenacao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita)/2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita;
        while(true){
            do{
                i++;
            }while (vetor[i] < pivo);
            do{
                j--;
            }while (vetor[j] > pivo);
            if(i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            trocas++;
        }
    }
}
