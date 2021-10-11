package com.Bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	public static char[] board;
	public static void main(String[] args){
        System.out.println("play game");
        createBoard();
        playerChoice();
   }
	//creating method createBoard
		public static void createBoard(){
			board = new char[10];
	        	for(int i = 1; i < board.length; i++){
	                	board[i] = ' ';
	        	}
	     }
		
		public static void playerChoice() {
			
			char player1, player2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter player1 choise 'X' or 'O'");
			player1 = sc.next().charAt(0);
			System.out.println("Enter player1 choise 'X' or 'O'");
			player2 = sc.next().charAt(0);
			
			if(player1 == 'X') {
				player1 = 'X';
				player2 = 'O';
				
			}
			else if(player1 == 'O') {
				player1 = 'O';
				player2 = 'X';
				
			}
		}
}
