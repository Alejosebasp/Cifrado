/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.Dao;
import data.Asset;
import java.io.*;
import java.util.*;
import data.Cash;
import data.DividentStock;
import data.Stock;

/**
 *
 * @author Estudiante
 */
public class Servicio {
    
    Dao dao;
    ArrayList <String> datos;
    ArrayList <Asset> assets;

    public Servicio() {
        dao = new Dao();
        datos = new ArrayList<>();
        assets = new ArrayList<>();
    }
    
    public ArrayList<Asset> crearClases() throws IOException, NullPointerException, FileNotFoundException{
        
        datos = dao.cargarDatos();
        
        for (int i =0; i<datos.size(); i++) {
            
            if (datos.get(i).equals("CASH")){
                double amoun = Double.valueOf(datos.get(i+1));
                Cash cahs = new Cash(amoun);
                assets.add(cahs);
            }
            
            else if (datos.get(i).equals("STOCK")) {
                String symbol = datos.get(i+1);
                double totalCost = Double.valueOf(datos.get(i+2));
                double currentPrice = Double.valueOf(datos.get(i+3));
                int totalShares = Integer.valueOf(datos.get(i+4));
                Stock stock = new Stock(symbol, totalCost, currentPrice, totalShares);
                assets.add(stock);
            }
            
            else if (datos.get(i).equals("DIVSTOCK")) {
                String symbol = datos.get(i+1);
                double totalCost = Double.valueOf(datos.get(i+2));
                double currentPrice = Double.valueOf(datos.get(i+3));
                int totalShares = Integer.valueOf(datos.get(i+4));
                double dividens = Double.valueOf(datos.get(i+5));
                DividentStock divident = new DividentStock(symbol, totalCost, currentPrice, totalShares, dividens);
                assets.add(divident);
            }
        }
        return assets;
    }
    
    public double valorTotalMercadoGOOGLE(ArrayList <Asset> assets){
                
        for (int i = 0; i < assets.size(); i++) {
            
            if (assets.get(i) instanceof DividentStock){
                DividentStock divident= (DividentStock)(assets.get(i));
                if (divident.getSymbol().equals("SAMSUMG") || divident.getSymbol().equals("GOOGLE")) {
                    System.out.println("El valor de mercado para el dividentstock "+i+" es: "+divident.getMarketValue());
                }
            }
            else if (assets.get(i) instanceof Stock) {
                Stock stock = (Stock)(assets.get(i));
                if (stock.getSymbol().equals("GOOGLE") || stock.getSymbol().equals("SAMSUMG")) {
                    System.out.println("El valor de mercado para el stock "+i+" es: "+stock.getMarketValue());
                }
            }
        }
        return 0;
    }
    
    public void valorTotalMercado(ArrayList <Asset> assets){
        double suma = 0;
        
        for (int i = 0; i < assets.size(); i++) {
            double valor = assets.get(i).getMarketValue();
            System.out.println("El valor de mercado para el asset "+i+" es: "+valor);
            suma += valor;
        }
        System.out.println("La suma del valor de mercado de todos los assets es: "+suma);
    }
    
    public void valorBeneficio(ArrayList <Asset> assets){
        double suma =0;
        
        for (int i = 0; i < assets.size(); i++) {
            double valor = assets.get(i).getProfit();
            System.out.println("El beneficio para el asset "+i+" es: "+valor);
            suma += valor;
        }
        System.out.println("La suma del beneficio de todos los assets es: "+suma);
    }
}