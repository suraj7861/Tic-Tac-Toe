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
        showBoard();
        moveToDesireLocation();
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

	//method show board
	public static void showBoard() {
		//print empty board 
		System.out.println(board[1] + " |" + board[2] + " |" + board[3]);
		System.out.println("--------");
		System.out.println(board[4] + " |" + board[5] + " |" + board[6]);
		System.out.println("--------");
		System.out.println(board[7] + " |" + board[8] + " |" + board[9]);
	}
	
	//method: move to desired location
	public static void moveToDesireLocation() {
		System.out.println("Please enter desired location between 1 to 9");
		Scanner sc = new Scanner(System.in);
		int location = sc.nextInt();
		//switch case to select location
		switch(location) {
		case 1:
			board[1] = player;
			break;
		case 2:
			board[2] = player;
			break;
		case 3:
			board[3] = player;
			break;
		case 4:
			board[4] = player;
			break;
		case 5:
			board[5] = player;
			break;
		case 6:
			board[6] = player;
			break;
		case 7:
			board[7] = player;
			break;
		case 8:
			board[8] = player;
			break;
		case 9:
			board[9] = player;
			break;
		default:
			System.out.println("Enter valid number");
		}
	}

}