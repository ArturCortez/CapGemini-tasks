/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import ExerciciosJava_CapGemini.helpers.ParametersHelper;
import ExerciciosJava_CapGemini.helpers.CalculaTudo;

/**
 *
 * @author Juca
 */
public class InterestRate {
    public static String InterestRateCalculator(float baseRate){
        String header1 = ("Digite o valor do principal: ");
        
        String mainValue = ParametersHelper.SingleStrParameter(header1);
        float interestRate = 1.0f + baseRate;
        
        String[] arg = new String[]{String.valueOf(interestRate), mainValue};
        
        String answer = CalculaTudo.CalculateAll(arg, 1);
        
        return answer;
    }
    
    public static String Parcelation(){
    
        String header1 = ("Digite o valor total do produto: ");
        
        String totalValue = ParametersHelper.SingleStrParameter(header1);
        float parcela = (Float.parseFloat(totalValue))/5.0f;
        System.out.print("Em 5 parcelas de: ");
        return String.format("%.2f", parcela);
    }
    
    public static String AddMargin(){
        String header1 = ("Digite o valor de custo do produto: ");
        String header2 = ("Digite a margem do produto em porcentagem: ");
        
        String[] arg = ParametersHelper.strPopulateParameters(header1, header2);
        arg[1] = arg[1].split("%")[0];
        float floatMargin = Float.parseFloat(arg[1])/100.00f;
        float mainCost = Float.parseFloat(arg[0]);
        
        float finalPrice = mainCost * (1 + floatMargin);
        
        String answer = String.format("%.2f", finalPrice);
    
        return answer;
    }
    
    public static String AddMarginAndTaxes(){
        String header = ("Digite o valor de fábrica do veiculo: ");
        
        String arg = ParametersHelper.SingleStrParameter(header);
        
        arg = arg.replaceAll("[^\\d.]", "");
        float floatFactoryPrice = Float.parseFloat(arg);
        float addedTaxes = floatFactoryPrice * (1 + 0.45f);
        float finalPrice = addedTaxes * (1 + 0.28f);
        
        String answer = String.format("%.2f", finalPrice);
        System.out.print("Preco ao Consumidor: ");
        return answer;
    }
}


