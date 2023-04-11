/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

/**
 *
 * @author Juca
 */
public class ProfessorClass extends PessoaClass {
    
    private int professorNivel = 0;
    private int valorHora = 0;
    
    public int getProfessorNivel(){
        return this.professorNivel;
    }
    
    public int getValorHora(){
        return this.valorHora;
    }
    
    
    public void setProfessorNivel (int novoNivel){
        this.professorNivel = novoNivel;
        this.setValorHora();
    }
    
    public void setValorHora(){
        if(this.getProfessorNivel() == 1){
            this.valorHora = 12;
        } else if (this.getProfessorNivel() == 2){
            this.valorHora = 17;
        } else if (this.getProfessorNivel() == 3){
            this.valorHora = 25;
        } else {
            this.valorHora = 0;
        }
    }
    
    public int salarioFinal(int qtdadeHoras){
        return qtdadeHoras * this.getValorHora();        
    }
    
}
