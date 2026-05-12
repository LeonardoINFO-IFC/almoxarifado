/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

/**
 *
 * @author aluno
 */
public class Categoria {
    private int idCategoria;
    private String nome;
    private String descricao;
    
    public int getIdCategoria(){
        return idCategoria;
    }
    
    public void setIdCategoria(int _idCategoria){
        idCategoria = _idCategoria;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome (String _nome){
        nome = _nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String _descricao){
        descricao = _descricao;
    }
}
