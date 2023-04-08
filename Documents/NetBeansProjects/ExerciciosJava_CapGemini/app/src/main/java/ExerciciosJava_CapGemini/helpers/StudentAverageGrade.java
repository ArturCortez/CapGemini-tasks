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
public class StudentAverageGrade {
    
    public static String[] AverageCalculator(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do Aluno: ");
        String studentName = leitor.nextLine();

        System.out.println("Primeira Nota: ");
        float firstGrade = leitor.nextFloat();

        System.out.println("Segunda Nota");
        float secondGrade = leitor.nextFloat();

        System.out.println("Terceira Nota");
        float thirdGrade = leitor.nextFloat();
        
        float finalAvg = (firstGrade + secondGrade + thirdGrade)/3 ;
        String strAvg = String.valueOf(finalAvg);
        
        String[] answer = new String[]{studentName, strAvg};
        
        return answer;
    
    }

    
    
}
