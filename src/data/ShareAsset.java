/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Estudiante
 */
public abstract class ShareAsset implements Asset{
    
    protected String symbol;
    protected double totalCost;
    protected double CurrentPrice;
    
    public double getProfit(){
        
        return 0;
    }
}
