/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

import java.util.Date;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Movimentacao {
   private int idMovimentacao;
    private String tipo;
    private int quantidade;
    private Date dataHora;
    private Item item;
    private Usuario user;
    
    public int getIdMovimentacao(){
        return idMovimentacao;
    }
    
    public void setIdMovimentacao(int _idMovimentacao){
        idMovimentacao = _idMovimentacao;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo (String _tipo){
        tipo = _tipo;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int _quantidade){
       quantidade = _quantidade;
    }
    
    public Date getDataHora(){
        return dataHora;
    }
    
    public void setDataHora(Date _dataHora){
        dataHora = _dataHora;
    }
    
    public Item getItem(){
        return item;
    }
    
    public void setItem(Item _item){
        item = _item;
    }
    
    public Usuario getUser(){
        return user;
    }
    
    public void setUser(Usuario _user){
        user = _user;
    }
}
