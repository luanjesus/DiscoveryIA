/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUANC
 */
public class LerArquivoCSV {
    
    private String linha;
    private String nomeArquivo;
    private ArrayList<Regras> regra;
    
    public LerArquivoCSV(ArrayList<Regras> regras) throws IOException{
        
        String nA = this.nomeArquivo;
        String l = this.linha;
        regra = regras; 
        l = new String();
        nA = "C:\\Users\\LUANC\\Documents\\NetBeansProjects\\DiscoveryIA\\src\\discoveryia\\baseConhecimento.csv";        
        File arquivo = new File(nA);
        
        
        if(arquivo.exists()){
            
            Scanner leitor = new Scanner(arquivo);
            
            leitor.nextLine();//pula o trailer do arquivo

            String reg,per,respt,respf,resut,resuf;
            
            while(leitor.hasNext()){
                
                l = leitor.nextLine();
                
                String[] valorSplit = l.split(",");                
                
                reg = valorSplit[0];                
                per = valorSplit[1];
                respt = valorSplit[2];
                respf = valorSplit[3];
                resut = valorSplit[4];
                resuf = valorSplit[5];
                
                Regras re = new Regras();
                
                re.setRegra(reg);
                re.setPergunta(per);
                re.setVerdadeiro(respt);
                re.setFalso(respf);
                re.setResultadoVerdadeiro(resut);
                re.setResultadoFalso(resuf);
           
                regras.add(re);
                
              
            }
        }
    }
}
