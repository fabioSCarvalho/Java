/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template= */
package com.mycompany.tratamentoexcecao;
import javax.swing.JOptionPane;

public class diminuiletras {
   
    public static void lowcase() throws NullPointerException{
    
        String word = null;
        String newWord = null;
        
        word = JOptionPane.showInputDialog(null, "Digite um nome: ");
        
        newWord = word.toLowerCase();
        System.out.println("A palavra é : " + word);
        System.out.println("A palavra corrigida é: " + newWord);
    }
}
