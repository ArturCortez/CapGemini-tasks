package ExerciciosJava_CapGemini.helpers;


/**
 * baseado no exercício 1 - Logica de Programação III - Start CapGemini
 * @author Juca
 */

import java.util.Scanner;

public class CalculaTudo {
    
    
   public static String CalculateSum (String args[]) {
       
       float primeiroValor = Float.parseFloat(args[0]);
       float segundoValor = Float.parseFloat(args[1]);
       float totalSoma = primeiroValor + segundoValor;
       System.out.println("Primeiro valor = " + primeiroValor);
       System.out.println("Segundo valor = " + segundoValor);
       
       return ("Valor da soma: " + totalSoma);              
   }
    
    public static String CalculateAll (String args[], int operationType){
        
       float primeiroValor = Float.parseFloat(args[0]);
       float segundoValor = Float.parseFloat(args[1]);
       
       switch(operationType){
           case 1:
               float totalSoma = primeiroValor + segundoValor;
               return String.valueOf(totalSoma);
           case 2:
               float totalSub = primeiroValor - segundoValor;
               return String.valueOf(totalSub);
           case 3:
               float totalMult = primeiroValor * segundoValor;
               return String.valueOf(totalMult);
           case 4:
               float totalDiv = primeiroValor / segundoValor;
               return String.format("%.2f",totalDiv);
           case 5:
               int primeiroInt = (int) Math.round(primeiroValor);
               int segundoInt = (int) Math.round(segundoValor);
               int totalResto = primeiroInt % segundoInt;
               return String.valueOf(totalResto);
       }
        return "end of CalculateAll";
    }
    
}
