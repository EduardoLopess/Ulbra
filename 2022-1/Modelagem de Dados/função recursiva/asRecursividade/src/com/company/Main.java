package com.company;

public class Main {

    public static void main(String[] args) {


        int []vetor  = {5,200,10,12,50,80};

        int soma = soma(vetor, 0);
        int maior = maior(vetor, 0);

        System.out.println("Soma dos Elementos: " + soma);
        System.out.println("Maior valor: " + maior);

    }


    //1 — Escreva uma função recursiva para somar os elementos de um array.
    public static int soma(int[] vetor, int i) {
        if (i < vetor.length)
            return vetor[i] + soma(vetor, i + 1);
        else return 0 ;
    }

    //2 — Escreva uma função recursiva para encontrar o maior elemento de um array
    private static int maior(int[] vetor, int i) {
        if(i == vetor.length - 1){
            return vetor[i];
        }else{
            int maior = maior(vetor, i+1);
            if(maior > vetor[i]){
                return maior;
            }else{
                return vetor[i];
            }
        }
    }




}

