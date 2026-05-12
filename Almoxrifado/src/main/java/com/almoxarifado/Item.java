/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.almoxarifado;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Item {
    private int idItem;
    private String nome;
    private String descricao;
    private String categoria;
    private String unidadeMedida;
    private int quantidadeAtual;
    private int quantidadeMin;
    private String localizacao;
    private boolean status; 
    private Categoria catego;
    private List<Movimentacao> movimentacao = new ArrayList<Movimentacao>();
    private Localizacao local; 
    
    public int getIdItem(){
        return idItem;
    }
    
    public void setIdItem(int _idItem){
        idItem = _idItem;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String _descricao){
       descricao = _descricao;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String _categoria){
        categoria = _categoria;
    }

    public String getUnidadeMedida(){
        return unidadeMedida;
    }
    
    public void setUnidadeMedida(String _unidadeMedida){
        unidadeMedida = _unidadeMedida;
    }
    
    public int getQuantidadeAtual(){
        return quantidadeAtual;
    }
    
    public void setQuantidadeAtual(int _quantidadeAtual){
        quantidadeAtual = _quantidadeAtual;
    }
    
    public int getQuantidadeMin(){
        return quantidadeMin;
    }
    
    public void setQuantidadeMin(int _quantidadeMin){
        quantidadeMin = _quantidadeMin;
    }
    
    public String getLocalizacao(){
        return localizacao;
    }
    
    public void setLocalizacao(String _localizacao){
        localizacao = _localizacao;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean _status){
        status = _status;
    }
    
    public Categoria getCatego(){
        return catego;
    }
    
    public void setCatego(Categoria _catego){
        catego = _catego;
    }
    
    public List<Movimentacao> getMovimentacao(){
        return movimentacao;
    }
    
    public void setMovimentacao(List<Movimentacao> _movimentacao){
        movimentacao = _movimentacao;
    }
    
    public Localizacao getLocal(){
        return local;
    }
    
    public void setLocal(Localizacao _local){
        local = _local;
    }
    
    public void criarItem(){
        
    }
    
    public void listarItem(){
         
    }
    
    public void atualizarItem(){
        
    }
    
    public void excluirItem(){
        
    }
    
    public void dadosInvalidos(){
     
    }
    
    public void naoNegativo(){
    
    }
    
    public void abaixoMin(){
    
    }
}