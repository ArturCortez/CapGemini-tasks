/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.*;

/**
 *
 * @author Juca
 */
public class PessoaClass {
    
    private String name = "Pessoa ";
    private int id = 0;
    private int age = 0;
    private String maioridade = "";
    private String gender = "";
    private boolean boaSaude = false;
    
    public String getName(){
        return this.name;  
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getMaioridade(){
        return this.maioridade;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public boolean getHealth(){
        return this.boaSaude;
    }
    
    //SETTERS
    public void setName(String nameToSet){
        if (name == "Pessoa "){
            this.name = name.concat(nameToSet);
        } else {
            this.name = nameToSet;
        }
    }
    
    public void setId(int newId){
        this.id = newId;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
    
    public void setMaioridade( int idadeMaioridade){
        if (this.getAge() < idadeMaioridade){
            this.maioridade = "menor de idade";
        } else {
            this.maioridade = "maior de idade";
        }
    }
    
    public void setGender(String chosenGender){
        this.gender = chosenGender;
    }
    
    public void setRandomGender(int randomValue){
        if(randomValue >= 0.5f){
            this.gender = "feminino";
        } else {
            this.gender = "masculino";
        }
    }
    
    public void setRandomHealth(int randomValue){
        if(randomValue >= 0.4f){
            this.boaSaude = true;
        }
    }
    
    public static List<PessoaClass> CreateRandomListPessoa(int qtdadePessoas){
        
        List<PessoaClass> pessoaList = new ArrayList<PessoaClass>();
        
        for(int i = 0; i < qtdadePessoas; i++){
            PessoaClass pessoa = new PessoaClass();
            pessoa.setId(i);            
            pessoa.setName(String.valueOf(pessoa.getId()));
            pessoa.setAge(RandomNumberProvider.RandomSingleNumberCreator(80));
            pessoa.setMaioridade( 18);
            pessoa.setRandomGender(RandomNumberProvider.RandomSingleNumberCreator());
            pessoa.setRandomHealth(RandomNumberProvider.RandomSingleNumberCreator());
                        
            pessoaList.add(pessoa);
        }
        
        return pessoaList;
        
    }
    
          
}
