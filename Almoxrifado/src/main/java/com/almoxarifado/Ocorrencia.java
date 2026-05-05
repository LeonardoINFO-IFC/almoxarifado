/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Ocorrencia {
    private int idOcorrencia;
    private String tipo;
    private Date data;
    private int hora;
    private String local;
    private String descricao;
    private String status;
    private String sinistro;
    private String prioridade;
    
    public int getIdOcorrencia(){
        return idOcorrencia;
    }
    
    public void setIdOcorrencia(int _idOcorrencia){
        idOcorrencia = _idOcorrencia;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String _tipo){
        tipo = _tipo;
    }
    
    public Date getData(){
        return data;
    }
    
    public void setData(Date _data){
       data = _data;
    }
    
    public int getHora(){
        return hora;
    }
    
    public void setHora(int _hora){
        hora = _hora;
    }

    public String getLocal(){
        return local;
    }
    
    public void setLocal(String _local){
        local = _local;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String _descricao){
        descricao = _descricao;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String _status){
        status = _status;
    }
    
    public String getSinistro(){
        return sinistro;
    }
    
    public void setSinistro(String _sinistro){
        sinistro = _sinistro;
    }
    
    public String getPrioridade(){
        return prioridade;
    }
    
    public void setLocalizacao(String _prioridade){
        prioridade = _prioridade;
    }
    
}
