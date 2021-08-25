package com.company;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        double totalResistencia = 0, valorLido, maiorResistencia = 0, menorResistencia=0;

        for(int i=0; i<4; i++){
            System.out.println("Digite o valor da resistencia");
            valorLido = tc.nextDouble();
            totalResistencia += valorLido;
            if( i==0){
                maiorResistencia=valorLido;
                menorResistencia=valorLido;
            }
            if(valorLido > maiorResistencia){
                maiorResistencia=valorLido;
            }
            if(valorLido < menorResistencia){
                menorResistencia=valorLido;
            }
        }
        System.out.println("O maior valor lido foi: "+maiorResistencia);
        System.out.println("O menor valor lido foi: "+menorResistencia);
        System.out.println("Total: "+totalResistencia);
    }
}
