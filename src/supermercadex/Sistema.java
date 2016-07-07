/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadex;

import java.util.Scanner;

/**
 *
 * @author Lipejota
 */
abstract class Sistema {

    public static void sistemaGerente() {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o seu nome:");
        String n = in.next();
        System.out.println("Entre com o seu id:");
        int id = in.nextInt();
        //criar autenticação//
        Gerente g = new Gerente(n, id);
        System.out.println("");
        System.out.println("Bem vindo " + n);
        System.out.println("");
            
        boolean sair = false;
        while(!sair) {
            System.out.println("1 - inserir um produto");
            System.out.println("2 - ver lista de produtos");
            System.out.println("3 - gerar relatório de vendas");
            System.out.println("4 - gerar relatório de estoque");
            System.out.println("5 - sair");
            System.out.println("");
            System.out.println("Entre com uma opção:");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    inserirNovoProduto(g);
                    break;
                case 2:
                    verListaDeProdutos();
                    break;
                case 3:
                    relatorioVendas();
                    break;
                case 4:
                    relatorioEstoque();
                    break;
                case 5:
                    System.out.println("Até logo, tenha um bom dia!");
                    sair = true;
                    break;
                default:
                    System.out.println("opcao inválida!");
                    break;
            }
        }
    }

    public static void sistemaFuncionário() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void sistemaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void preencheEstoque() {
        
    }

    public static void inserirNovoProduto(Gerente g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void verListaDeProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void relatorioVendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void relatorioEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void iniciaSistema() {
        //recebe um arquivo Mercado.txt como parâmetro//
        Scanner in = new Scanner(System.in);
        Mercado mercado = new Mercado("Mercadex", 1, 5, 0);
        int option;
        
        System.out.println("Bem vindo ao " + mercado.getNome());
        System.out.println("");
        System.out.println("1 - Gerente");
        System.out.println("2 - Funcionário");
        System.out.println("3 - Cliente");
        System.out.println("");
        System.out.println("Escolha uma opção:");
        option = in.nextInt();
        
        switch (option) {
            case 1:
                sistemaGerente();
                break;
            case 2:
                sistemaFuncionário();
                break;
            case 3:
                sistemaCliente();
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }
    }
}
