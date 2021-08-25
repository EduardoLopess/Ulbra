package com.company;

import javax.swing.*;

public class Exercicio03 {

    public static void main(String[] args){
       double nota1, nota2,notaTra3, media;
       String dado;
       dado = JOptionPane.showInputDialog("Digite nota 1");
       nota1 = Double.parseDouble(dado);
       dado = JOptionPane.showInputDialog("Digite nota 2");
       nota2 = Double.parseDouble(dado);
       dado = JOptionPane.showInputDialog("Digite nota do Trabalho");
       notaTra3 = Double.parseDouble(dado);

       media = (nota1+nota2+notaTra3)/3;
       if(media > 6){
           JOptionPane.showMessageDialog(null,"Aprovado! media final: "+media);
       }else{
           JOptionPane.showMessageDialog(null,"Reprovado! media final: "+media);
       }
    }
}
