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
public class CelsiusFahrenheitConverter1 {
    public static String CelsiusToFahrenheit(){
    
    String header1 = ("Digite o valor em Celsius: ");    
        
    float valueCelsius = Float.parseFloat(ParametersHelper.SingleStrParameter(header1));
    float valueFahrenheit = ((9 * valueCelsius) + 160)/5;
    
    String answer = String.format("%.2f" ,valueFahrenheit);
    return answer;
    }
    
    public static String FahrenheitToCelsius(){
    
    String header1 = ("Digite o valor em Fahrenheit: ");    
        
    float valueFahrenheit = Float.parseFloat(ParametersHelper.SingleStrParameter(header1));
    float valueCelsius = ((valueFahrenheit * 5) -160)/9;
   
    
    String answer = String.format("%.2f" ,valueCelsius);
    return answer;
    }
    
    
    
}
