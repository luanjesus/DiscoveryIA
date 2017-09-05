/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryia_master;

/**
 *
 * @author LUANC
 */
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class MotorInferencia {

    /**
     * @param args the command line arguments
     */
    
    private ArrayList<Regras> regra;
    
    public void Pergunta(ArrayList<Regras> r, String per, String respt,String respf, String resut, String resuf, String reg) throws IOException{

        Scanner t = new Scanner(System.in);
        String opcao;
        
        System.out.print(per+"  ");
        
        opcao = t.nextLine();
                    
        if("s".equals(opcao) || "S".equals(opcao)){
            if("0".equals(resut)){
                MotorInferencia mi = new MotorInferencia(r,respt);
            }else{
                System.out.println("\n******** O iten pensado é "+resut+" ********");
                Continuar(r);
            }
        }else if ("n".equals(opcao) || "N".equals(opcao)){
            if("0".equals(resuf)){
                MotorInferencia mi = new MotorInferencia(r,respf);
            }else{
                System.out.println("\n******** O iten pensado é "+resuf+" ********");
                Continuar(r);
            }
        }else{                                                
            System.out.println("\nValor incorreto! \nUtilize o 'S' para sim e 'N' para não.\n");
            MotorInferencia mi = new MotorInferencia(r,reg);
        }
        
         
        
    }
    
    public void Continuar(ArrayList<Regras> r) throws IOException{
        Scanner t = new Scanner(System.in);
        String op;
        
        System.out.print("\nDeseja continuar jogando? "); 
        op = t.nextLine();
        
        if("s".equals(op) || "S".equals(op)){
        
            System.out.println("");
            MotorInferencia mi = new MotorInferencia(r,"1");
        
        }else if("n".equals(op) || "N".equals(op)){
                
            System.out.println("\nObrigado por jogar Discovery IA!");
                    
        }else{
            System.out.println("\nValor incorreto! \nUtilize o 'S' para sim e 'N' para não.\n");
            Continuar(r);    
        }  
    
    }
 
    public MotorInferencia(ArrayList<Regras> r, String proxRegra) throws IOException{
    
        this.regra = r; 
        String reg,per,respt,respf,resut,resuf;
        Regras re = new Regras();
       
        LerArquivoCSV la = new LerArquivoCSV(r);
        
        for(Regras s: r){
            
            reg = s.getRegra();
            per = s.getPergunta();
            respt = s.getVerdadeiro();
            respf = s.getFalso();
            resut = s.getResultadoVerdadeiro();
            resuf = s.getResultadoFalso(); 
            
            if(proxRegra.equals(reg)){
                re.setRegra(reg);
                re.setPergunta(per);
                re.setVerdadeiro(respt);
                re.setFalso(respf);
                re.setResultadoVerdadeiro(resut);
                re.setResultadoFalso(resuf);
            }
        }
        
        reg = proxRegra;
        per = re.getPergunta();
        respt = re.getVerdadeiro();
        respf = re.getFalso();
        resut = re.getResultadoVerdadeiro();
        resuf = re.getResultadoFalso();
        
        switch(proxRegra){
                case "1":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "2":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "3":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "4":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "5":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "6":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "7":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "8":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "9":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "10":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "11":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "12":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "13":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "14":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "15":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "16":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "17":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "18":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "19":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "20":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "21":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "22":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "23":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "24":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "25":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "26":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "27":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "28":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "29":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "30":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "31":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "32":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "33":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "34":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "35":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "36":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "37":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "38":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "39":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "40":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "41":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "42":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "43":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "44":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "45":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "46":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "47":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                    break;
                case "48":
                    Pergunta(r,per,respt,respf,resut,resuf,reg);
                default:
                    break;
        
        
        }
        
            

    }
        
        
}

    
    

