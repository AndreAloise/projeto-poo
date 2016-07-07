/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadex;

/**
 *
 * @author Lipejota
 */
public class Gerente extends Pessoa{
    
    public Gerente(String n, int id) {
        nome = n;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void insereProduto(Estoque estoque, Item novo){
        boolean temItem = false;
        for (int i = 0; i < estoque.getEstoque().size(); i++) {
            if(estoque.getEstoque().get(i).getItem().getCod() == novo.getItem().getCod()){
                estoque.getEstoque().get(i).setQuantidade(estoque.getEstoque().get(i).getQuantidade()+novo.getQuantidade());
                temItem = true;
            }
        }
        if(temItem==false){
            estoque.getEstoque().add(novo);
        }
    }
    
}
