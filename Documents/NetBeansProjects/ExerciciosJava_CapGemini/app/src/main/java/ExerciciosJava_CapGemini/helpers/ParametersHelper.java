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
public class ParametersHelper {
    public static String[] PopulateParameters(){

            Scanner leitor = new Scanner(System.in); 
            
            System.out.println("Digite o Primeiro valor: ");
            float value1 = leitor.nextFloat();

            System.out.println("Digite o segundo valor: ");
            float value2 = leitor.nextFloat();
            
            NumberArgumentObject objectParameters = new NumberArgumentObject();
                objectParameters.setArg(value1, value2);
                System.out.println(objectParameters.getArg1() + " " + objectParameters.getArg2());
            
            String answer[] = new String[]{String.valueOf(value1), String.valueOf(value2)};
            
            return answer;
        }
    
    
    public static String SingleStrParameter(String header1){

            Scanner leitor = new Scanner(System.in); 
            
            System.out.println(header1);
            String value1 = leitor.nextLine();

            
            return value1;
        }
    

        public static String[] floatPopulateParameters(String header1, String header2){

            Scanner leitor = new Scanner(System.in); 
            
            System.out.println(header1);
            float value1 = leitor.nextFloat();

            System.out.println(header2);
            float value2 = leitor.nextFloat();
            
            NumberArgumentObject objectParameters = new NumberArgumentObject();
                objectParameters.setArg(value1, value2);
                System.out.println(objectParameters.getArg1() + " " + objectParameters.getArg2());
            
            String answer[] = new String[]{String.valueOf(value1), String.valueOf(value2)};
            
            return answer;
        }
        
        public static String[] intPopulateParameters(String header1, String header2){

            Scanner leitor = new Scanner(System.in); 
            
            System.out.println(header1);
            int value1 = leitor.nextInt();

            System.out.println(header2);
            int value2 = leitor.nextInt();
            
            NumberArgumentObject objectParameters = new NumberArgumentObject();
                objectParameters.setArg(value1, value2);
                System.out.println(objectParameters.getArg1() + " " + objectParameters.getArg2());
            
            String answer[] = new String[]{String.valueOf(value1), String.valueOf(value2)};
            
            return answer;
        }
        
        
    
        public static String[] strPopulateParameters(String header1, String header2){

            Scanner leitor = new Scanner(System.in); 
            
            System.out.println(header1);
            String value1 = leitor.nextLine();

            System.out.println(header2);
            String value2 = leitor.nextLine();
            
            String answer[] = new String[]{value1, value2};
            
            return answer;
        }
}
