/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author FABIO DE SOUZA
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this. getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-------------");
        
    }
    
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
       
    public void setNumConta(int num){
        this.numConta = num;

    }   
    public int getNumConta(){
        return numConta;
    }
    
    
    public void setTipo(String t){
        this.tipo = t;
    }  
    public String getTipo(){
        return tipo;
    }
    
    
    public void setDono(String d){
        this.dono = d;
    }   
    public String getDono(){
        return dono;
    }
    
    
    public void setSaldo(double s){
        this.saldo = s;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return status;
    }
    
    
    public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
        if(t == "cc") {
            this.setSaldo(50.00);
        } else if (t == "cp") {
                this.setSaldo(150.00);          
        }   
        System.out.println("Conta abesta com sucesso");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("conta com dinehito");
        }else if(this.getSaldo() < 0){
            System.out.println("conta está em débito");  
        }else{
            setStatus(false);
            System.out.println("Conta fechada");
        }
    }
  
    public void depositar(double v){
        if (status == true) {
           this.setSaldo(this.getSaldo() + v);
           System.out.println("DEposito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("impossivel depositar em um conta fechada");
        }  
    }   
   
    public void sacar(double v){
        if (status == true) {
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }   
   
    public void pagarMensal(){
      int v = 0;
        if(this.getTipo() == "cc"){
            v = 12;
        }else if(this.getTipo() == "cp"){
            v = 20;
        }
        if(status == true){
            if(saldo > v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Mensalidade paga com sucesso");
            }else{
                 System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("impossivel pagar de um conta fechada");
        }
        
    
    
    }
}



