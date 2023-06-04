/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.abrirarquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author FABIO DE SOUZA
 */
public class Abrirarquivo {

    public static void main(String[] args) {
        try{
           File arquivo = new File("C:/Users/FABIO DE SOUZA/Documents/teste.txt");
           Scanner scanner = new Scanner(arquivo);
           while (scanner.hasNextLine()){
                String linha = scanner.nextLine();
                System.out.printf("%s%n", linha);
            }
        }catch(FileNotFoundException ex){
            System.out.printf("Erro abertura do arquivo: %s %n", ex.getMessage());
        }
    }
}
