package com.mycompany.aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Qual o modelo? " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
        
    
    void rabiscar(){
        if (this.tampada == true) {
            System.err.println("Erro! Não posso rabiscar");
       }else{
            System.err.println("Estou rabiscando");
        }
    }


    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}