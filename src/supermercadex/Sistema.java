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
public class Sistema {

    public Sistema() {
    }
    
    public void sistemaGerente(Mercado m) {
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
            System.out.println("|-------------------------------|");
            System.out.println("               MENU              ");
            System.out.println("|-------------------------------|");
            System.out.println("");
            System.out.println("1 - inserir um produto");
            System.out.println("2 - cadastrar um novo produto");
            System.out.println("3 - ver lista de produtos");
            System.out.println("4 - gerar relatório de vendas");
            System.out.println("5 - gerar relatório de estoque");
            System.out.println("6 - sair");
            System.out.println("");
            System.out.println("Entre com uma opção:");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    inserirProduto(m);
                    break;
                case 2:
                    inserirNovoProduto(m);
                    break;
                case 3:
                    verListaDeProdutos(m);
                    break;
                case 4:
                    relatorioVendas();
                    break;
                case 5:
                    relatorioEstoque();
                    break;
                case 6:
                    System.out.println("Até logo, tenha um bom dia!");
                    sair = true;
                    break;
                default:
                    System.out.println("opcao inválida!");
                    break;
            }
        }
    }

    public void sistemaFuncionário(Mercado m) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o seu nome:");
        String n = in.next();
        System.out.println("Entre com o seu id:");
        int id = in.nextInt();
        //criar autenticação//
        Funcionario f = new Funcionario(n, id);
        System.out.println("");
        System.out.println("Bem vindo " + n);
        System.out.println("");
            
        boolean sair = false;
        while(!sair) {
            System.out.println("1 - realizar venda");
            System.out.println("2 - cadastrar cliente");
            System.out.println("3 - sair");
            System.out.println("");
            System.out.println("Entre com uma opção:");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    realizaVenda(f);
                    break;
                case 2:
                    cadastraCliente();
                    break;
                case 3:
                    System.out.println("Até logo, tenha um bom dia!");
                    sair = true;
                    break;
                default:
                    System.out.println("opcao inválida!");
                    break;
            }
        }
        
    }

    public void sistemaCliente(Mercado m) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Bem vindo Cliente!");
        System.out.println("");
        boolean sair = false;
        while(!sair) {
            System.out.println("1 - consultar preco de produto");
            System.out.println("2 - sair");
            System.out.println("");
            System.out.println("Entre com uma opção:");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    consultaPreco(m);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Até logo, tenha um bom dia!");
                    sair = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("opcao inválida!");
                    System.out.println("");
                    break;
            }
        }
        
        
        
        
    }
    public void consultaPreco(Mercado m){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o código do produto: ");
        int cod = in.nextInt();
        double preco;
        for (int i = 0; i < m.getEstoque().getEstoque().size(); i++) {
            if(m.getEstoque().getEstoque().get(i).getItem().getCod()==cod){
                preco=m.getEstoque().getEstoque().get(i).getItem().getPreco();
                System.out.println("o preço do produto é: " + preco);
                System.out.println("");
            }
            else{
                System.out.println("Código inválido!");
                System.out.println("");
            }
            
        }
    }

    public void inserirProduto(Mercado m) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o código do produto: ");
        int cod = in.nextInt();
        System.out.println("Entre com a quantidade do produto: ");
        int n = in.nextInt();
        if(m.getEstoque().insereProduto(cod, n)==1){
            System.out.println("Produto inserido com sucesso!");
            System.out.println("");
        } else {
            System.out.println("Produto não cadastrado!");
            System.out.println("");
            inserirNovoProduto(m);
        }
        
        
    }
    
    public boolean inserirNovoProduto(Mercado m) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o código do produto: ");
        int cod = in.nextInt();
        for (int i = 0; i < m.getProdutos().size(); i++) {
            if(cod == m.getProdutos().get(i).getCod()){
                System.out.println("");
                System.out.println("Produto já está cadastrado!");
                System.out.println("");
                return false;
            }
            
        }
        System.out.println("Entre com o preco da unidade/kg do produto: ");
        double preco = in.nextDouble();
        System.out.println("Entre com o nome do produto: ");
        String n = in.next();
        System.out.println("Entre com a quantidade do produto");
        int qtd = in.nextInt();
        m.getEstoque().insereNovoProduto(m, cod, preco, n, qtd);
        System.out.println("");
        System.out.println("Produto inserido com sucesso!");
        System.out.println("");
        
        return true;
    }

    public void verListaDeProdutos(Mercado m) {
        m.getEstoque().imprimeEstoque();
    }

    public void relatorioVendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void relatorioEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void iniciaSistema(Mercado mercado) {
        //recebe um arquivo Mercado.txt como parâmetro//
        Scanner in = new Scanner(System.in);
        
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
                sistemaGerente(mercado);
                break;
            case 2:
                sistemaFuncionário(mercado);
                break;
            case 3:
                sistemaCliente(mercado);
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }
    }

    private void realizaVenda(Funcionario f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cadastraCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
