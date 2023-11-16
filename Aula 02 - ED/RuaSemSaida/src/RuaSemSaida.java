import javax.swing.JOptionPane;

/**
 *
 * @author parra
 */
public class RuaSemSaida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha(8);
        Pilha copia = new Pilha(8);
        String placa, buscaPlaca;
        boolean vEncontrado=false;
        while(p.cheia()==false){
            placa = JOptionPane.showInputDialog(
            "Informe a placa do "
                    + "veículo a ser estacionado:");
            if (placa.equals("sair"))
                break;
            else{
                p.empilhar(placa);
                copia.empilhar(placa);
            }  
        }
        buscaPlaca = JOptionPane.showInputDialog(
                "Informe a placa do carro "
                        + "a ser retirado:");
        while(copia.vazia()==false){
            placa = String.valueOf(copia.desempilhar());
            if (placa.equals(buscaPlaca)){
                JOptionPane.showMessageDialog(null,
                        "Veículo encontrado!");
                vEncontrado=true;
                break;
            } 
        }
        if (vEncontrado==true){
            while(p.vazia() == false){
                placa = String.valueOf(p.desempilhar());
                if (placa.equals(buscaPlaca))
                    break;
                else{
                    JOptionPane.showMessageDialog(null,
                            "O veículo com a placa" + placa 
                                    + "deve ser retirado!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "O veículo não está na rua sem saída!");
        }   }
            
}
