/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Stock extends ShareAsset{
    
    protected int totalShares;

    public Stock(String symbol, double totalCost, double CurrentPrice, int totalShares) {
        super(symbol, totalCost, CurrentPrice);
        this.totalShares = totalShares;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Tipo de asset: Stock,"+ " Symbol: "+symbol+", Total cost: "+totalCost
                +", Current price: "+CurrentPrice+ ", Total shares: " + totalShares;
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
