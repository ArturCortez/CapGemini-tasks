/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.Scanner;

/**
 *
 * @author Juca
 */
public class CalculateSalaryAndComission {
    public static String[] CalculateSalaryComission(){
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do vendedor: ");
        String nomeVendedor = leitor.nextLine();
        
        System.out.println("Digite sal�rio fixo: ");
        String strSalario = leitor.nextLine();
        String strpercentComission = String.valueOf(0.15f);
        
        String arg[] = new String[]{strSalario, strpercentComission};
               
        String relativeComission = CalculaTudo.CalculateAll(arg, 3);
        String arg2[] = new String[]{strSalario, relativeComission};
        String totalSalary = CalculaTudo.CalculateAll(arg2, 1);
        
        String[] answer = new String[]{nomeVendedor, strSalario, totalSalary};
        
        return answer;
    }
    
}
