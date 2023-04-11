/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

/**
 *
 * @author Juca
 */
public class TriangleClass {
    private int sideA = 0;
    private int sideB = 0;
    private int sideC = 0;
   
    
    public boolean CheckTrianglePossibility(){
         
        if(this.sideA > (this.sideB + this.sideC) || this.sideB > (this.sideA + this.sideC) || this.sideC > (this.sideA + this.sideB)){
            System.out.println("Impossible Triangle");
            return false;
            }
        System.out.println("Possible Triangle");
        return true;
    }
    
    public String DefineTriangleType(){
        if(this.sideA == this.sideB){
            if(this.sideA == this.sideC){
                return "Equilatero";
            } else {
                return "Isoceles";
            }
        } else {
            return "Escaleno";
        }
    }
    
    public TriangleClass(int firstSide, int secondSide, int thirdSide){
        this.sideA = firstSide;
        this.sideB = secondSide;
        this.sideC = thirdSide;
        
        
    }
    

}
    

