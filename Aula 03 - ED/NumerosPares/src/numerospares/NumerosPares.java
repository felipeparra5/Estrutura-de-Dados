/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares;

import javax.swing.JOptionPane;

/**
 *
 * @author parra
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha (10);
        int valor;
        
        while(p.cheia ()==false){
        valor = Integer.parseInt( JOptionPane.showInputDialog(
        "Informe um valor" + "a ser inserido na pilha:"));
    }
        int qtdePares = 0;
        while(p.vazia()==false){
            valor = Integer.parseInt(p.desempilhar().toString());
            if (valor % 2 == 0){
                qtdePares++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidadede valores pares é:" + qtdePares);
    }
    
}
