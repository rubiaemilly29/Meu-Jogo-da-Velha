// Reference 
// Scanner: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448

package com.uninter;

import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private int rodada=1, vez=1;
    private Jogador jogador;
    private Jogador jogador2;
    public Scanner entrada = new Scanner(System.in);

    
    public Jogo(){
        tabuleiro = new Tabuleiro(); // instancia o tabuleiro
        iniciarJogadores();
        
        while( Jogar() );
    }
    
    public void iniciarJogadores(){
    	this.jogador = new Pessoa(1); // instancia jogador
        System.out.println("Você é o primeiro a jogar");
        System.out.println("----------------------");
        System.out.println("Qual será o nível de dificuldade do computador?");
        
        // mensagem de nivel de dificuldade
        
        if(escolherNivelComputador() == 1) {
            this.jogador2 = new Computador(1);
        
        } else if(escolherNivelComputador() == 2) {
            	this.jogador2 = new Computador(2);
        } else { this.jogador2 = new Computador(3);}
    }
    
    public int escolherNivelComputador(){ // Metodo que interage com o usuario sabendo qual o nivel de dificuldade do computador 
        int opcao=0;
        boolean loop = true;
        
        do{
            System.out.println("1. Fácil");
            System.out.println("2. Médio");
            System.out.println("3. Difícil\n");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            
            if(opcao != 1 && opcao != 2 && opcao != 3)
                System.out.println("Nível inválido! Tente novamente");
            loop = false;
        }while(loop);
        System.out.print(opcao);
        return opcao;
    }
    
    public boolean Jogar(){
        if(checarTabuleiro() == 0 ){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a vez do jogador " + this.vez );
            
            if(this.vez == 1) {
                jogador.jogar(tabuleiro);
            	this.vez = 2;
            }
            else {
                jogador2.jogar(tabuleiro);
                this.vez = 1;
            }
            
            
            if(this.rodada == 10){
                System.out.println("Deu Velha. Jogo empatado");
                return false;
            }
            rodada++;

            return true;
        } else{
            if(checarTabuleiro() == -1 )
                System.out.println("Você ganhou!");
            else
                System.out.println("Computador ganhou!");
            
            return false;
        }
            
    }
    
    
    public int checarTabuleiro(){
        if(tabuleiro.checarLinhas() == 1)
            return 1;
        if(tabuleiro.checarColunas() == 1)
            return 1;
        if(tabuleiro.checarDiagonais() == 1)
            return 1;
        
        if(tabuleiro.checarLinhas() == -1)
            return -1;
        if(tabuleiro.checarColunas() == -1)
            return -1;
        if(tabuleiro.checarDiagonais() == -1)
            return -1;
        
        return 0;
    }
    
    
}

