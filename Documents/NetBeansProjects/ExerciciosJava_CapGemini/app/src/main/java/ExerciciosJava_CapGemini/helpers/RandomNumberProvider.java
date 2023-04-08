/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.*;
import ExerciciosJava_CapGemini.helpers.PessoaClass;



/**
 *
 * @author Juca
 */
public class RandomNumberProvider {
    
    public static int RandomSingleNumberCreator(){
        double answer = 1 * (Math.random());
        answer = Math.round(answer);
        
        return (int)answer;
    }
    
    public static int RandomSingleNumberCreator(float factor){
        double answer = factor * (Math.random());
        answer = Math.round(answer);
        
        return (int)answer;
    }
 
    public static List<Integer> RandomMultipleNumberGenerator(int times, int factor){
        
        List<Integer> numberList = new ArrayList<Integer>();    
              
        try{
            for(int i = 0; i < times; i++){
                numberList.add( RandomSingleNumberCreator(factor));
            }
            
            return numberList;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: the array is empty!");
        }
            
        return numberList;
    }
    
    
    public static int ReadNumberAndClassify(List<Integer> arrList, int min, int max){
        
        int count = 0;
        
        for (int Element : arrList){
            if(Element >= min && Element <= max){
                count++;                
            }
            else {
                System.out.println("Element out of interval: " + Element);
            }
        }
        
        return count;
    }
    
    
    public static int randomNumberArrayAndFilter(int times, int min, int max, int factor){
        List<Integer> arr = RandomMultipleNumberGenerator(times, factor);
        System.out.println(arr);
        return ReadNumberAndClassify(arr, min, max);
        
    }
    
    public static List<PessoaClass> PeopleListGenerator(int times, int idadeMaioridade, int factor){
        List<PessoaClass> pessoaList = new ArrayList<PessoaClass>();
        
        try{
            for(int i = 0; i < times; i++){
                
                PessoaClass pessoa = new PessoaClass();
                pessoa.setAge(RandomSingleNumberCreator(factor));
                pessoa.setId(i);
                pessoa.setName(String.valueOf(pessoa.getId()));
                pessoa.setMaioridade(idadeMaioridade);
                
                if((Math.random() > 0.5f) ){
                    pessoa.setGender("feminino");
                } else {
                    pessoa.setGender("masculino");
                }
                
                pessoaList.add(pessoa );
            }
            
            return pessoaList;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: the array is empty!");
        }
        return null;
    }
    
    
   
}


