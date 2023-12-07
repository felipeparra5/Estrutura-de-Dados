/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaed;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class exercicio1 {
    public static void main(String[] args) {
        Fila f = new Fila(10);
        int opcao=0, valor;
        while(opcao!=4){
            opcao=Integer.parseInt(
                    JOptionPane.showInputDialog("\nMENU:\n"
                    + "1 - Inserir valor na fila\n"
                    + "2 - Remover valor da fila\n"
                    + "3 - Exibir os valores da fila\n"
                    + "4 - Sair"));
            switch(opcao){
                case 1:
                    valor = Integer.parseInt(
                          JOptionPane.showInputDialog(
                    "Digite o valor:"));
                    f.enfileirar(valor);
                    break;
                case 2:
                    valor = Integer.parseInt(f.desenfileirar());
                    JOptionPane.showMessageDialog(
                     null, 
                    "O valor desenfileirado foi:" + valor);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            f.exibeFila());
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção inválida!");
            }
        }
    }
    
}
