package com.mycompany.automovel;

/**
 *
 * @author FABIO DE SOUZA
 */
public class Automovel {

    public static void main(String[] args) {
          Carro palio = new Carro();
          palio.setMarca("Fiat");
          palio.setModelo("palio weenked");
          palio.setPlaca("asv123");
          palio.liga(true);
          palio.AumentaVelocidade(60);
          palio.multas();
          palio.situacao();
          
          System.out.println("");
         
       
          
          
    }
}
