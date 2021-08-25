package com.company;

import javax.swing.*;

public class Exercicio02 {

    public static void main(String[] args) {
	    double itbi, valorVenal, valorTransacao, impostoPago;
        String dado;
        dado = JOptionPane.showInputDialog("Digite o valor da Transacao");
        valorTransacao = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Digite o valor da venal");
        valorVenal = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Digite o porcentagem do imposto");
        itbi = Double.parseDouble(dado);

       if(valorTransacao > valorVenal){
           impostoPago = valorTransacao*itbi/100;
       }else {
           impostoPago = valorVenal*itbi;
       }
        JOptionPane.showMessageDialog(null,"Imposto a ser pago e"+impostoPago);

    }
}
