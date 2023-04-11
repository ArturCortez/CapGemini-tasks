/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Juca
 */
public class CalculateSalaryAndComission {
    
    private String nomeFunc = "";
    private String salarioFunc = "0";
    
    
    public static String[] CalculateSalaryComission(){
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do vendedor: ");
        String nomeVendedor = leitor.nextLine();
        
        System.out.println("Digite salário fixo: ");
        String strSalario = leitor.nextLine();
        String strpercentComission = String.valueOf(0.15f);
        
        String arg[] = new String[]{strSalario, strpercentComission};
               
        String relativeComission = CalculaTudo.CalculateAll(arg, 3);
        String arg2[] = new String[]{strSalario, relativeComission};
        String totalSalary = CalculaTudo.CalculateAll(arg2, 1);
        
        String[] answer = new String[]{nomeVendedor, strSalario, totalSalary};
        
        return answer;
    }
    
    public static String CalculateSalaryRaise(String nomeFuncionario, String salarioFunc, String salarioMin){
        
        float fltSalarioFator = Float.parseFloat(salarioFunc)/ Float.parseFloat(salarioMin);
        
        
        if(fltSalarioFator < 3){
            
            float aumentoDado = 0.50f;
            return String.format(Locale.US,"%.2f" ,(Float.parseFloat(salarioFunc) * (1 + aumentoDado)));
            
        } else if( fltSalarioFator >= 3 && fltSalarioFator < 10){
            
            float aumentoDado = 0.20f;
            return String.format(Locale.US,"%.2f" ,(Float.parseFloat(salarioFunc) * (1 + aumentoDado)));
            
        } else if (fltSalarioFator >= 10 && fltSalarioFator < 20){
            
            float aumentoDado = 0.15f;
            return String.format(Locale.US,"%.2f" ,(Float.parseFloat(salarioFunc) * (1 + aumentoDado)));
            
        } else {
            
            float aumentoDado = 0.10f;
            return String.format(Locale.US,"%.2f" ,(Float.parseFloat(salarioFunc) * (1 + aumentoDado)));
            
        }
        
        
    }
    
}
