/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.*;
import java.lang.Number;
import java.math.*;

/**
 *
 * @author Juca
 */
public class NumberArgumentObject {                
                    
    float arg1 = 0;
    float arg2 = 0;  

    public void setArg(float value1, float value2){
        arg1 = value1;
        arg2 = value2;
    }

    public float getArg1(){
        return arg1;
    }
    
    public float getArg2(){
        return arg2;
    }
  
    public static int allEvalNumber(Number equalsTo, Number lessThan, Number greaterThan){
        Number evalNumber = NumberArgumentObject.askNumberReturnNumber();
        
        if (Objects.isNull(evalNumber)){
            System.out.println("error. Object cannot be null!");
            return 1;
        }
        
        if (evalNumber.equals(equalsTo)){
            return 2;
            //System.out.println(evalNumber.floatValue() + " numero igual a " + equalsTo.floatValue());
        } else if (evalNumber.floatValue() > greaterThan.floatValue()){
            return 3;
            //System.out.println(evalNumber.floatValue() + " numero maior que " + greaterThan.floatValue());
        } else if (evalNumber.floatValue() < lessThan.floatValue()){
            return 4;
            //System.out.println(evalNumber.floatValue() + " numero menor que " + lessThan.floatValue());
        } else {
            System.out.println(evalNumber.floatValue() + " numero nao encaixou em nenhum filtro");
            return 5;
        }
    }
    
     public static int allEvalNumberNoAsk(Number evalNumber ,Number equalsTo, Number lessThan, Number greaterThan){
        
        
        if (Objects.isNull(evalNumber)){
            System.out.println("error. Object cannot be null!");
            return 1;
        }
        
        if (evalNumber.equals(equalsTo.floatValue())){
            return 2;
            //System.out.println(evalNumber.floatValue() + " numero igual a " + equalsTo.floatValue());
        } else if (evalNumber.floatValue() > greaterThan.floatValue()){
            return 3;
            //System.out.println(evalNumber.floatValue() + " numero maior que " + greaterThan.floatValue());
        } else if (evalNumber.floatValue() < lessThan.floatValue()){
            return 4;
            //System.out.println(evalNumber.floatValue() + " numero menor que " + lessThan.floatValue());
        } else {
            System.out.println(evalNumber.floatValue() + " numero nao encaixou em nenhum filtro");
            return 5;
        }
    }
       
    
    public static Number askNumberReturnNumber(){
        
        Scanner leitor = new Scanner(System.in);
        Number answer = 0;
        
        try{
        System.out.println("Digite um numero");    
        answer = leitor.nextFloat();
        return answer;
        }
        catch (Exception e){
            System.out.println("Error. Try Again");
            
            return null;
        }
    }
    
    public static List<Number> askAnyNumbersReturnNumberList(int times, List<Number> numberList){
        
        Scanner leitor = new Scanner(System.in);
        Number answer = 0;

        
        
        try{
            System.out.println("Digite um número");    
            answer = leitor.nextFloat();
            numberList.add(answer);
            times -= 1;
            System.out.println("times now is: " + times);
            if(times == 0){
                return numberList;
            } else {
                return askAnyNumbersReturnNumberList(times, numberList);
            }
            
        }
        catch (Exception e){
            System.out.println("Error. Try Again");
            
            return null;
        }
    }
    
    public static String CompareTwoNumbers(Number firstNumber, Number secondNumber){
        
        BigDecimal firstN = new BigDecimal(firstNumber.floatValue());
        BigDecimal secondN = new BigDecimal(secondNumber.floatValue());
        
        if(firstN.compareTo(secondN) == 0){
            return "numeros iguals";
        } else if (firstN.compareTo(secondN) == -1){
            System.out.println("Numeros sao diferentes.\n Mostrando maior numero.");
            return secondN.toString();
        } else {
            System.out.println("Numeros sao diferentes.\n Mostrando maior numero.");
            
            return firstN.toString();
        }
    }
    
    public static String NumberExtense(Number digitNumber){
        List<String> letterNumberList = new ArrayList<>(Arrays.asList("numero invalido", "one", "two", "three", "four", "five", "numero invalido"));
        
        try {
          String answer = letterNumberList.get(digitNumber.intValue());
          System.out.println(answer);
          return answer;
        } catch (Exception e){
          System.out.println("numero invalido");
          return null;
        }
             
    }
    
    
    
}
