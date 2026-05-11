/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

/**
 *
 * @author aluno
 */
public class Fornecedor {
    private int idFornecedor;
    private String nome;
    private int senha;
    private boolean perfil;
    
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
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String _senha){
       senha = _senha;
    }
    
    public boolean getPerfil(){
        return perfil;
    }
    
    public void setPerfil(boolean _perfil){
        perfil = _perfil;
    }
}
