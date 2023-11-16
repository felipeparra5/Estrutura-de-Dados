/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author parra
 */
public class ExemploPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        
        while(p.cheia()==false){ //preenchendo a pilha
            int elemento;
            elemento=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser inserido na Pilha:"));
            if(elemento != 0)
                p.empilhar(elemento);
            else{
                break;
            }
        }
        
        while(p.vazia()==false){ //removendo da 
            JOptionPane.showMessageDialog(null,"Valor Desempilhado:" + p.desempilhar().toString());
        }
    }
    
}
