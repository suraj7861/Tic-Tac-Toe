package com.Bridgelabz.TicTacToe;
import java.util.Scanner;
public class TicTacToeGame {
	//global variables
	public static char[] board;
	public static char player, computer;
	
	public static void main(String[] args){
        System.out.println("play game");
        //method calling
        createBoard();
        playerChoice();
        showBoard();
   }
	// method createBoard
		public static void createBoard(){
			//Assign board variable char array
			board = new char[10];
	        	for(int i = 1; i < board.length; i++){
	                	board[i] = ' ';
	        	}
	     }
	
		//method: player choice	
		public static void playerChoice() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter player choise 'X' or 'O'");
			player = sc.next().charAt(0);
			
			//check valid character
			if(player != 'X' && player != 'O') {
				System.out.println("You Enter invalid character, please enter 'X' or 'O' ");
			}
			else if(player == 'X') {	
				computer = 'O';
			}
			else {
				computer = 'X';	
			}
		}
		
		//method show board
		public static void showBoard() {
			//print empty board 
			System.out.println(board[1] + " |" + board[2] + " |" + board[3]);
			System.out.println("--------");
			System.out.println(board[4] + " |" + board[5] + " |" + board[6]);
			System.out.println("--------");
			System.out.println(board[7] + " |" + board[8] + " |" + board[9]);
		}
}
