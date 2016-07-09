/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadex;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lipe
 */
public class Estoque {
    
    private ArrayList <Item> estoque;

    public Estoque() {
        this.estoque = new ArrayList();
    }

    public List<Item> getEstoque() {
        return estoque;
    }
    
    public int insereProduto(int cod, int qtd){
        int temItem = 0;
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getItem().getCod() == cod){
                estoque.get(i).setQuantidade(qtd);
                temItem = 1;
                return temItem;
            }
        }
        return temItem;
    }
    public void insereNovoProduto(Mercado m, int cod, double p, String n, int qtd){
        Produto p1 = new Produto(cod, p, n);
        Item novo = new Item(p1, qtd);
        m.getProdutos().add(p1);
        m.getEstoque().getEstoque().add(novo);
        
    }
    
    public void imprimeEstoque(){
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println("--------------------------------");
            System.out.println("Itens de estoque: " + estoque.get(i).toString());
            System.out.println("--------------------------------");
            
        }
    }
    
    
    
    
}
