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
public class CarroClass {
    
    
    private String opcaoName = "Carro ";
    private int id = 0;
    private int anoModelo = 0;
    private String strDescontoNominal = "";
    private float descontoReal = 0.0f;
    private float precoTabela = 0;
    private String tipoCombustivel = "";
    
    
    
    
    
    public String getOpcaoName(){
        return this.opcaoName;
    }
    
    public String getDescontoNominal(){
        return this.strDescontoNominal;
    }
    
    public float getDescontoReal(){
        return this.descontoReal;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getAnoModelo(){
        return this.anoModelo;
    }
    
    public float getPrecoTabela(){
        return this.precoTabela;
    }
    
    public String checkTipoCombustivel(String tipoCombustivel){
        if(tipoCombustivel.equalsIgnoreCase("gasolina")){
            return "gasolina";
        } else if (tipoCombustivel.equalsIgnoreCase("alcool")){
            return "alcool";
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")){
            return "diesel";
        } else {
            System.out.println("erro na checagem do tipo de combustivel");
            return null;
        }
    }
    
    public void setId(int idInserido){
        this.id = idInserido;        
    }
    
    public void setOpcaoName(String opcaoDigitada){
        this.id += 1;
        this.opcaoName = opcaoDigitada.concat(" - ").concat(String.valueOf(this.getId()));
    }
    
    public void setDescontoReal(float fltDescontoInserido){
        this.descontoReal = fltDescontoInserido;
    }
    
    public void setDescontoNominal(String strDescontoInserido){
        this.strDescontoNominal = strDescontoInserido;
        if(strDescontoInserido.endsWith("%")){
            String descontoSplit = strDescontoInserido.split("%")[0];
            float fltDesconto = Float.parseFloat(descontoSplit);
            fltDesconto = fltDesconto/100;
            this.setDescontoReal(fltDesconto);
        }
        else {
            float fltDesconto = Float.parseFloat(strDescontoInserido);
            this.setDescontoReal(fltDesconto);
        }
    }
    
    public void setAnoModelo(int anoInserido){
        this.anoModelo = anoInserido;
    }
    
    public void setPrecoTabela(float PrecoInserido){
        this.precoTabela = PrecoInserido;
    }
    
    public void setTipoCombustivel(String novoTipoCombustivel){
        if(novoTipoCombustivel.equalsIgnoreCase("gasolina")){
            this.tipoCombustivel = novoTipoCombustivel;
        } else if(novoTipoCombustivel.equalsIgnoreCase("alcool")){
            this.tipoCombustivel = novoTipoCombustivel;
        } else if(novoTipoCombustivel.equalsIgnoreCase("diesel")){
            this.tipoCombustivel = novoTipoCombustivel;
        } else {
            System.out.println("Tipo de combustivel invalido.");
        }
    }
    
    public void setDescontoTipoCombustivel(String novoTipoCombustivel){
        this.setTipoCombustivel(novoTipoCombustivel);
        if(this.checkTipoCombustivel(tipoCombustivel).equalsIgnoreCase("gasolina")){
            this.setDescontoNominal("21%");
        } else if(this.checkTipoCombustivel(tipoCombustivel).equalsIgnoreCase("alcool")){
            this.setDescontoNominal("25%");
        } else if(this.checkTipoCombustivel(tipoCombustivel).equalsIgnoreCase("diesel")){
            this.setDescontoNominal("14%");
        } else {
            System.out.println("Erro na funcao setDescontoTipoCombustivel");
        }
        
            
    }
    
    public static List<CarroClass> createCarroList(int qtdadeRegistrosDeCarro){
        
        List<CarroClass> carroList = new ArrayList<CarroClass>();
        
        for(int i = 0; i < qtdadeRegistrosDeCarro; i++){
            CarroClass carro = new CarroClass();
            carro.setId(i);   
            carro.setOpcaoName("Carro");
            
            float precoCarro = 20000 + RandomNumberProvider.RandomSingleNumberCreator(100000);
            carro.setPrecoTabela(precoCarro);
            
            int anoCarro = 1985 + RandomNumberProvider.RandomSingleNumberCreator(30);
            carro.setAnoModelo(anoCarro);
            
            carroList.add(carro);            
        }
        return carroList;
    }
}
