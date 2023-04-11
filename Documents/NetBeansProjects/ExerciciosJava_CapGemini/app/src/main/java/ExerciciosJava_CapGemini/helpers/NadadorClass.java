/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juca
 */
public class NadadorClass extends PessoaClass{
    
    private String nivelCompeticao = "idade fora da faixa etária";
    
    
    public String getNivelCompeticao(){
        return this.nivelCompeticao;
    }
    
    
    public void setNivelCompeticao(String novoNivel){
        this.nivelCompeticao = novoNivel;
    }
    
    public static List<NadadorClass> CreateRandomListNadadores(int qtdadePessoas){
        
        List<NadadorClass> pessoaList = new ArrayList<>();
        
        for(int i = 0; i < qtdadePessoas; i++){
            NadadorClass pessoa = new NadadorClass();
            pessoa.setId(i);            
            pessoa.setName(String.valueOf(pessoa.getId()));
            pessoa.setAge(RandomNumberProvider.RandomSingleNumberCreator(30));
            pessoa.setMaioridade( 18);
            pessoa.setRandomGender(RandomNumberProvider.RandomSingleNumberCreator());
            pessoa.setRandomHealth(RandomNumberProvider.RandomSingleNumberCreator());
                        
            pessoaList.add(pessoa);
        }
        
        return pessoaList;
    }
    
}
