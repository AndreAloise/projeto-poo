/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadex;

import java.util.Scanner;

/**
 *
 * @author Filipe Lima
 */
class Supermercadex {

    public static Mercado mercado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ler arquivo mercado.txt e gerar o mercado
        String n = "Mercadex";
        int g = 1, f = 5, c = 3;
        mercado = new Mercado(n, g, f, c);
        Produto p1 = new Produto(1, 2.50, "Biscoito");
        Produto p2 = new Produto(2, 12.50, "Feijão");
        
        //inicia o sistema
        Sistema.iniciaSistema(mercado);
        
        
        
    }

    

   
    
}
