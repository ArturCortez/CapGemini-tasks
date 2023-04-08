/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.Scanner;
import ExerciciosJava_CapGemini.helpers.ParametersHelper;

/**
 *
 * @author Juca
 */
public class ValueSwap {
    public static String[] SwapStrVariables(){
        
        String header1 = "Digite o Valor da Variavel A";
        String header2 = "Digite o Valor da Variavel B";
        
        String[] strArray = ParametersHelper.strPopulateParameters(header1, header2);
        
        System.out.print("Antes da troca - variavel A: " + strArray[0]);
        System.out.println(" e variavel B:" + strArray[1]);
        String c = strArray[0];
        strArray[0] = strArray[1];
        strArray[1] = c;        
        
        return strArray;
    }
    
}
