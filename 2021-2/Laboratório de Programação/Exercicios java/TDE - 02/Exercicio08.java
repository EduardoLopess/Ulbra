package com.company;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        int num;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = tc.nextInt();
        for (int i=1;i<10; i++){
            System.out.println(i+"X"+ num+ "="+(i*num));
        }
    }
}
