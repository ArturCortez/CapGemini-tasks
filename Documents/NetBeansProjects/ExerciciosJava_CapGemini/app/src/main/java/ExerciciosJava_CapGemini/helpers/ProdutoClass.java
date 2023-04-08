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
public class ProdutoClass {
    
    String nomeProduto = "";
    int idProduto = 0;
    
    float precoCusto = 0.0f;
    float precoVenda = 0.0f;
    float margemVenda = 0.0f;
    boolean booleanLucro = false;

    //Getters
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    
    public int getIdProduto(){
        return this.idProduto;
    }
    
    public float getPrecoCusto(){
        return this.precoCusto;
    }
    
    public float getPrecoVenda(){
        return this.precoVenda;
    }
    
    public float getMargemVenda(){
        return this.margemVenda;
    }
    
    public boolean getBooleanLucro(){
        return this.booleanLucro;
    }
    
    //setters
    
    public void setIdProduto(int i){
        this.idProduto = i;
    }
    
    public void setNomeProduto(String nome){
        this.nomeProduto = nome.concat(" - ").concat(String.valueOf(this.idProduto));
    }
    
    public void setPrecoCusto(float novoPrecoCusto){
        this.precoCusto = novoPrecoCusto;
    }
    
    public void setPrecoVenda(float novoPrecoVenda){
        this.precoVenda = novoPrecoVenda;
    }
    
    public void setMargemVenda(){
        this.margemVenda = this.precoVenda - this.precoCusto;
    }
    
    public void setBooleanLucro(){
        if(this.getMargemVenda() == 0 || this.getMargemVenda() < 0){
            this.booleanLucro = false;
        } else {
            this.booleanLucro = true;
        }
    }
    
    public static List<ProdutoClass> RandomListProdutoGenerator(int qtdadeProdutos){
        List<ProdutoClass> produtoList = new ArrayList<ProdutoClass>();
        
        System.out.println("Generating List of Products");
        
        for(int i = 0; i < qtdadeProdutos; i++ ){
            ProdutoClass produto = new ProdutoClass();
            produto.setIdProduto(i);
            produto.setNomeProduto("Produto");
            produto.setPrecoCusto(RandomNumberProvider.RandomSingleNumberCreator(20) + 20);
            produto.setPrecoVenda(RandomNumberProvider.RandomSingleNumberCreator(20) + 25);
            produto.setMargemVenda();
            produto.setBooleanLucro();
            produtoList.add(produto);
        }
        
        
        
        return produtoList;
    }
    
    public static void filterProduto(ProdutoClass produto){
        System.out.println(produto.getNomeProduto() + ": " );
        System.out.println("Preco de Custo: " + produto.getPrecoCusto());
        System.out.println("Preco de Venda: " + produto.getPrecoVenda());
        System.out.println("Margem de Venda: " + produto.getMargemVenda());
        
        if(produto.getMargemVenda() > 0){
            System.out.println("Produto gerou lucro");
        } else if(produto.getMargemVenda() < 0){
            System.out.println("Produto deu prejuizo");
        } else {
            System.out.println("Produto gerou empate");
        }
    }
    
    public static void manageListProduto(){
        Scanner leitor = new Scanner(System.in);
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;
        
        System.out.println("Qual o tamanho da Lista de Produtos");
        try{
            int qtdadeProduto = leitor.nextInt();
            List<ProdutoClass> produtoList = RandomListProdutoGenerator(qtdadeProduto);
            
            for(ProdutoClass produto : produtoList){
                filterProduto(produto);
                totalCusto += produto.getPrecoCusto();
                totalVenda += produto.getPrecoVenda();
            }
            
            mediaCusto = (totalCusto / (float) qtdadeProduto);
            mediaVenda = (totalVenda / (float) qtdadeProduto);
            System.out.println("Media de Custos: " + mediaCusto);
            System.out.println("Media de Vendas: " + mediaVenda);
            
        } catch(Exception e){
            System.out.println("Something went wrong. Try again.");
            manageListProduto();
        }
    }
    
    
    
}
