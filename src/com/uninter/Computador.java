package com.uninter;

import java.util.Random;

public class Computador extends Jogador{//classe herdeira de jogador.
    
    public Computador(int nivel){
        super(nivel); // invoca a classe superior, possibilittando utilizar os seus metodos
        this.nivel = nivel; // guarda no atributo nivel o numero vindo do parametro computador
        System.out.println("Jogador 'Computador' criado!");
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
    	Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, 2);
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
    	if(this.nivel == 1) {
    		nivel1(tabuleiro);
    	} else if(this.nivel == 2) {
    		nivel2(tabuleiro);
    	} else {
    		nivel3(tabuleiro);
    	}
        
    }
    
    public void nivel1(Tabuleiro tabuleiro) {
    	// Nesse metodo e os numeros sao escolhidos fixamente e decrescente, de forma que se o campo estiver preenchido ele pula para proximo campo
    	int[] tentativa1 = {0,0};
    	int[] tentativa2 = {0,1};
    	int[] tentativa3 = {0,2};
    	int[] tentativa4 = {1,0};
    	int[] tentativa5 = {1,1};
    	int[] tentativa6 = {1,2};
    	int[] tentativa7 = {2,0};
    	int[] tentativa8 = {2,1};
    	int[] tentativa9 = {2,2};
    	
    	if(checarTentativa(tentativa1, tabuleiro)) {
    		tentativa = tentativa1;
    	} else if (checarTentativa(tentativa2, tabuleiro)) {
    		tentativa = tentativa2;
    	}else if (checarTentativa(tentativa3, tabuleiro)) {
    		tentativa = tentativa3;
    	}else if (checarTentativa(tentativa4, tabuleiro)) {
    		tentativa = tentativa4;
    	}else if (checarTentativa(tentativa5, tabuleiro)) {
    		tentativa = tentativa5;
    	}else if (checarTentativa(tentativa6, tabuleiro)) {
    		tentativa = tentativa6;
    	}else if (checarTentativa(tentativa7, tabuleiro)) {
    		tentativa = tentativa7;
    	}else if (checarTentativa(tentativa8, tabuleiro)) {
    		tentativa = tentativa8;
    	} else {
    		tentativa = tentativa9;
    	}
    }
    
    public void nivel2(Tabuleiro tabuleiro) {
    	// Nesse metodo e os numeros sao escolhidos fixamente
    	int[] tentativa9 = {0,0};
    	int[] tentativa8 = {0,1};
    	int[] tentativa7 = {0,2};
    	int[] tentativa6 = {1,0};
    	int[] tentativa5 = {1,1};
    	int[] tentativa4 = {1,2};
    	int[] tentativa3 = {2,0};
    	int[] tentativa2 = {2,1};
    	int[] tentativa1 = {2,2};
    	
    	if(checarTentativa(tentativa5, tabuleiro)) {
    		tentativa = tentativa5;
    	} else if (checarTentativa(tentativa4, tabuleiro)) {
    		tentativa = tentativa4;
    	}else if (checarTentativa(tentativa7, tabuleiro)) {
    		tentativa = tentativa7;
    	}else if (checarTentativa(tentativa3, tabuleiro)) {
    		tentativa = tentativa3;
    	}else if (checarTentativa(tentativa1, tabuleiro)) {
    		tentativa = tentativa1;
    	}else if (checarTentativa(tentativa6, tabuleiro)) {
    		tentativa = tentativa6;
    	}else if (checarTentativa(tentativa8, tabuleiro)) {
    		tentativa = tentativa8;
    	}else if (checarTentativa(tentativa2, tabuleiro)) {
    		tentativa = tentativa2;
    	} else {
    		tentativa = tentativa9;
    	}
    }
    
    public void nivel3(Tabuleiro tabuleiro) {
    	// Nesse metodo e sorteado numeros aleatorios para a escolha de campos
    	Random rand = new Random();
        boolean loop = true;
        do{
        int move = rand.nextInt(3);
        int move1 = rand.nextInt(3);
        int[] tentativa1 = {move,move1};
        System.out.println(tentativa1[0]);
        System.out.println(tentativa1[1]);
        if(checarTentativa(tentativa1, tabuleiro)) {
        	tentativa = tentativa1;
        	loop = false;
        	}

        }while(loop);

    }
}