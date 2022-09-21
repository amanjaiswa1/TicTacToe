package com.bridgelabz.workshop;

public class TicTacToe {
	public static void game() {
		char[] board= {'0','0','0','0','0','0','0','0','0','0'};
		for (int i=1;i<10;i++) {
			if(i==4 || i==7 ) {
				System.out.println("");
			}
			System.out.print(" "+board[i]);
		}
	}
	
  public static void main(String[] args) {
	  System.out.println("::Welcome to Tic Tac Toe Board::\n");
	  game();
    
  }
}
