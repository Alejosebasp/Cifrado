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

    public DividentStock(String symbol, double totalCost, double CurrentPrice, int totalShares, double dividens) {
        super(symbol, totalCost, CurrentPrice, totalShares);
        this.dividends = dividens;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Tipo de asset: DividentStock,"+ " Symbol: "+symbol+", Total cost: "+totalCost
                +", Current price: "+CurrentPrice+ ", Total shares: " + totalShares+", Dividens: "+dividends;
    }
    
    @Override
    public double getMarketValue(){
        double a = (totalShares*CurrentPrice)+dividends;
        return a;
    }

    @Override
    public double getProfit() {
        return ((totalShares)*(CurrentPrice))-(totalCost);
    }
    
    
}
