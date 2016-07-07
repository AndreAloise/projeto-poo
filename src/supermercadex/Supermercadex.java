/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadex;

/**
 *
 * @author Filipe Lima
 */
public class Supermercadex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estoque mercadex = new Estoque();
        Produto p1 = new Produto(1, 2.50, "Trakinas");
        Item i1 = new Item(p1, 20);
        Produto p2 = new Produto(2, 14.20, "Feijão");
        Item i2 = new Item(p2, 10);
        
        mercadex.insereProduto(i1);
        mercadex.insereProduto(i2);
        mercadex.insereProduto(i1);
        mercadex.imprimeEstoque();
        mercadex.insereProduto(i1);
        mercadex.imprimeEstoque();
        
        
    }
    
}
