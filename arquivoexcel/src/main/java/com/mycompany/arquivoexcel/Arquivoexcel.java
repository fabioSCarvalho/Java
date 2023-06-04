/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arquivoexcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author FABIO DE SOUZA
 */
public class Arquivoexcel {
    public final String delimitador_pontoEvirgula = ',';
    public final String delimitador_virgula = ',';
    public static void main(String[] args) {
        Arquivoexcel  csv = new Arquivoexcel();
        List<List<String>> registroDados = csv.leitura();
        csv.imprimeDados(registroDados);
    }
    public List<List<String>> leitura(){
        List<List<String>> registroDados = new ArrayList<>();
        try {
            File arquivo = new File("C:/Users/FABIO DE SOUZA/Documents/TesteExcel.csv");
            Scanner arquivo = new Scanner(arquivo);
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                registroDados.add(getRegistroDaLinha(linha));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro abertura do arquivo: %s.%n",
                    ex.getMessage());
            System.exit(0);
        }
        return registroDados;
    }
}
