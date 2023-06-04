/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05;

/**
 *
 * @author FABIO DE SOUZA
 */
public class Aula05 {

    public static void main(String[] args) {
      
       ContaBanco p1 = new ContaBanco();   
       p1.setNumConta(111);
       p1.setDono("Fábio");
       p1.abrirConta("cc");
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(222);
       p2.setDono("eliene");
       p2.abrirConta("cp");
       
      
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(100);
       p1.sacar(150);
       p1.fecharConta();
               
       p2.estadoAtual();
       p1.estadoAtual();
    }
}
