package com.mycompany.aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Qual o modelo? " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
        
    
    public void rabiscar(){
        if (this.tampada == true) {
            System.err.println("Erro! Não posso rabiscar");
       }else{
            System.err.println("Estou rabiscando");
        }
    }


    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}