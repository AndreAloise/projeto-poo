/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadex;

/**
 *
 * @author lipe
 */
public class Produto {
    private int cod;
    private double preco;
    private String nome;
    
    public Produto(int c, double p, String n){
        cod = c;
        preco = p;
        nome = n;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "cod=" + cod + ", preco=" + preco + ", nome=" + nome + '}';
    }
    
    
}
