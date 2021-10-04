package com.Bridgelabz.TicTacToe;

public class TicTacToeGame {
	public static char[] board;
	public static void main(String[] args){
        System.out.println("play game");
        createBoard();
   }
	//creating method createBoard
		public static void createBoard(){
			board = new char[10];
	        	for(int i = 1; i < board.length; i++){
	                	board[i] = ' ';
	        	}
	     }
}
