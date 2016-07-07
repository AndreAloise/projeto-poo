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
    
    private List <Item> estoque;

    public Estoque() {
        this.estoque = new ArrayList();
    }

    public List<Item> getEstoque() {
        return estoque;
    }
    
    public void insereProduto(Item novo){
        boolean temItem = false;
        for (int i = 0; i < estoque.size(); i++) {
            if(estoque.get(i).getItem().getCod() == novo.getItem().getCod()){
                estoque.get(i).setQuantidade(estoque.get(i).getQuantidade()+novo.getQuantidade());
                temItem = true;
            }
        }
        if(temItem==false){
            estoque.add(novo);
        }
    }
    
    public void imprimeEstoque(){
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(estoque.get(i).toString());
        }
    }
    
    
    
    
}
