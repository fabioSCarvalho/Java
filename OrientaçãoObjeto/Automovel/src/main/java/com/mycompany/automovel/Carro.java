/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovel;

/**
 *
 * @author FABIO DE SOUZA
 */
public class Carro {
    public String marca;
    public String modelo;
    private boolean ligado;
    private String placa;
    private float velocidade;
    private double multa;
    
    public Carro() {
        this.velocidade = 0;
        this.ligado = false;
        this.multa = 0;
    }
    
   
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return ligado;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    
    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }
    public float getVelocidade(){
        return velocidade;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    
    
    public void liga(boolean liga){
        if(this.getLigado()){
            System.out.println("O carro ja esta ligado");
        }else{
            this.setLigado(true);
        }
    }
    
    public void desliga(){
        if(this.getLigado()){
            this.setLigado(false);
        }else{
            System.out.println("Ja esta desligado");
        }
    }
    
    public void AumentaVelocidade(float aumenta){
        if(this.getLigado()){
            this.setVelocidade(this.getVelocidade() + aumenta);
            System.out.println("Agora sua velocidade é " + this.getVelocidade());
        }
    }
    
    public void multas(){       
        if (this.getLigado()){
            if (this.getVelocidade() > 50){
              this.setMulta(this.getMulta() + (10 * (this.getVelocidade() - 50)));
              System.out.println("Você recebeu uma multa de R$");
            }else{
                System.out.println("DEntro do limite de velocidade");
            }
        }else{
            System.out.println("Carro desligado");
        }
    }
    
    public void situacao(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.getMarca());
        System.out.println("placa: " + this.getPlaca());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Estado: " + this.getLigado());
        System.out.println("Multas: " + this.getMulta());
    }
            

}
