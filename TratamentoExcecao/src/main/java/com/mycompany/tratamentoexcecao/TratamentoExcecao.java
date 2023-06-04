/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tratamentoexcecao;

/**
 *
 * @author FABIO DE SOUZA
 */
public class TratamentoExcecao {

    public static void main(String[] args) {
      
      /*  diminuiletras ltpqn = new diminuiletras();
        ltpqn.lowCase();
       */
     try{
        diminuiletras ltpqn = new diminuiletras();
        ltpqn.lowcase();
     }catch(NullPointerException e){
         System.out.println("Excecão identidficada");
         System.out.println("metodo diminui letras tradado \n " + e );
     }
    }
}
