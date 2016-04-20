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
public class MutualFund extends ShareAsset{
    
    protected double totalShares;

    public MutualFund(double totalShares) {
        this.totalShares = totalShares;
    }
    
    @Override
    public double getMarketValue(){
        return totalShares*CurrentPrice;
    }

    @Override
    public double getProfit() {
        return ((totalShares)*(CurrentPrice))-(totalCost);
    }
    
    
}
