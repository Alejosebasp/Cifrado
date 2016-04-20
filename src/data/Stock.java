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
public class Stock extends ShareAsset{
    
    protected int totalShares;

    public Stock(int totalShares) {
        this.totalShares = totalShares;
    }

    @Override
    public double getMarketValue() {
        return totalShares*CurrentPrice;
    }
    
    @Override
    public double getProfit(){
        return ((totalShares)*(CurrentPrice))-(totalCost);
    }
    
}
