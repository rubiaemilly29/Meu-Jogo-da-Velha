// Reference
// Declaracao de modificador: https://www.devmedia.com.br/metodos-atributos-e-classes-no-java/25404

package com.uninter;

public class Tabuleiro {
    private int[][] tabuleiro= new int[3][3]; // o tabuleiro é uma matriz 3x3
    
    public Tabuleiro(){ // o tabuleiro ao ser instaciado é zerado
        zerarTabuleiro();
    }
    
    public void zerarTabuleiro(){
        for(int linha=0 ; linha<3 ; linha++) //passa pela horizontal
            for(int coluna=0 ; coluna<3 ; coluna++) // passa pela vertical
                tabuleiro[linha][coluna]=0;
    }
    
    public void exibeTabuleiro(){
    	// imprime no console as linhas e colunas referente a:
    	//-1 = X - Jogador humano
    	//1 = O - Computador
    	//0 = " " - Espa�o vazio
        System.out.println();

        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){
                
                if(tabuleiro[linha][coluna]==-1){
                    System.out.print(" X ");
                }
                if(tabuleiro[linha][coluna]==1){
                    System.out.print(" O ");
                }
                if(tabuleiro[linha][coluna]==0){
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }

    public int getPosicao(int[] tentativa){ // busca uma posicao no tabuleiro
        return tabuleiro[tentativa[0]][tentativa[1]];
    }
    
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador == 1)
            tabuleiro[tentativa[0]][tentativa[1]] = -1;
        else
            tabuleiro[tentativa[0]][tentativa[1]] = 1;
        
        exibeTabuleiro();
    }

    public int checarLinhas(){
        for(int linha=0 ; linha<3 ; linha++){

            if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3)
                return -1;
            if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checarColunas(){
        for(int coluna=0 ; coluna<3 ; coluna++){

            if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3)
                return -1;
            if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checarDiagonais(){
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
            return -1;
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
            return 1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
            return -1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
            return 1;
        
        return 0;
    }
    
}
