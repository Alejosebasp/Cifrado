/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.*;
import java.io.*;
import data.Dato;

/**
 *
 * @author Estudiante
 */
public class Dao {
    
    public Dato desencriptar(Scanner sc){
        Dato d = new Dato();
        String tipo;
        String tipoEncriptado = sc.next().trim();
        tipo = (tipoEncriptado);
        
        return d;
    }
    
    public ArrayList<Dato> cargarDatos() throws FileNotFoundException{
        ArrayList<Dato> datos = new ArrayList<>();
        Scanner sc;
        
        sc = new Scanner(new File("datos"));
        sc.useDelimiter(",");
        
        while (sc.hasNext()) {
            datos.add(desencriptar(sc));
        }
        
        return datos;
    }
}
