/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

/**
 *
 * @author aluno
 */
public class Localizacao {
    private int idLocalizacao;
    private String descricao;
    private String setor;
    
    public int getIdLocalizacao(){
        return idLocalizacao;
    }
    
    public void setIdLocalizacao(int _idLocalizacao){
        idLocalizacao = _idLocalizacao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String _descricao){
        descricao = _descricao;
    }
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String _setor){
        setor = _setor;
    }
}
