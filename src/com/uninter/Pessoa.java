package com.uninter;
import java.util.Scanner;

public class Pessoa extends Jogador { //classe herdeira de jogador.
	public Scanner entrada = new Scanner(System.in);
	public int[] tentativa = new int[2];
    
    public Pessoa(int jogador){
    	super(jogador);
        System.out.println("Jogador 'Humano' criado!");
    }
    
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, 1);
    }

    public void Tentativa(Tabuleiro tabuleiro){
    	// Aqui interage com o usuario para saber as coordenadas(linha e coluna) no qual deseja colocar o simbolo
        do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();
                
                if( tentativa[0] > 3 ||tentativa[0] < 1)
                    System.out.println("A Linha é 1, 2 ou 3");
                
            }while( tentativa[0] > 3 ||tentativa[0] < 1);
            
            do{
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();
                
                if(tentativa[1] > 3 ||tentativa[1] < 1)
                    System.out.println(" A Coluna é 1, 2 ou 3");
                
            }while(tentativa[1] > 3 ||tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--; 
            
            if(!checarTentativa(tentativa, tabuleiro))
                System.out.println("Tente outro local.");
        }while( !checarTentativa(tentativa, tabuleiro) );
        
    }
        
}
