package com.uninter;

public abstract class Jogador {//classe abstrata que herda seus metodos
	 protected int[] tentativa = new int[2];
	    protected int nivel;

	    
	    public Jogador(int nivel){
	        this.nivel = nivel;
	    }
	    
	    public abstract void jogar(Tabuleiro tabuleiro);
	    
	    public abstract void Tentativa(Tabuleiro tabuleiro);

	    public boolean checarTentativa(int[] tentativa, Tabuleiro tabuleiro){
	        if(tabuleiro.getPosicao(tentativa) == 0)
	            return true;
	        else
	            return false;
	            
	    }
}
