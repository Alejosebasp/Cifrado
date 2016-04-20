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
public class DividentStock extends Stock{
    
    protected double dividends;

    public DividentStock(double dividends, int totalShares) {
        super(totalShares);
        this.dividends = dividends;
    }
    
    @Override
    public double getMarketValue(){
        
        return dividends+getMarketValue();
    }

    @Override
    public double getProfit() {
        return ((totalShares)*(CurrentPrice))-(totalCost);
    }
    
    
}
