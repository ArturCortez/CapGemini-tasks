package ExerciciosJava_CapGemini.helpers;


/**
 * baseado no exercício 1 - Logica de Programação III - Start CapGemini
 * @author Juca
 */

import java.util.Scanner;

public class CalculaSoma {
    
    
   public static String CalculateSum (String args[]) {
       
       float primeiroValor = Float.parseFloat(args[0]);
       float segundoValor = Float.parseFloat(args[1]);
       float totalSoma = primeiroValor + segundoValor;
       System.out.println("Primeiro valor = " + primeiroValor);
       System.out.println("Segundo valor = " + segundoValor);
       
       return ("Valor da soma: " + totalSoma);
        
       
   }
    
    
    
}
