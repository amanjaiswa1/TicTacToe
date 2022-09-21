package com.bridgelabz.workshop;

import java.util.Scanner;

public class TicTacToe {  
	static char[] board=new char[10];
	
	//Use Case 1: To generate an empty board.
	public static void game() {
		for (int i=1;i<10;i++) {
			board[i]=' ';
			if(i==4 || i==7 ) {
				System.out.println("");
			}
			System.out.print("|"+board[i]+"|");
		}
		System.out.println("");
	}
	
	//Use Case 2: To choose a letter X or O.
	public static void useCaseTwo() {
		System.out.println("\nChoose a letter:: X or O ::");
		Scanner s=new Scanner(System.in);
		char option=s.next().charAt(0);		//store the choice which user has entered
		
		char playerOne = 0, computer=0;		//initializing both with zero
		
		//checking if the entered choice is correct or not
		if(option=='X' || option=='O') {
			playerOne=option;
		}
		else{
			System.out.println("Enter a valid Choice.");
			}
		
		//assigning value according to the choice 
		if(playerOne=='X') {
			computer='O';
		}
		else if(playerOne=='O') {
			computer='X';
		}
		
		//printing the alloted choices
		System.out.println("Player has chosen:: "+playerOne);	
		System.out.println("Computer has alloted:: "+computer);
	}
  public static void main(String[] args) {
	  System.out.println("::Welcome to Tic Tac Toe Board::\n");
	  game();
	  useCaseTwo();
  }
}
