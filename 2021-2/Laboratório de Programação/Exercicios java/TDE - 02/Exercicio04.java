package com.company;


import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        final int IDADE_MASC_APOSENTAR = 65;
        final int IDADE_FEM_APOSENTAR = 60;
        final int IDADE_FEM_CONTRIBUICAO = 30;
        final int IDADE_MASC_CONTRIBUICAO = 35;
        int idade, contribuicao;
        String sexo;
        Scanner tc = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        idade = tc.nextInt();

        System.out.println("Tempo de contribuicao: ");
        contribuicao = tc.nextInt();

        System.out.println("Informe o Sexo: ");
        sexo = tc.next();

        if(sexo.equalsIgnoreCase("m")) {
            if (idade >= IDADE_MASC_APOSENTAR) {
                System.out.println("Voce pode se aposentar por conta da idade!");
            } else {
                if (contribuicao >= IDADE_MASC_CONTRIBUICAO) {
                    System.out.println("Voce pode se aposentar por tempo de contribuicao!");
                } else {
                    System.out.println("Voce ainda nao pode se aposentar falta:");
                    System.out.println(IDADE_MASC_CONTRIBUICAO - contribuicao + "De contribuicao");
                    System.out.println(IDADE_MASC_APOSENTAR - idade + "DE idade");
                }
            }
        }else{
            if(idade >= IDADE_FEM_APOSENTAR){
                System.out.println("Voce pode se aposentar por conta da idade!");
            }else{
                if(contribuicao >= IDADE_FEM_CONTRIBUICAO){
                    System.out.println("Voce pode se aposentar por tempo de contribuicao!");
                }else{
                    System.out.println("Voce ainda nao pode se aposentar falta:");
                    System.out.println(IDADE_FEM_CONTRIBUICAO-contribuicao+"De contribuicao");
                    System.out.println(IDADE_FEM_APOSENTAR-idade+"DE idade");
                }
            }
        }

    }
}
