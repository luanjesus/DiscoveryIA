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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DiscoveryIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ArrayList<Regras> regras = new ArrayList<Regras>();
        Scanner t = new Scanner(System.in);
        
        System.out.println("*****************************************************************************************\n");        
        System.out.println("                              SEJA BEM VINDO AO DISCOVERY IA                             ");                
        System.out.println("                        UM SISTEMA ESPECIALISTA CAPAZ DE DESCOBRIR                       ");        
        System.out.println("                      QUAL ANIMAL OU OBJETO DE UMA LISTA FOI PENSADO                   \n");  
        System.out.println("*****************************************************************************************\n");
        
        System.out.println("*****************************************************************************************");
        System.out.println("                      PENSE EM UM DOS ITENS DA TABELA ABAIXO                           ");
        System.out.println("*****************************************************************************************");
        System.out.println("|Metro	\t|Tartaruga	|Livro	\t|Video Game	\t|Estojo");
        System.out.println("|Caneta	\t|Pote	        |Formiga	|Pinguim	\t|Pé de pato");
        System.out.println("|Avião	\t|Camarão	|Cobra	\t|Moto	\t\t|Baleia");
        System.out.println("|Copo	\t|Salamandra	|Peixe-Boi	|Gato	\t\t|Lagosta");
        System.out.println("|Navio	\t|Submarino	|Vagalume	|Luva de boxe	\t|Sapo");
        System.out.println("|Panela	\t|Borboleta	|Tênis	\t|Touca de natação	|Aranha");
        System.out.println("|Morcego	|Smartphone	|Escorpião	|Jacaré	\t\t|Barata");        
        System.out.println("|Abelha	\t|Borracha	|Lápis	\t|Garfo	\t\t|Bola");
        System.out.println("|Faca	\t|Águia	\t|Tigre	\t|Avestruz	\t|Piranha");
        System.out.println("|Peixe-Espada	|Computador	|Caranguejo	|Televisão	\t|Aparelho de DVD");
        System.out.println("*****************************************************************************************\n");
        
        System.out.println("Digite 's' ou 'S' para respostas afirmativas");
        System.out.println("Digite 'n' ou 'N' para respostas negativas\n");        
        
         
        MotorInferencia mi = new MotorInferencia(regras,"1");
    }
    
}
