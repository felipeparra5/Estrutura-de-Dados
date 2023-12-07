package projetopratico;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Aguiar e Felipe Parra
 */
public class Main {
    int i = 0;
    IntNoSimples temp_no;
    int valor;
    public static void main(String[] args) {

        int nItensNaPilha  = Integer.parseInt (JOptionPane.showInputDialog(null, 
                "Digite o número de itens que serão inseridos na Pilha"));;
        Pilha p = new Pilha(nItensNaPilha);
        
        int nItensNaFila  = Integer.parseInt (JOptionPane.showInputDialog(null, 
                "Digite o número de itens que serão inseridos na FIla"));;
        Fila f = new Fila(nItensNaFila);
        
        int nItensNaListaEncadeada  = Integer.parseInt (JOptionPane.showInputDialog(null, 
                "Digite o número de itens que serão inseridos na Lista encadeada"));;
        ListaEncadeada l = new ListaEncadeada(); 
        
        while(true){
            int valor = Integer.parseInt (JOptionPane.showInputDialog(null, 
                "Digite um valor"));
            
            if(valor==0){
                break;
            }else{
                if(valor % 2 == 0 && valor > 0){
                    p.empilhar(valor);
                }

                if(valor % 2 != 0 && valor > 0){
                    f.enfileirar(valor);
                }
                
                if(valor < 0){
                    l.insereNo_fim(new IntNoSimples(valor));
                }    
            }
            
        
        }
        

        StringBuilder mensagemPilha = new StringBuilder("Valores na Pilha:\n");
        while (!p.vazia()) {
            mensagemPilha.append(p.desempilhar()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagemPilha.toString(), "Valores Desempilhados", JOptionPane.INFORMATION_MESSAGE);
        

        JOptionPane.showMessageDialog(null, "Valores na Fila:\n" + f.exibeFila());

        

        int[] valoresDaLista = l.exibeLista(nItensNaListaEncadeada);
        StringBuilder mensagemListaEncadeada = new StringBuilder("Valores da Lista Encadeada:\n");
        for (int i = 0; i < valoresDaLista.length; i++) {
            mensagemListaEncadeada.append(valoresDaLista[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagemListaEncadeada.toString(), "Valores da Lista", JOptionPane.INFORMATION_MESSAGE); 
			
	
    
    }
}
