/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import ExerciciosJava_CapGemini.helpers.ParametersHelper;

/**
 *
 * @author Juca
 */
public class numberComparison {
    
    public static String underTen(){
        
        String header = ("Digite o numero a ser avaliado");
        String compareToTen = ParametersHelper.SingleStrParameter(header);
        float floatNumberToCompare = Float.parseFloat(compareToTen);
        
        if (floatNumberToCompare > 10.0f){
            return ("Esse número é maior que 10.");
        }
        
        return null;
    }
    
    public static String integerCompare(){
        String header1 = ("Digite o primeiro numero inteiro");
        String header2 = ("Digite o segundo numero inteiro");
        
        String[] arg = ParametersHelper.intPopulateParameters(header1, header2);
        
        float firstNumber = Float.parseFloat(arg[0]);
        float secondNumber = Float.parseFloat(arg[1]);
        
        if(firstNumber > secondNumber ){
            return arg[0];
        } else if(firstNumber < secondNumber) {
            return arg[1];
            }
        
        return null;
    }
    
    public static String betweenHundreds(){
        
        String header = ("Digite o numero a ser avaliado");
        String compareToHundreds = ParametersHelper.SingleStrParameter(header);
        
        float numberToCompare = Float.parseFloat(compareToHundreds);
        
        if(numberToCompare > 100 && numberToCompare < 200){
            return "number between 100 and 200";
        }
        
        return "number not between 100 and 200";
    }
}
