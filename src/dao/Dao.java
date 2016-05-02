/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Asset;
import java.util.*;
import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Dao {
    
    public String desencriptar(String palabra) throws IOException, NullPointerException{
        
        char[] palabraDesencriptada = new char[10];
        int caracter = 0;
        
        for (int i = 0; i<palabra.length(); i++){
            char a = palabra.charAt(i);
            if ((a<=90 && a>=65)){
                caracter = 1;
                if (a<68){
                    a = (char)(a+26);
                }
                int b = (((a-65)-3)%26)+65;
                palabraDesencriptada[i] = (char)b;
            }
            else if (a<=57 && a>=48) {
                caracter =2;
            }
        }
        if (caracter==1) {
            return String.valueOf(palabraDesencriptada);
        }
        else if (caracter==2){
            return palabra;
        }
        return " ";
    }
    
    public ArrayList<String> cargarDatos() throws FileNotFoundException, IOException, NullPointerException{
        ArrayList<String> datos = new ArrayList<>();
        Scanner sc;
        
        sc = new Scanner(new File("datos.txt"));
        sc.useDelimiter(",");
        
        while (sc.hasNext()) {
            String a;
            a = desencriptar(sc.next()).trim();
            datos.add(a);
        }
        return datos;
    }
}