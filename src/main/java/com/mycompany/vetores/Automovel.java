/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Automovel {
 String modelo[] = new String[5];
    String marca[] = new String[5];

    public void cadAutomovel() {
        String resultado = "";
        String resposta = "";
        int codigo;

        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Digite a marca do Automovel: " + (i + 1));
            modelo[i] = JOptionPane.showInputDialog("Digite o modelo do Automovel: " + (i + 1));
            resposta += marca[i] + " - " + modelo[i] + "\n";
        }
             
        JOptionPane.showMessageDialog(null, resposta);
           
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Aplique o Código do Automoveis: "));
        resposta = marca[codigo] + " - " + modelo[codigo];
         
        JOptionPane.showMessageDialog(null, resposta);
        


    }
}
