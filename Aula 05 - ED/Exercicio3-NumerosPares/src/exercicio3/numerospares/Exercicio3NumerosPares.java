/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3.numerospares;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Exercicio3NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        int valor;
        //Preenchendo a pilha com valores inteiros
        while(p.cheia()==false){
            valor = Integer.parseInt(
                    JOptionPane.showInputDialog(
            "Informe um valor "
                    + "a ser inserido na pilha:"));
            p.empilhar(valor);
        }
        int qtdePares = 0;
        while(p.vazia()==false){
            valor = Integer.parseInt(p.desempilhar().toString());
            if (valor % 2 == 0){
                qtdePares++;  
            }
        }
        JOptionPane.showMessageDialog(null,
                "A quantidade de valores pares é:" + qtdePares);
    }
    
}
