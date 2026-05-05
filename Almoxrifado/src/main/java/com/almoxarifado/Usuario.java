/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almoxarifado;

/**
 *
 * @author aluno
 */
public class Usuario {
    private int idUsuario;
    private String login;
    private String senha;
    private boolean perfil;
    
    public int getIdUsuario(){
        return idUsuario;
    }
    
    public void setIdUsuario(int _idUsuario){
        idUsuario = _idUsuario;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin (String _login){
        login = _login;
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
