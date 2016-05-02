/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Asset;
import java.io.IOException;
import java.util.*;
import servicios.Servicio;
import dao.Dao;
import java.io.FileNotFoundException;
        
/**
 * @author Estudiante
 */
public class UI {
    private Servicio servicio;

    public UI() {
        servicio = new Servicio();
    }
    
    
    
    public void menu() throws IOException, FileNotFoundException{
        Scanner leer = new Scanner(System.in);
        int desicion = 0;
        ArrayList <Asset> assets = new ArrayList<>();
        
        do {
           System.out.println("Seleccione una opcion para continuar:"
           +"\n1. Para cargar y desencriptar la informacion."
           +"\n2. Para imprimir los assets's"
           +"\n3. Para conocer el valor total de todas las stock"
           +"\n4. Para determinar el valor total en el mercado de todos los assets"
           +"\n5. Para determinar el beneficio total de todos los asset's"
           +"\n0. Para salir");
           
           desicion = Integer.valueOf(leer.next());
           
           switch (desicion){
                case 1:
                    assets = servicio.crearClases();
                    System.out.println("La informacion se ha desencriptado y cargado con exito.");
                   break;
                case 2:
                    for (Asset asset : assets) {
                        System.out.println(asset.toString());
                    }
                    break;
                case 3:
                    servicio.valorTotalMercadoGOOGLE(assets);
                    break;
                case 4:
                    servicio.valorTotalMercado(assets);
                    break;
                case 5:
                    servicio.valorBeneficio(assets);
                    break;
           }
           
        } while (desicion != 0);
        
        
    }
}
