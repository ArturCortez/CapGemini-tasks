/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.*;
import ExerciciosJava_CapGemini.helpers.*;

/**
 *
 * @author Juca
 */
public class FiltroServicoMilitar {
    
    public static void filterPessoa(PessoaClass pessoa){
        System.out.print(pessoa.getName() + " - " + pessoa.getMaioridade() + " - " + pessoa.getGender());
        if(pessoa.getHealth() == true){ System.out.print(" - Saudavel");} else {System.out.print(" - Nao Saudavel");}
        System.out.println("");
        if(pessoa.getGender().equalsIgnoreCase("masculino") && pessoa.getMaioridade().equalsIgnoreCase("maior de idade") && pessoa.getHealth()== true){  
                System.out.println("Apta para o servico militar");
            } else {
                System.out.println("Inapta para o servico militar");
            }
    }
    
    public static void manageList(int qtdNPessoas){
        int counter = 0;
        List<PessoaClass> pessoaList = PessoaClass.CreateRandomListPessoa(30);
      
        for(PessoaClass pessoa : pessoaList.subList(0, qtdNPessoas)){
            filterPessoa(pessoa);
        }
         
    }
    
    public static void interfaceServicoMilitar(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite quantidade N de pessoas");
        try{
            int qtdNPessoas = leitor.nextInt();
            manageList(qtdNPessoas);
            
        } catch (Exception e){
            System.out.println("error. Try again");
            interfaceServicoMilitar();     
        }
        
    }
    
    
    
    
    
    
}
