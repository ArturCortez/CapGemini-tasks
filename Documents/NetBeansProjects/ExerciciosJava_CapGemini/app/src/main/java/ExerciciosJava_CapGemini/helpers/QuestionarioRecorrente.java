/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;
import java.util.Scanner;
import ExerciciosJava_CapGemini.helpers.*;
import java.util.*;


/**
 *
 * @author Juca
 */



public class QuestionarioRecorrente {
    
    private String questEnunciado = "";
    private int questId = 0;
    private String comandoEncerrar = "n";
    
    public String getQuestEnunciado(){
       return this.questEnunciado;
    }
    
    public int getQuestId(){
        return this.questId;
    }
    
    public String getComandoEncerrar(){
        return this.comandoEncerrar;
    }
    
    public void setQuestEnunciado(String novoEnunciado){
        this.questId += 1;
        this.questEnunciado = novoEnunciado;
    }
    
    
    public static String SistemaPerguntaRecorrente(String printEnunciado){
        Scanner leitor = new Scanner(System.in);
        
        try {
            System.out.println(printEnunciado);
            String escolhaUsuario = leitor.next();
            
            return escolhaUsuario;
            
        } catch (Exception e){
            
            SistemaPerguntaRecorrente(printEnunciado);
            return null;            
        }
    }
    
    
    
    
    public static void PerguntaRecorrenteCarro(int tamanhoLista, String comandoEncerramento){
        
        String opcaoInserida = "";
        
        Scanner leitor = new Scanner(System.in);
        List<CarroClass> carList = CarroClass.createCarroList(tamanhoLista);
        
        int i = 0;
        
        do{
            
            System.out.println("Aplicar Desconto ao proximo carro da Lista?");
            System.out.println("");
            
            opcaoInserida = leitor.next();
            
            if(opcaoInserida.equalsIgnoreCase(comandoEncerramento)){
                break;
            }
            

            
            CarroClass evalCar = carList.get(i);
           
            if(evalCar.getAnoModelo() <= 2000){
                System.out.println("");
                System.out.println("Carro modelo ate 2000");
                evalCar.setDescontoNominal("12%");
                float discount = evalCar.getDescontoReal();
                float fltSalePrice = evalCar.getPrecoTabela() * (1 + discount);
                System.out.println(evalCar.getOpcaoName()+ " recebeu desconto de " + evalCar.getDescontoNominal());
                System.out.println("Preco final: " + String.format("%.2f", fltSalePrice));
               
            } else {
                System.out.println("Carro modelo apos 2000");
                evalCar.setDescontoNominal("7%");
                float discount = evalCar.getDescontoReal();
                float fltSalePrice = evalCar.getPrecoTabela() * (1 + discount);
                System.out.println(evalCar.getOpcaoName()+ " recebeu desconto de " + evalCar.getDescontoNominal());
                System.out.println("Preco final: " + String.format("%.2f", fltSalePrice)); 
                
            }
            
            System.out.println("");
            System.out.println("digite 'n' para encerrar");   
            System.out.println("");
            
            if (carList.size() - 1 == i){
                System.out.println("Fim da Lista");
                break;
            } else {
                i++;
            }
   
        } while(!opcaoInserida.equalsIgnoreCase(comandoEncerramento));
        

        
    
    }
    
    
}
