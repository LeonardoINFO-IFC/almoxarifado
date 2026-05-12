/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Fornecedor {
    private int idFornecedor;
    private String nome;
    private int numeroContato;
    private String cnpj;
    private List<Item> item = new ArrayList<Item>();
    
    public int getIdFornecedor(){
        return idFornecedor;
    }
    
    public void setIdFornecedor(int _idFornecedor){
        idFornecedor = _idFornecedor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String _nome){
        nome = _nome;
    }
    
    public int getNumeroContato(){
        return numeroContato;
    }
    
    public void setNumeroContato(int _numeroContato){
       numeroContato = _numeroContato;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String _cnpj){
        cnpj = _cnpj;
    }
    
    public List<Item> getItem(){
        return item;
    }
    
    public void setItem(List<Item> _item){
        item = _item;
    }
}
