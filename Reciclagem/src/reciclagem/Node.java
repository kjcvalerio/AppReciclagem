/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reciclagem;

/**
 *
 * @author kevin
 */
public class Node {
     Node proximo;
    Node anterior;
    Material material;
   
    public Node(Material material){
        this.material = material;
        this.proximo = null;
        this.anterior = null;  
    }

    
}
