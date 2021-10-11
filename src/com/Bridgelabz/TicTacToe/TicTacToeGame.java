package com.Bridgelabz.TicTacToe;
import java.util.Scanner;

public class TicTacToeGame {
	//global variables
	public static char[] board;
	public static char player, computer;
	
	public static void main(String[] args){
        System.out.println("play game");
        createBoard();
        playerChoice();
   }
	//method: create Board
	public static void createBoard(){
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
}