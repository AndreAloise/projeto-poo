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
 * @author Lipejota
 */
    class Mercado {
    
    private String nome;
    private Estoque estoque;
    private Gerente[] gerentes;
    private Funcionario[] funcionarios;
    private Caixa[] caixas;
    private List<Cliente> clientes;

    public Mercado(String nome, int g, int f, int c) {
        this.nome = nome;
        estoque = new Estoque();
        gerentes = new Gerente[g];
        funcionarios = new Funcionario[f];
        caixas = new Caixa[c];
        clientes = new ArrayList();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Gerente[] getGerentes() {
        return gerentes;
    }

    public void setGerentes(Gerente[] gerentes) {
        this.gerentes = gerentes;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Caixa[] getCaixas() {
        return caixas;
    }

    public void setCaixas(Caixa[] caixas) {
        this.caixas = caixas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
