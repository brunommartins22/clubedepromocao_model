
package br.com.interagese.util;

public class CalcUtil {
    
    public static double lucro(double precoDeVenda, double precoDeCusto){
        return (((precoDeVenda * 100.0)/precoDeCusto) - 100);
    }
    
    public static double percentagem(double fracao, double total){
        return ((fracao * 100.0)/total);
    }
    
    public static double valorDaPercentagem(double valor, double percentagem){
        return ((percentagem * valor)/100);
    }
    
}
