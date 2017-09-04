/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryia;

/**
 *
 * @author LUANC
 */
class Regras { 
    private String regra;
    private String pergunta;
    private String verdadeiro;
    private String falso;
    private String resultadoVerdadeiro;    
    private String resultadoFalso;
    
    public Regras(){ 
    }
    
    public Regras(String r, String p, String v, String f, String rv, String rf){
     this.regra = r;
     this.pergunta = p;
     this.verdadeiro = v;
     this.falso = f;
     this.resultadoVerdadeiro = rv;
     this.resultadoFalso = rf;
    }    
    public void setRegra(String r){
        this.regra = r;
        
    }
    
    
    public void setPergunta(String p){
        this.pergunta = p;
        
       
    }
    
    
    public void setVerdadeiro(String v){
        this.verdadeiro = v;
        
       
    }
    
    
    public void setFalso(String f){
        this.falso = f;
     
    }
    
    public void setResultadoFalso(String rf){
        this.resultadoFalso = rf;
     
    }
    
    public void setResultadoVerdadeiro(String rv){
        this.resultadoVerdadeiro = rv;
     
    }
    
    public String getRegra(){
        return regra;
                
    }
     
    public String getPergunta(){
        return pergunta;
        
    }
    
    public String getVerdadeiro(){
        return verdadeiro;
        
    }
      
    public String getFalso(){
        return falso;
        
    }
    
    
    public String getResultadoFalso(){
        return resultadoFalso;
        
    }
    
    public String getResultadoVerdadeiro(){
        return resultadoVerdadeiro;
        
    }
    
}
