/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3.numerospares;

/**
 *
 * @author bruno
 */
public class Pilha {
    private int topo;
    private int tamanho;
    private Object pilhaElem[];
    
    public Pilha(int tam){
        topo = -1;
        tamanho = tam;
        pilhaElem = new Object[tam];
    }
    
    public boolean vazia(){
        if (topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean cheia(){
        if (topo ==  tamanho -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void empilhar(Object elem){
        if(cheia() == true){
            System.out.println("A pilha está cheia!");
        }
        else{
            topo++;
            pilhaElem[topo]=elem;
        }
    }
    
    public Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia!";
        }
        else{
            valorDesempilhado = pilhaElem[topo];
            topo--;
        }
        return valorDesempilhado;
    }

}



