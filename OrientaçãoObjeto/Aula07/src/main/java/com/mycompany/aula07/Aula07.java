/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula07;

/**
 *
 * @author FABIO DE SOUZA
 */
public class Aula07 {

    public static void main(String[] args) {
       Lutador l[] = new Lutador[6]; 
       l[0] = new Lutador("petty boy","França",31, 1.75f,68.9f,11,2,1);
       l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 080.9f, 12, 2, 1);
       l[3] = new Lutador("dead code", "australia", 28, 1.93f, 81.6f, 13, 0, 2);
       l[4] = new Lutador("UFCobol", "BRasil", 37, 1.70f, 119.3f, 5, 4, 3);
       l[5] = new Lutador("nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
               
    
       luta uec = new luta();
       uec.marcarLut(l[1],l[5]);
       uec.lutar();
       
      
    }
}
