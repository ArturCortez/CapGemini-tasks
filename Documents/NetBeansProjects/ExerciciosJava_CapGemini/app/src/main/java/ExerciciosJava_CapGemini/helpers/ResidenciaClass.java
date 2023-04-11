/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

/**
 *
 * @author Juca
 */
public class ResidenciaClass {
    
    private String tipoResidencia = "";
    private float custoKWh = 0;
    
    
    public String getTipoResidencia(){
        return this.tipoResidencia;
    }
    
    public float getCustomKWh(){
        return this.custoKWh;
    }
    
    public void setTipoResidencia(String tipoResidenciaArg){
        if(tipoResidenciaArg.equalsIgnoreCase("residencial")){
            this.tipoResidencia = tipoResidenciaArg.toLowerCase();
        } else if (tipoResidenciaArg.equalsIgnoreCase("comercial")){
            this.tipoResidencia = tipoResidenciaArg.toLowerCase();
        } else if (tipoResidenciaArg.equalsIgnoreCase("industrial")){
            this.tipoResidencia = tipoResidenciaArg.toLowerCase();
        } else {
            this.tipoResidencia = "tipoInválido";
        }
    }
    
    public void setCustoKWh(String tipoResidencia){
        if(tipoResidencia.equalsIgnoreCase("residencial")){
            this.custoKWh = 0.60f;
        } else if (tipoResidencia.equalsIgnoreCase("comercial")){
            this.custoKWh = 0.48f;
        } else if (tipoResidencia.equalsIgnoreCase("industrial")){
            this.custoKWh = 1.29f;
        } else {
            this.custoKWh = 0;
        }
    }
    
    public float CalculateTotalCost (float ConsumoMes){
        this.setCustoKWh(this.getTipoResidencia());
        
        return ConsumoMes * this.getCustomKWh();
    }
    
}
